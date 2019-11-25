package programacion.Capitulo04_POO.bloque01.ejercicio07_rectangulo;

public class Triangulo extends FiguraGeometrica{

	int triangulo[][] = new int [base][altura];
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) {
		super(base, altura);
				
	}
	
	public void imprimirConsola() {
		int contadorAsteriscosPorFila = 1;
		for (int i = 0; i < getAltura(); i++) {
			for (int j = 0; j < contadorAsteriscosPorFila; j++) {
				System.out.print("*");
			}
			contadorAsteriscosPorFila++;
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
