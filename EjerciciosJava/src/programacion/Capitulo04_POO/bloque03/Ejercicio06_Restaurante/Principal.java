package programacion.Capitulo04_POO.bloque03.Ejercicio06_Restaurante;

public class Principal {

	public static void main(String[] args) {
		//Primeros Platos
		Plato marcarrones = new Plato ("Macarrones con tomate", 5f);
		Plato tortilla = new Plato ("Tortilla", 3f);
		Plato solomillo = new Plato ("Solomillo", 10f);
		Plato pizza = new Plato ("Pizza", 7.5f);
		Plato flamenquin = new Plato ("Flamenquin", 9f);
		Plato sanJacobo = new Plato ("San Jacobo", 11f);
		Plato  habicholones = new Plato ("Habicholones", 4f);
		
		//Segundo Plato
		Plato solomilloRoquefort = new Plato ("Solomillo Roquefort", 7f);
		Plato bacalao = new Plato ("Bacalao gratinado", 10f);
		Plato lenguado = new Plato ("Lenguado", 12f);
		Plato pulpo = new Plato ("Pulpo Gallega", 15f);
		Plato ensalada = new Plato ("Ensalada", 5f);
		Plato calamares = new Plato ("Calamares rellenos de jamon", 8f);
		
		//Postre
		Plato tartaAbuela = new Plato ("Tarta de la Abuela", 4f);
		Plato natillas = new Plato ("Natillas", 4f);
		Plato tartaQueso = new Plato ("Tarta de Queso", 4.5f);
		Plato tarta3chocolates = new Plato ("Tarta de 3 chocolates", 6f);
		Plato fruta = new Plato ("Fruta del tiempo", 3f);
		
		//Construimos los menus
		Menu menus[] = new Menu[3];
		menus[0] = new Menu(lenguado, pulpo, fruta);
		menus[1] = new Menu(flamenquin, ensalada, natillas);
		menus[2] = new Menu(flamenquin, solomilloRoquefort, tarta3chocolates);
		
		//imprimo los menus con su precio
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i].toString());			
			System.out.println("Precio: "+ menus[i].getPrecio());
		}
		
		
		

	}

}
