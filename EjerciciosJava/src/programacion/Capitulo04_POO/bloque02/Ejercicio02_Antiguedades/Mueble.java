package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public class Mueble extends Antiguedad {
	protected String material;
	protected String color;
	
	public Mueble() {
		
	}
	

	public Mueble(int anioFabricacion, String origen, float precioVenta, String material, String color) {
		super(anioFabricacion, origen, precioVenta);
		this.material = material;
		this.color = color;
	}
	


	@Override
	public String toString() {
		return "Mueble [material=" + material + ", color=" + color + ", getAnioFabricacion()=" + getAnioFabricacion()
				+ ", getOrigen()=" + getOrigen() + ", getPrecioVenta()=" + getPrecioVenta() + "]";
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


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
