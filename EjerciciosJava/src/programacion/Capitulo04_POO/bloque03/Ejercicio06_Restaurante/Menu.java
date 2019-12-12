package programacion.Capitulo04_POO.bloque03.Ejercicio06_Restaurante;

public class Menu {
	private Plato primerPlato;
	private Plato segundoPlato;
	private Plato postre;
	/**
	 * @param primerPlato
	 * @param segundoPlato
	 * @param postre
	 */
	public Menu(Plato primerPlato, Plato segundoPlato, Plato postre) {
		super();
		this.primerPlato = primerPlato;
		this.segundoPlato = segundoPlato;
		this.postre = postre;
	}
	/**
	 * CALCULAR EL PRECIO
	 * @return
	 */
	public float getPrecio() {
		return this.primerPlato.getPrecio() + this.segundoPlato.getPrecio() + this.postre.getPrecio();
	}
	
	/**
	 * @return the primerPlato
	 */
	public Plato getPrimerPlato() {
		return primerPlato;
	}
	/**
	 * @param primerPlato the primerPlato to set
	 */
	public void setPrimerPlato(Plato primerPlato) {
		this.primerPlato = primerPlato;
	}
	/**
	 * @return the segundoPlato
	 */
	public Plato getSegundoPlato() {
		return segundoPlato;
	}
	/**
	 * @param segundoPlato the segundoPlato to set
	 */
	public void setSegundoPlato(Plato segundoPlato) {
		this.segundoPlato = segundoPlato;
	}
	/**
	 * @return the postre
	 */
	public Plato getPostre() {
		return postre;
	}
	/**
	 * @param postre the postre to set
	 */
	public void setPostre(Plato postre) {
		this.postre = postre;
	}
	@Override
	public String toString() {
		return "Menu [primerPlato=" + primerPlato + ", segundoPlato=" + segundoPlato + ", postre=" + postre + "]";
	}
	
	
	
	
	


}
