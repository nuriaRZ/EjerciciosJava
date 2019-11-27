package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public class Joyas extends Antiguedades {
	
	private String material;
	
	public Joyas () {
		
	}

	public Joyas(int anioFabricacion, String origen, float precioVenta, String material) {
		super(anioFabricacion, origen, precioVenta);
		this.material = material;
		
	}
	

	@Override
	public String toString() {
		return "Joyas [material=" + material + ", getAnioFabricacion()=" + getAnioFabricacion() + ", getOrigen()="
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
