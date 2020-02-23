package programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas.Opc_Correcta;

public class Menu {
	
	public static void menuPrincipal(Connection conn) throws SQLException {
		Scanner sc;
		int opcion;
		do {
			System.out.println("GESTION DE VENTAS: "+
					"\n1.-Gestion de Fabricantes."+
					"\n2.- Gestion de ___________"+
					"\n3.- Gestion de ___________"+
					"\n4.- Gestion de ___________"+
					"\n5.- Gestion de ___________"+
					"\n Pulse 0 para salir");
			
			 sc = new Scanner(System.in);
			
			  opcion = sc.nextInt();
			  System.out.println("opcion: "+ opcion);	  
				
				switch (opcion) {
				case 0:
					System.out.println("Adios");
					break;
					
				case 1:
					GestionFabricante.menuFabricante(conn);	
				
				default: 	
					if(opcion > 5 || opcion < 0) {
						System.out.println("Elija una de las opciones existentes...");
					}
			
				}
				
					
				System.out.println();
			
		}while(opcion != 0);


	}

	public static void main(String[] args) {
		
		try {			
			Connection conn;
			conn = ConnectionManagerV2.getConexion();
			menuPrincipal(conn);
			System.out.println("Conexión con BBDD de COCHES");
		} catch (SQLException  | ImposibleConectarException e) {
			
			e.printStackTrace();
		
		}
	}

}
