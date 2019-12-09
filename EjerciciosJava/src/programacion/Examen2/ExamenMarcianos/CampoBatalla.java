package programacion.Examen2.ExamenMarcianos;

import java.util.Arrays;

import programacion.Utils;
import programacion.Utils_Arrays;

public class CampoBatalla {
	private String nombre;
	Malvado malvados[] = new Malvado[20];
	Humano humanos[] = new Humano[20];
	/**
	 * @param nombre
	 * @param malvados
	 * @param humanos
	 */
	public CampoBatalla(String nombre, Malvado[] malvados, Humano[] humanos) {
		super();
		this.nombre = nombre;
		this.malvados = malvados;
		this.humanos = humanos;
	}
	
	
	public CampoBatalla() {
		for (int i = 0; i < humanos.length; i++) {
			humanos[i]=new Humano(Utils.ObtenerNumAleatorioEntreLimites(50, 100), " humano "+(i+1));
		}
		for (int i = 0; i < malvados.length; i++) {
			malvados[i] = new Malvado(Utils.ObtenerNumAleatorioEntreLimites(50, 100), " Malvado "+(i+1));
		}
	}

	public void mostrar() {
		System.out.println("Humanos");
		for (int i = 0; i < humanos.length; i++) {
			System.out.println(humanos[i]);
		}
		System.out.println("Malvados");
		for (int i = 0; i < malvados.length; i++) {
			System.out.println(malvados[i]);
		}
	}
	
	public void ultimo() {
		System.out.println("Cambiar puntos de vida del ultimo elemento");
		for (int i = 0; i < humanos.length; i++) {
			if (i==humanos.length-1) {
				int aux = humanos[i].getPuntosVida()*2;
				humanos[i].setPuntosVida(aux);
			}
		}
		for (int i = 0; i < malvados.length; i++) {
			if (i==malvados.length-1) {
				int aux = malvados[i].getPuntosVida()*2;
				malvados[i].setPuntosVida(aux);
			}
		}
		mostrar();
	}
	
	public void mezclar() {
		Humano aux;		
		System.out.println("Mezclar humanos");
		
		for (int i =0 ; i < humanos.length*2; i++) {
			
		int i1, i2;
		 i1 = Utils_Arrays.ObtenerNumAleatorio(humanos.length-1, 0);
		 i2 = Utils_Arrays.ObtenerNumAleatorio(humanos.length-1, 0);
		 // REALIZO INTERCAMBIO DE VALORES
		 aux = humanos[i1];
		 humanos[i1]=humanos[i2];
		 humanos[i2]=aux;
		}
		Malvado aux2;		
		System.out.println("Mezclar malvados");
		
		for (int i =0 ; i < malvados.length*2; i++) {
			
		int i1, i2;
		 i1 = Utils_Arrays.ObtenerNumAleatorio(malvados.length-1, 0);
		 i2 = Utils_Arrays.ObtenerNumAleatorio(malvados.length-1, 0);
		 // REALIZO INTERCAMBIO DE VALORES
		 aux2 = malvados[i1];
		 malvados[i1]=malvados[i2];
		 malvados[i2]=aux2;
		}
		mostrar();
	}
	
	public void disparar() {
		System.out.println("\nDisparar");
		for (int i = 0; i < humanos.length; i++) {
				do {
					for (int j = 0; j < malvados.length; j++) {
						if(malvados[j].vivo(true)) {
							int aux = Utils.ObtenerNumAleatorioEntreLimites(25, 5);
							malvados[j].setPuntosVida(aux);
						}
					}
				}while (humanos[i].getPuntosVida()==0);
		}
		mostrar();
	}
	


}
