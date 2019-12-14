package programacion.Examen2.ExamenFregadero;

import java.io.ObjectInputStream.GetField;

public class Principal {

	public static void main(String[] args) {
		Fregadero fregadero = new Fregadero();
		
		fregadero.limpiarHastaQuedarLimpio();
		
		//IMPRIMIR ESTADISTICAS
		System.out.println();
		System.out.println();
		System.out.println("Utensilio con menor num de pasadas:"
				+ "\t"+fregadero.getUtensilioConMenorPasadas());
		System.out.println();
		System.out.println("Utensilio con mayor num de pasadas:"
				+ "\t"+fregadero.getUtensilioConMayorPasadas());
		
	}

}
