package programacion.Examen2.ExamenFregadero;

import programacion.Utils;

public abstract class Utensilio {
	private String id;
	private int suciedad;
	private int dureza;
	private int numPasadas;
	/**
	 * @param id
	 * @param suciedad
	 * @param dureza
	 * @param numPasadas
	 */
	public Utensilio(String id) {
		super();
		this.id = id;
		this.suciedad = Utils.ObtenerNumAleatorioEntreLimites(100, 10);
		this.dureza = Utils.ObtenerNumAleatorioEntreLimites(3, 1);
		this.suciedad *=this.dureza; 
		this.numPasadas = 0;
	}
	@Override
	public String toString() {
		return "Utensilio [id=" + id + ", suciedad=" + suciedad + ", dureza=" + dureza + ", numPasadas=" + numPasadas
				+ "]";
	}
	/**
	 * 
	 */
	public void limpiar() {
		do {
		this.suciedad -= Utils.ObtenerNumAleatorioEntreLimites(40, 20);
		numPasadas++;
		}while(this.suciedad>0);
	}
	/**
	 * 
	 * @return
	 */
	public abstract boolean seRompe();
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the suciedad
	 */
	public int getSuciedad() {
		return suciedad;
	}
	/**
	 * @param suciedad the suciedad to set
	 */
	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}
	/**
	 * @return the dureza
	 */
	public int getDureza() {
		return dureza;
	}
	/**
	 * @param dureza the dureza to set
	 */
	public void setDureza(int dureza) {
		this.dureza = dureza;
	}
	/**
	 * @return the numPasadas
	 */
	public int getNumPasadas() {
		return numPasadas;
	}
	/**
	 * @param numPasadas the numPasadas to set
	 */
	public void setNumPasadas(int numPasadas) {
		this.numPasadas = numPasadas;
	}
	
	
	

}
