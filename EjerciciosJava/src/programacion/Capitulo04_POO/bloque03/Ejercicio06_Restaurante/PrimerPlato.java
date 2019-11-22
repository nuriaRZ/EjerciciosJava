package programacion.Capitulo04_POO.bloque03.Ejercicio06_Restaurante;

public class PrimerPlato extends Plato {
	
	private String bebida;
	/**
	 * 
	 */
	
	public PrimerPlato () {
		super();
	}
	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param precio
	 */
	
	public PrimerPlato (String nombre, float precio, String bebida) {
		super(nombre, precio);
		this.bebida = bebida;
		
	}
	

}
