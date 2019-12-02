package programacion.Capitulo04_POO.bloque02.Ejercicio03_Arbol;

public class Principal {

	public static void main(String[] args) {
		Fruta f1 = new Fruta("manzana");
		Hoja h2 = new Hoja ("verde");
		Fruta f3 = new Fruta("naranja");
		Hoja h1 = new Hoja ("marron");
		
		Rama rama2 =new Rama (h1, f3, f1 );
		
		Rama rama = new Rama(f1, h2, rama2);
		
		
		System.out.println(rama.toString());
		

	}

}
