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
		
	}


	public static void main(String[] args) {
		ejercicio02();

	}

}
