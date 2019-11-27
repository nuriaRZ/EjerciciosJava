package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public class Cuadros extends Antiguedades {
	private String autor;
	private String titulo;
	
	public Cuadros () {
		
	}
	/**
	 * 
	 * @param anioFabricacion
	 * @param origen
	 * @param precioVenta
	 * @param autor
	 * @param titulo
	 */

	public Cuadros(int anioFabricacion, String origen, float precioVenta, String autor, String titulo) {
		super(anioFabricacion, origen, precioVenta);
		this.autor = autor;
		this.titulo = titulo;
	}
	

	@Override
	public String toString() {
		return "Cuadros [autor=" + autor + ", titulo=" + titulo + ", getAnioFabricacion()=" + getAnioFabricacion()
				+ ", getOrigen()=" + getOrigen() + ", getPrecioVenta()=" + getPrecioVenta() + "]";
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}