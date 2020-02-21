package programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GestionFabricante {

	public static void menuFabricante(Connection conn) throws SQLException {
		Scanner sc;
		int opcion;
		do {
			System.out.println("GESTION DE FABRICANTE: "+
					"\n1.-Listado de Fabricantes."+
					"\n2.- Alta a un Fabricante"+
					"\n3.- Modificar un Fabricante"+
					"\n4.- Baja a un Fabricante"+					
					"\n Pulse 0 para salir");
			
				sc = new Scanner(System.in);
				opcion = sc.nextInt();
			switch (opcion) {
			case 1:
					listadoDeDatos(conn);
				break;
			case 2:
				addFabricante(conn);
				break;
				
			case 3:
				updateFabricante(conn);
				break;

			default:
				break;
			}
			
		}while (opcion != 0);

	}
	
	private static void listadoDeDatos(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		
		ResultSet rs = s.executeQuery("select * from fabricante");
		
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString(2)
			+ " " + rs.getString(3) );
		}
		rs.close();
		s.close();		
	}
	
	private static void addFabricante(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un id para el fabricante");
		int id = sc.nextInt();
		System.out.println("Introduce un cif para el fabricante");
		String cif = sc.next();
		System.out.println("Introduce un nombre para el fabricante");
		String nombre = sc.next();
		
		String sql ="INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " +
				"VALUES  (" + id + ", '" + cif + "', '" + nombre + "')";
		s.executeUpdate(sql);
	
		s.close();
		
	}
	
	private static void updateFabricante(Connection conn) throws SQLException {
		
		Statement s = (Statement) conn.createStatement();
		int opcion;
		Scanner sc = new Scanner(System.in);
		int id;
		do {			
			System.out.println("Introduzca id del fabricante a modificar"+
					"\n-1 Para ver listado de fabricantes, 0- Para salir");
			
			 id = sc.nextInt();
			
			switch (id) {
			case -1:
				listadoDeDatos(conn);
				break;
			case 0:
				break;
	
			default:
				break;
			}
			
			getID(conn, id);
			System.out.println(id);
		}while (id != 0);
				
		
		
				
	}
	
	private static  void getID(Connection conn, int id) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		ResultSet rs;
		boolean idExistente = false;
		
		do {
			System.out.println("entro a consulta");
			
			rs= s.executeQuery("select * from tutorialjavacoches.fabricante where id ="+ id);
			
			
		}while(!rs.next());
		
		s.close();
		rs.close();
		
	}
	
	

}
