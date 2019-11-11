package programacion.Capitulo04_POO.Ejercicio03;

import javax.swing.JOptionPane;

public class Persona_Main {

	public static void main(String[] args ) {
		int eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea crear nuevo usuario?"
										+ "\n0->Si\n1->No"));
		if (eleccion==0) {
		Persona nuevoUsuario = new Persona(JOptionPane.showInputDialog("Introduzca su nombre"), JOptionPane.showInputDialog("Introduzca sus apellidos"), JOptionPane.showInputDialog("Introduzca su DNI"), JOptionPane.showInputDialog("Introduzca su direccion"), Integer.parseInt(JOptionPane.showInputDialog("Introduzca su telefono")));		
			nuevoUsuario.imprimirDatos();
		}
		else return;

	}

}
