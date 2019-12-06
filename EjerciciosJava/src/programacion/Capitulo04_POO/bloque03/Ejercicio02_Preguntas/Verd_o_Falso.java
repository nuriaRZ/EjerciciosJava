package programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas;

import javax.swing.JOptionPane;

public class Verd_o_Falso extends Cuestion {
	
	public Verd_o_Falso() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param enunciado
	 * @param respCorrecta
	 * @param respUsuario
	 */
	public Verd_o_Falso(String enunciado, int respCorrecta) {
		super(enunciado, respCorrecta);
		this.enunciado = enunciado;
		
	}
	/**
	 * @param enunciado
	 * @param respCorrecta
	 */
	


	@Override
	public int mostrarEnPantalla() {
		return Integer.parseInt(JOptionPane.showInputDialog(this.enunciado + "\n1.-Verdadero\n2.-Falso"));
	}
	/**
	 * @param enunciado
	 * @param respCorrecta
	 * @param respUsuario
	 */
	

	



}
