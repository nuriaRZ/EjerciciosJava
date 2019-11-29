package programacion.Capitulo04_POO.bloque02.Ejercicio03_Arbol;

public class Fruta extends ElementoDeArbol {
	
	private String nombre;

	public Fruta() {
		
	}

	public Fruta(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + "]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
