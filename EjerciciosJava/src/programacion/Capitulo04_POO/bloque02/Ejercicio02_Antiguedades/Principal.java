package programacion.Capitulo04_POO.bloque02.Ejercicio02_Antiguedades;

public class Principal {

	public static void main(String[] args) {
		Joya joya = new Joya(1996, "argentina", 80.90f, "plata");
		Libro libro = new Libro(1999, "EEUU", 15.90f, "JRRTolkien", "El senior de los Anillos");
		Mueble mueble = new Mueble(2010, "Italia", 118.90f, "madera", "azul");
		Cuadro cuadro = new Cuadro(1950, "Francia", 158.54f, "Picasso", "cuadro chulo");
		
		System.out.println(joya.toString());
		System.out.println(libro.toString());
		System.out.println(mueble.toString());
		System.out.println(cuadro.toString());

	}

}
