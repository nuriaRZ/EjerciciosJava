package programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas;

public class Principal {

	public static void main(String[] args) {
		
		Cuestion cuestiones[] = new Cuestion[5];
		int contador = 0;
		
		cuestiones[0] = new Verd_o_Falso("Madrid es la capital de España", 1); 
		cuestiones[1] = new Verd_o_Falso("Reciclar es necesario", 1);
		cuestiones[2] = new Verd_o_Falso("La cerveza es buena para la migraña", 2);
		cuestiones[3] = new Opc_Correcta("¿Cual es la capital de España?", 3, new String[] {"Sevilla", "Barcelona", "Madrid", "Murcia"} ); 
		cuestiones[4] = new Opc_Correcta("¿Cual es la red Social antes creada?", 1, new String[] {"Facebook", "Twitter", "Tuenti", "Instagram"} );
		
		for (int i = 0; i < cuestiones.length; i++) {
			if(cuestiones[i].evaluarRespuesta(cuestiones[i].mostrarEnPantalla())) {
				System.out.println("Has acertado");
				contador++;
			}
			else System.out.println("Has fallado");
		}
		System.out.println("Respuestas acertadas: "+ contador);

		

	}

}
