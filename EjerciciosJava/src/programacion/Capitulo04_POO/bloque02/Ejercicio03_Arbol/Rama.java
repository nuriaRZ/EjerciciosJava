package programacion.Capitulo04_POO.bloque02.Ejercicio03_Arbol;

public class Rama extends ElementoDeArbol {
	
	private ElementoDeArbol el1;
	private ElementoDeArbol el2;
	private ElementoDeArbol el3;
	
	
	

	public Rama() {
	}
	

	public Rama(ElementoDeArbol el1, ElementoDeArbol el2, ElementoDeArbol el3) {
		super();		
		this.el1 = el1;
		this.el2 = el2;
		this.el3 = el3;		
	}
	


	@Override
	public String toString() {
		return "Rama [el1=" + el1 + ", el2=" + el2 + ", el3=" + el3 + "]";
	}
	/**
	 * @return the el1
	 */
	public ElementoDeArbol getEl1() {
		return el1;
	}


	/**
	 * @param el1 the el1 to set
	 */
	public void setEl1(ElementoDeArbol el1) {
		this.el1 = el1;
	}


	/**
	 * @return the el2
	 */
	public ElementoDeArbol getEl2() {
		return el2;
	}


	/**
	 * @param el2 the el2 to set
	 */
	public void setEl2(ElementoDeArbol el2) {
		this.el2 = el2;
	}


	/**
	 * @return the el3
	 */
	public ElementoDeArbol getEl3() {
		return el3;
	}


	/**
	 * @param el3 the el3 to set
	 */
	public void setEl3(ElementoDeArbol el3) {
		this.el3 = el3;
	}
	

}
