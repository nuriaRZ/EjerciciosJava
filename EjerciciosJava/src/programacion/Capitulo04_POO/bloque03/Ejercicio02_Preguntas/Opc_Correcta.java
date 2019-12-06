package programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas;

import javax.swing.JOptionPane;

public class Opc_Correcta extends Cuestion {

	private String opciones[];
	

	public Opc_Correcta() {
		
	}	

	/**
	 * @param enunciado
	 * @param respCorrecta
	 */
	public Opc_Correcta(String enunciado, int respCorrecta, String opciones[]) {
		super(enunciado, respCorrecta);
		this.opciones = opciones;
		
		
	}
	
	@Override
	public int mostrarEnPantalla() {
		String enunciado = this.enunciado;
		for (int i = 0; i < this.opciones.length; i++) {
			enunciado = enunciado + "\n" + (i+1) + "-" + this.opciones[i];
		}
		return Integer.parseInt(JOptionPane.showInputDialog(enunciado));
	}



}
