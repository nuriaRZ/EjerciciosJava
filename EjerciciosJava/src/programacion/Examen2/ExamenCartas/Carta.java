package programacion.Examen2.ExamenCartas;

public class Carta {
	private int valor;
	private String palo;
	private String descripcion;
	private int id;
	
	public Carta () {
		
	}
	
	/**
	 * @param valor
	 * @param palo
	 * @param descripcion
	 * @param id
	 */
	public Carta(int valor, String palo, String descripcion, int id) {
		super();
		this.valor = valor;
		this.palo = palo;
		this.descripcion = descripcion;
		this.id = id;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	/**
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}
	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + ", descripcion=" + descripcion + ", id=" + id + "]\n";
	}
	
	
	
	
	

}
