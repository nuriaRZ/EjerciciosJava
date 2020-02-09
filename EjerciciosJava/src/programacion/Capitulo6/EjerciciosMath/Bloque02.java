package programacion.Capitulo6.EjerciciosMath;



public class Bloque02 {

	public Bloque02() {
		
	}
	
	public static void ejercicio02(){
		float x = 0;
		float y1; 
		float y2;
		
		do {
			y1 = (float) Math.sqrt(x); 
			y2 = (float) Math.log(x) * (-1);
			x += 0.001;
		}while ((Math.abs(y1-y2) < 0.001f)==false);
		
		System.out.println("valor y1: "+ y1 +"\nvalor y2: "+ y2 +"\nvalor x: "+ x);
		
	}
	
	public static void ejercicio03() {
		
		float x = 4;
		float y = 1;
		float miPi = 0;
		int contador = 0;
		do {
			contador++;
			if (contador % 2  == 0) {
				miPi -= x/y;
				
			}
			
			else {
				miPi+= x/y;
				
			}
			y+=2;
			
			
		}while(!(Math.abs(Math.PI - miPi) < 0.000001));
		System.out.println("num PI: "+ Math.PI +"\nmi PI: "+ miPi +"\ncontador: "+ contador);
		
	}
	
	public static void ejercicio04() {
		int c1 = 4;
		int c2 = 5;
		
		System.out.println("hipotenusa:"+ Math.hypot(c1, c2));
	}
	
	public static void ejercicio05() {
		float x = 0;
		float xAnt = 0, xSig = 0;
		int contador = 0;
		do {
			if (x * Math.sin(x) > xAnt * Math.sin(xAnt) && x * Math.sin(x) > xSig * Math.sin(xSig)){
				System.out.println(x + "es un máximo");
				contador++;
			}
			x += 0.01f;
			xAnt = x - 0.01f;
			xSig = x + 0.01f;
			
			
		}while (!(contador == 5));
		
		
		
	}


	public static void main(String[] args) {
		ejercicio05();

	}

}
