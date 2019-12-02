package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public class Joya extends Antiguedad {
	
	private String material;
	
	public Joya () {
		
	}
	/**
	 * 
	 * @param anioFabricacion
	 * @param origen
	 * @param precioVenta
	 * @param material
	 */

	public Joya(int anioFabricacion, String origen, float precioVenta, String material) {
		super(anioFabricacion, origen, precioVenta);
		this.material = material;
		
	}
	

	@Override
	public String toString() {
		return "Joya [material=" + material + ", getAnioFabricacion()=" + getAnioFabricacion() + ", getOrigen()="
				+ getOrigen() + ", getPrecioVenta()=" + getPrecioVenta() + "]";
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	

}
