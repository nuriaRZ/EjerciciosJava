package programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas;

import javax.swing.JOptionPane;

public class Cuest_V_o_F extends Cuestion {
	private Cuestion cuestion1;
	private Cuestion cuestion2;

	public Cuest_V_o_F() {
		
	}
	
	public void elegirOpcion() {
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("1-> verdadero \n2->Falso"));
		
		
		
	}

}
