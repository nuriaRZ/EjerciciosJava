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
				
			case 4:
				removeFabricante(conn);
			
			case 0: Menu.menuPrincipal(conn); break;

			
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
		System.out.println();
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
		int id;
		
		int idEnTabla;
		boolean cifEditado = true, nombreEditado = true;
		
			
		do {			
			idEnTabla=getIdEnTabla(conn);
			Scanner sc = new Scanner(System.in);
			
			String sql;
			System.out.println("Introduzca el nuevo CIF, 0 para no modificar");
			String cif = sc.next();	
			if (cif.equals(String.valueOf(0))) cifEditado = false;
			System.out.println("Introduzca el nuevo nombre, 0 para no modificar");
			String nombre = sc.next();	
			if (nombre.equals(String.valueOf(0))) nombreEditado = false;
			
			
			if (cifEditado && nombreEditado) {
				sql= "update fabricante set cif= '"+cif+"',nombre= '"+nombre+"' where id= "+ idEnTabla+";";
			}
			else {
				if (cifEditado) {
					sql= "update fabricante set cif= '"+cif+"' where id= "+ idEnTabla+";";
				}
				else {
					sql= "update fabricante set nombre= '"+nombre+"' where id= "+ idEnTabla+";";
				}
			}
			
			s.execute(sql);
			 s.close();
			
		}while(idEnTabla != 0);
				
	}
	/**
	 * 
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	
	private static  int getIdEnTabla(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		ResultSet rs;
		int idEnTabla = 0;
		int id;
		
		
			boolean idValido = true;
			
			
			System.out.println("System.out.println(\"Introduzca id del fabricante" + 
										"\n-1) Para ver listado de fabricantes, 0) Para salir");
			Scanner sc = new Scanner(System.in); 
			id = sc.nextInt();
			switch (id) {
			case -1:
				listadoDeDatos(conn);
				
				
			case 0: menuFabricante(conn);
				

			default:
				do {
					
					
					rs= s.executeQuery("select id from tutorialjavacoches.fabricante order by id");
					
					while(rs.next()) {
						idValido = false;
						if (id == rs.getInt(1)) {
							
							idValido = true;
							idEnTabla = rs.getInt(1);
						}
					}
					
					
				}while(!idValido);
				s.close();
				rs.close();
				
			}
			
		
		

		return idEnTabla;
		
	}
	
	private static void removeFabricante(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		int id;
		
		int idEnTabla;
		boolean cifEditado = true, nombreEditado = true;
			
		do {			
			idEnTabla=getIdEnTabla(conn);
			Scanner sc = new Scanner(System.in);
			
			String sql;
			sql= "delete from fabricante where id="+ idEnTabla+";";
			
			System.out.println("Dato borrado");
			s.execute(sql);
			 s.close();
			
		}while(idEnTabla != 0);
		
		
		
	}
	
	

}
