package programacion.Capitulo04_POO.bloque02.Ejercicio01_Articulos;

public class Tienda {

	public static void main(String[] args) {
		Articulos_Perecederos art1 = new Articulos_Perecederos("asde4", "cocacola", 1.5f, "14/2/2020");
		Articulos_Perecederos art2 = new Articulos_Perecederos("asde6", "tomate", 1.5f, "14/2/2020");
		Articulos_NoPerecederos art3 = new Articulos_NoPerecederos("asde4", "lentejas", 1.10f);
		Articulos_NoPerecederos art4 = new Articulos_NoPerecederos("asde4", "habichuelas", 2.15f);
		
		art1.imprimirPerecedero();
		art2.imprimirPerecedero();
		art3.imprimir();
		art4.imprimir();




	}

}
