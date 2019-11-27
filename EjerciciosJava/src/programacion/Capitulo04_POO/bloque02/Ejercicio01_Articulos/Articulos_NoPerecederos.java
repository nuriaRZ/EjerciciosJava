package programacion.Capitulo04_POO.bloque02.Ejercicio01_Articulos;

public class Articulos_NoPerecederos extends Articulos {
	/**
	 * 
	 */
	public Articulos_NoPerecederos () {
		
	}
	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */

	public Articulos_NoPerecederos(String codigo, String nombre, float precio) {
		super(codigo, nombre, precio);
		
	}
	@Override
	public String toString() {
		return "Articulos_NoPerecederos [getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getPrecio()="
				+ getPrecio() + "]";
	}
	

}
