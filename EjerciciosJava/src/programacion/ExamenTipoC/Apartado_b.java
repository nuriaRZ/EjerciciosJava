package programacion.ExamenTipoC;



public class Apartado_b {

	public static void main(String[] args) {
		
		int array[] = new int [100];//declaro el array con una longitud de 100
		
		//recorro el array empezando en la longitud del array-1 (99) ya que contamos con que el array tiene la posicion 0
		for (int i = array.length-1; i >= 0; i--) {
			array[i]=i; //al array le asigno el valor de su posicion ya que empezando en 99 termina en un limite inferior de 0
		System.out.print(array[i]+" ");
		}
		

	}

}
