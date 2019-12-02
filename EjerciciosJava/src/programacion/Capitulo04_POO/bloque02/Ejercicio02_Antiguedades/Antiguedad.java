package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public abstract class Antiguedad {

	private int anioFabricacion;
	private String origen;
	private float precioVenta;
	
	public Antiguedad() {
		
	}
	/**
	 * @param anioFabricacion
	 * @param origen
	 * @param precioVenta
	 */
	
	public Antiguedad(int anioFabricacion, String origen, float precioVenta) {
		super();
		this.anioFabricacion = anioFabricacion;
		this.origen = origen;
		this.precioVenta = precioVenta;
	}
	/**
	 * 
	 */

	/**
	 * @return the anioFabricacion
	 */
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	/**
	 * @param anioFabricacion the anioFabricacion to set
	 */
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * @return the precioVenta
	 */
	public float getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public String toString() {
		return "Antiguedad [anioFabricacion=" + anioFabricacion + ", origen=" + origen + ", precioVenta="
				+ precioVenta + "]";
	}
	

}
