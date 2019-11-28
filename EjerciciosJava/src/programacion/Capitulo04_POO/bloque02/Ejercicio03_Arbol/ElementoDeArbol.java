package programacion.Capitulo04_POO.bloque02.Ejercicio03_Arbol;

public class ElementoDeArbol {
	
	private String ramas;
	private String hojas;
	private String frutos;
	
	/**
	 * 
	 */
	
	public ElementoDeArbol() {
		
	}
	/**
	 * @param tronco
	 * @param ramas
	 * @param hojas
	 * @param frutos
	 */
	public ElementoDeArbol(String tronco, String ramas, String hojas, String frutos) {
		super();
		
		this.ramas = ramas;
		this.hojas = hojas;
		this.frutos = frutos;
	}


	/**
	 * @return the ramas
	 */
	public String getRamas() {
		return ramas;
	}
	/**
	 * @param ramas the ramas to set
	 */
	public void setRamas(String ramas) {
		this.ramas = ramas;
	}
	/**
	 * @return the hojas
	 */
	public String getHojas() {
		return hojas;
	}
	/**
	 * @param hojas the hojas to set
	 */
	public void setHojas(String hojas) {
		this.hojas = hojas;
	}
	/**
	 * @return the frutos
	 */
	public String getFrutos() {
		return frutos;
	}
	/**
	 * @param frutos the frutos to set
	 */
	public void setFrutos(String frutos) {
		this.frutos = frutos;
	}
	
	
	

}
