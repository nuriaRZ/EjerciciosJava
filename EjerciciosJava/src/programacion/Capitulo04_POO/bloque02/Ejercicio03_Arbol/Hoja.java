package programacion.Capitulo04_POO.bloque02.Ejercicio03_Arbol;

public class Hoja extends ElementoDeArbol {
	private String color;
	
	public Hoja() {
		
	}

	public Hoja(String color) {
		super();
		this.color = color;
	}


	@Override
	public String toString() {
		return "Hoja [color=" + color + "]";
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
