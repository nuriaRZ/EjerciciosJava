package programacion.Capitulo04_POO.bloque01.ejercicio07_rectangulo;

public class Rectangulo extends FiguraGeometrica{
	
	int rectangulo[][] = new int[base][altura];
	/**
	 * @param ancho
	 * @param alto
	 * @param rectangulo
	 */
	public Rectangulo(int base, int altura) {
		super(base, altura);
		
	}

	public void imprimirConsola () {
		for (int i = 0; i < this.altura; i++) {
			for (int j = 0; j < this.base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
}

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	


	
	
	


}
