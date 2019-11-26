package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public class Libros extends Antiguedades {
	private String autor;
	private String titulo;

	public Libros(int anioFabricacion, String origen, float precioVenta, String autor, String titulo ) {
		super(anioFabricacion, origen, precioVenta);
		this.autor = autor;
		this.titulo = titulo;
		
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
