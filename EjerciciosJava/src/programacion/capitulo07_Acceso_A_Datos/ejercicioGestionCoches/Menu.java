package programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas.Opc_Correcta;
import programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.controladores.ConnectionManagerV2;
import programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.controladores.ErrorBBDDException;
import programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.controladores.ImposibleConectarException;

public class Menu {
	
	public static void menuPrincipal() throws ParseException {
		Scanner sc;
		int opcion;
		do {
			System.out.println("GESTION DE VENTAS: "+
					"\n1.-Gestion de Fabricantes."+
					"\n2.- Gestion de Concesionario."+
					"\n3.- Gestion de Clientes."+
					"\n4.- Gestion de Coches."+
					"\n5.- Gestion de Ventas."+
					"\n Pulse 0 para salir");
			
			 sc = new Scanner(System.in);
			
			  opcion = sc.nextInt();
			  System.out.println("opcion: "+ opcion);	  
				
				switch (opcion) {
				case 0:
					System.out.println("Adios");
					break;
					
				case 1:
					GestionFabricante.menuGestion();
				
				case 2: 
					GestionConcesionario.menu();
					
				case 3:
					GestionCliente.menu();
					
				case 4:
					GestionCoche.menu();
				
				case 5:
					GestionVenta.menu();
				
				default: 	
					if(opcion > 5 || opcion < 0) {
						System.out.println("Elija una de las opciones existentes...");
					}
			
				}
				
					
				System.out.println();
			
		}while(opcion != 0);


	}

	public static void main(String[] args) throws ParseException {
		
		
			menuPrincipal();
			
		
	}

}
