package programacion;

import javax.swing.JOptionPane;

public class Utils {

	
	public static int obtenerNumUsuario (String mensaje) {
		int num= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return num;
	}
	/**
	 * 
	 */
	public static int obtenerNumUsuario() {
		int num= Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
		return num;
	}
	/**
	 * 
	 */
	public static int obtenerNumUsuarioEntreLimites (String mensaje, int minimo, int maximo ) {
		
		int num;
		String mensajeError="";
		
		do {
			 num=Integer.parseInt(JOptionPane.showInputDialog(mensajeError+mensaje));
			 if (num<minimo || num>maximo) {
				 mensajeError= "El numero debe estar entre el "+minimo+ "y el "+maximo;
			 }
		} while (num<minimo || num >maximo);
		return num;
	}	
	

}
