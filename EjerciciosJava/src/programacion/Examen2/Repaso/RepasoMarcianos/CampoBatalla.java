package programacion.Examen2.Repaso.RepasoMarcianos;

import programacion.Utils;
import programacion.Utils_Arrays;

public class CampoBatalla {
	private String nombre;
	
	Humano humanos[] = new Humano[20];
	Malvado malvados[] = new Malvado[20];
	
	public CampoBatalla() {
		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano ("Humano "+(i+1));
			malvados[i] = new Malvado ("Malvado "+(i+1));
		}
		humanos[humanos.length-1].setPuntosVida(humanos[humanos.length-1].getPuntosVida()*2);
		malvados[malvados.length-1].setPuntosVida(malvados[malvados.length-1].getPuntosVida()*2);
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
	
	public void mezclar() {
		System.out.println("Mezclar humanos");
		Humano aux= new Humano();		
		
		for (int i =0 ; i < humanos.length*2; i++) {			
		int i1, i2;
		 i1 = Utils_Arrays.ObtenerNumAleatorio(humanos.length-1, 0);
		 i2 = Utils_Arrays.ObtenerNumAleatorio(humanos.length-1, 0);
		 // REALIZO INTERCAMBIO DE VALORES
		 aux = humanos[i1];
		 humanos[i1]=humanos[i2];
		 humanos[i2]=aux;
		}
		
		System.out.println("Mezclar humanos");		
		Malvado aux2= new Malvado();		
		for (int i =0 ; i < malvados.length*2; i++) {			
		int i1, i2;
		 i1 = Utils_Arrays.ObtenerNumAleatorio(malvados.length-1, 0);
		 i2 = Utils_Arrays.ObtenerNumAleatorio(malvados.length-1, 0);
		 // REALIZO INTERCAMBIO DE VALORES
		 aux2 = malvados[i1];
		 malvados[i1]=malvados[i2];
		 malvados[i2]=aux2;
		}
		
	}
	public void dispararHumano() {
		int disparo = Utils.ObtenerNumAleatorioEntreLimites(25, 5);
		int primerHumanoVivo=0;
		for (int i = 0; i < humanos.length; i++) {
			if (humanos[i].getPuntosVida() > 0) {
				primerHumanoVivo = i;
				break;
			}
		}
		int primerMalvadoVivo=0;
		for (int i = 0; i < malvados.length; i++) {
			if(malvados[i].getPuntosVida()>0) {
				primerMalvadoVivo=i;
				break;
			}
			
		}
		malvados[primerMalvadoVivo].setPuntosVida(malvados[primerMalvadoVivo].getPuntosVida()-disparo);
		System.out.println("Disparo de humano: "+humanos[primerHumanoVivo].getNombre()+" hacia malvado: "+malvados[primerMalvadoVivo].getNombre()+"y le quita: "+malvados[primerMalvadoVivo].getPuntosVida());
	}
	
	public void dispararMalvado() {
		int disparo = Utils.ObtenerNumAleatorioEntreLimites(25, 5);
		int primerHumanoVivo=0;
		for (int i = 0; i < humanos.length; i++) {
			if (humanos[i].getPuntosVida() > 0) {
				primerHumanoVivo = i;
				break;
			}
		}
		int primerMalvadoVivo=0;
		for (int i = 0; i < malvados.length; i++) {
			if(malvados[i].getPuntosVida()>0) {
				primerMalvadoVivo=i;
				break;
			}
			
		}
		humanos[primerHumanoVivo].setPuntosVida(humanos[primerHumanoVivo].getPuntosVida()-disparo);
		System.out.println("Disparo de malvado: "+malvados[primerHumanoVivo].getNombre()+" hacia humano: "+humanos[primerMalvadoVivo].getNombre()+"y le quita: "+humanos[primerMalvadoVivo].getPuntosVida());
	}

}
