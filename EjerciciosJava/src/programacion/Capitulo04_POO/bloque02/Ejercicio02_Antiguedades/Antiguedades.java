package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public abstract class Antiguedades {
	protected  Antiguedades joya;
	protected  Antiguedades cuadro;
	protected  Antiguedades libro;
	protected  Antiguedades mueble;
	protected int anioFabricacion;
	protected String origen;
	protected float precioVenta;
	/**
	 * @param anioFabricacion
	 * @param origen
	 * @param precioVenta
	 */
	public Antiguedades(int anioFabricacion, String origen, float precioVenta) {
		super();
		this.anioFabricacion = anioFabricacion;
		this.origen = origen;
		this.precioVenta = precioVenta;
	}
	/**
	 * 
	 */
	public Antiguedades (Antiguedades joya, Antiguedades cuadro, Antiguedades libro, Antiguedades mueble) {
		super();
		this.joya = joya;
		this.cuadro = cuadro;
		this.libro = libro;
		this.mueble = mueble;
		
	}
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
		return "Antiguedades [anioFabricacion=" + anioFabricacion + ", origen=" + origen + ", precioVenta="
				+ precioVenta + "]";
	}
	

}
