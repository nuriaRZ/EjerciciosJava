package programacion.capitulo07_Acceso_A_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio01_Consulta_Coches {

	private static void primeraConsulta() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //comprueba si tenemos acceso a la BBDD
			
			Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
			
			Statement s = (Statement) conexion.createStatement();
			
			ResultSet rs = s.executeQuery("select * from cliente where nombre like 'P%'");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString(2)
				+ " " + rs.getString(3) + " " + rs.getString(4) +
				" " + rs.getString(5));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("No se ha podido acceder a la BBDD");
		}
		catch (SQLException e) {
			System.out.println("Error en la ejecución SQL: "+ e.getMessage());
		}
	}

	public static void main(String[] args) {
		primeraConsulta();

	}

}
