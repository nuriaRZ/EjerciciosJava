package programacion.Capitulo04_POO.Ejercicio03;

public class Persona {
	
	String nombre;
	String apellidos;
	String DNI;
	String direccion;
	int  telefono;
	
	public Persona (){
		
	}
	
	public Persona(String nuevoNombre, String nuevoApellidos, String nuevoDNI, String nuevaDireccion, int  nuevoTelefono) {
		
		nombre = nuevoNombre;
		apellidos = nuevoApellidos;
		DNI = nuevoDNI;
		direccion = nuevaDireccion;
		telefono = nuevoTelefono;
	}
	
	public void imprimirDatos () {
		System.out.println("nombre:" + nombre +"\napellidos:" + apellidos + "\nDNI:" +DNI+"\nDireccion:"+direccion+"\nTelefono:"+telefono);		
	}

}
