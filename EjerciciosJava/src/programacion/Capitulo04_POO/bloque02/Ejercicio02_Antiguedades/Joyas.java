package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public class Joyas extends Antiguedades {
	
	private String material;

	public Joyas(int anioFabricacion, String origen, float precioVenta, String material) {
		super(anioFabricacion, origen, precioVenta);
		this.material = material;
		
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
