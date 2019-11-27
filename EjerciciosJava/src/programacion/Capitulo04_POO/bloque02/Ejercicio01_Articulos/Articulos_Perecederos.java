package programacion.Capitulo04_POO.bloque02.Ejercicio01_Articulos;

public class Articulos_Perecederos extends Articulos {
	
	private String fecha_caducidad;
	
	public Articulos_Perecederos () {
		
	}
	
	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param fecha_caducidad
	 */
	
	public Articulos_Perecederos(String codigo, String nombre, float precio, String fecha_caducidad) {
		super(codigo, nombre, precio);
		this.fecha_caducidad = fecha_caducidad;
	}
	/**
	 * 
	 */	

	@Override
	public String toString() {
		return "Articulos_Perecederos [fecha_caducidad=" + fecha_caducidad + ", getCodigo()=" + getCodigo()
				+ ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}

	/**
	 * @return the fecha_caducidad
	 */
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}


	/**
	 * @param fecha_caducidad the fecha_caducidad to set
	 */
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	

}
