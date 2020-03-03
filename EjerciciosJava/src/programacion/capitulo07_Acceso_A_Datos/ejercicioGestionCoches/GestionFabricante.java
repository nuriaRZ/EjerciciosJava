package programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches;

import java.text.ParseException;
import java.util.List;

import programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.Fabricante;
import programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.controladores.ControladorFabricante;
import programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.controladores.ErrorBBDDException;


public class GestionFabricante {

	/**
	 * @throws ParseException 
	 * 
	 */
	public static void menuGestion() throws ParseException {

		int opcionElegida = -1;
		do {
			try {
				System.out.println("\n\t\t\tGESTI�N DE FABRICANTES");
				
				System.out.println("\n\t1.- Listado de fabricantes.");
				System.out.println("\t2.- Alta de fabricante.");
				System.out.println("\t3.- Modificaci�n de fabricante.");
				System.out.println("\t4.- Baja de fabricante.");
				System.out.println("\t0.- Salir");
				System.out.println("\n\tElija una opci�n: ");
				
				opcionElegida = Utils.getIntConsola(0, 4);
				
				switch (opcionElegida) {
				case 0:
					Menu.menuPrincipal();
				case 1:
					listado(true);
					break;
				case 2: 
					alta();
					break;
				case 3: 
					modificacion();
					break;
				case 4: 
					baja();
					break;
				}
			} catch (ErrorBBDDException e) {
				System.out.println("\n\t\t\tError de acceso a datos: " + e.getMessage() + "\n");
				e.printStackTrace();
			}
		} while (opcionElegida != 0);
	}

	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	public static void listado(boolean pausafinal) throws ErrorBBDDException {
		List<Fabricante> fabricantes = ControladorFabricante.getAll();
		System.out.println("\n\tListado de fabricantes: \n");
		for (Fabricante fab : fabricantes) {
			System.out.println("\t" + fab.toString());
		}
		if (pausafinal) {
			System.out.println("\n\tPulse 'Intro' tecla para continuar");
			Utils.pausa();
		}
	}
	
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void alta () throws ErrorBBDDException {
		System.out.println("\n\tAlta de fabricante\n");
		
		Fabricante fab = new Fabricante();
		System.out.print("\nIntroduzca 'CIF' del fabricante: ");
		fab.setCif(Utils.getStringConsola());
		System.out.print("\nIntroduzca 'Nombre' del fabricante: ");
		fab.setNombre(Utils.getStringConsola());
		
		ControladorFabricante.almacenar(fab);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}



	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion () throws ErrorBBDDException {
		System.out.println("\n\tModificaci�n de fabricante\n");
		
		Fabricante fab = seleccionPorUsuario();
		
		if (fab != null) {		
			System.out.print("\nIntroduzca 'CIF' del fabricante ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			if (!str.equals("")) 
				fab.setCif(str);
			System.out.print("\nIntroduzca 'Nombre' del fabricante  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				fab.setNombre(str);
		
			ControladorFabricante.almacenar(fab);  

			System.out.println("\n\tModificado correctamente!. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
	}

	
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja () throws ErrorBBDDException {
		System.out.println("\n\tBaja de fabricante\n");
		
		Fabricante fab = seleccionPorUsuario();
		
		if (fab != null) {		
			System.out.print("\n�Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorFabricante.eliminar(fab);  
				System.out.println("\n\tEliminado correctamente!. Pulse 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}

	
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Fabricante seleccionPorUsuario () throws ErrorBBDDException {
		Fabricante fab = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del fabricante ('-1' - ver listado, '0' - salir): ");
			id = Utils.getIntConsola(-1);
			if (id == -1) {
				listado(false);
			}
			else {
				if (id != 0) {
					fab = ControladorFabricante.get(id);
					if (fab == null) {
						System.out.println("\tError. Ha especificado un ID inv�lido.");
					}
				}
			}
		} while (fab == null && id != 0);
		return fab;
	}
}
