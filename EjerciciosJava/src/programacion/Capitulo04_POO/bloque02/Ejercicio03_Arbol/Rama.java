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
	 * 
	 */
	public boolean equals (Object obj) {
		
		if (obj instanceof Fruta)
			this.el1 = (Fruta) obj;
		
		if (obj instanceof Hoja)
			this.el1 = (Hoja) obj;
		
		if (obj instanceof Rama)
			this.el1 = (Rama) obj;
		return true;
	}
	
	public boolean equals1 (Object obj2) {
		
		if (obj2 instanceof Fruta)
			this.el2 = (Fruta) obj2;
		
		if (obj2 instanceof Hoja)
			this.el2 = (Hoja) obj2;
		
		if (obj2 instanceof Rama)
			this.el2 = (Rama) obj2;
		return true;
	}
	
	public boolean equals2 (Object obj) {
		
		if (obj instanceof Fruta)
			this.el3 = (Fruta) obj;
		
		if (obj instanceof Hoja)
			this.el3 = (Hoja) obj;
		
		if (obj instanceof Rama)
			this.el3 = (Rama) obj;
		return true;
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
