package programacion.Examen2.ExamenMarcianos;

import programacion.Utils_Arrays;

public class CampoBatalla {
	private String nombre;
	private static int LONGITUD_ARRAY = 20;
	Malvado battleDroid[] = new Malvado[LONGITUD_ARRAY];
	Humano troopers[] = new Humano[LONGITUD_ARRAY];

	/**
	 * 
	 * @param nombre
	 */

	public CampoBatalla(String nombre) {
		this.nombre = nombre;
		for (int i = 0; i < battleDroid.length; i++) {
			battleDroid[i] = new Malvado("BDroid-" + (i + 1));
			troopers[i] = new Humano("Tropp-" + (i + 1));
		}
		duplicarPuntosVida(troopers);
		duplicarPuntosVida(battleDroid);
		mezclarBichosArray(troopers);
		mezclarBichosArray(battleDroid);

	}

	/**
	 * 
	 * @param array
	 */
	public void duplicarPuntosVida(Bicharraco array[]) {
		array[array.length - 1].setPuntosVida(array[array.length - 1].getPuntosVida() * 2);
	}

	/**
	 * 
	 */
	public void mostrarSituacionActual() {
		System.out.println();
		System.out.println();
		for (int i = 0; i < battleDroid.length; i++) {			
			if (battleDroid[i].isVivo()==false) {
				System.out.print("X"+"  ");
			}
			else {
			System.out.print(battleDroid[i].getNombre()+":"+battleDroid[i].getPuntosVida()+"  ");
			}
		}
		System.out.println();
		
		for (int i = 0; i < troopers.length; i++) {			
			if (troopers[i].isVivo()==false) {
				System.out.print("X"+"  ");
			}
			else {
			System.out.print(troopers[i].getNombre()+":"+troopers[i].getPuntosVida()+"  ");
			}
		}	
			

	}

	/**
	 * 
	 */
	public void mezclarBichosArray(Bicharraco array[]) {
		Bicharraco aux;

		for (int i = 0; i < array.length * 2; i++) {

			int i1, i2;
			i1 = Utils_Arrays.ObtenerNumAleatorio(array.length - 1, 0);
			i2 = Utils_Arrays.ObtenerNumAleatorio(array.length - 1, 0);
			// REALIZO INTERCAMBIO DE VALORES
			aux = array[i1];
			array[i1] = array[i2];
			array[i2] = aux;
		}
	}

	/**
	 * @return 
	 * 
	 */
	public Bicharraco getPrimerBichoVivoArray (Bicharraco array[]) {
		for (Bicharraco b : array) {
			if (b.isVivo()) {
				return b;
			}			
		}
		return null;
	}
	/**
	 * 
	 */
	public boolean malvadosVivos () {
		if (getPrimerBichoVivoArray(battleDroid)!=null) {
			return true; //quedan troopers vivos
		}
		return false; //no quedan vivos	
	}
	/**
	 * 
	 */
	public boolean humanosVivos () {
		if (getPrimerBichoVivoArray(troopers)!=null) {
			return true; //quedan troopers vivos
		}
		return false; //no quedan vivos	
	}
	/**
	 * 
	 * @return
	 */
	public boolean esFinDeJuego () {
		if(!humanosVivos()||!malvadosVivos()) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 */
	public Bicharraco bichoConMayorNumDisparos(Bicharraco array[]) {
		Bicharraco bichoMayorNumDisparos = array[0];
		for (int i = 1; i < array.length ; i++) {
			if (array[i-1].getDisparosRecibidos() < array[i].getDisparosRecibidos()) {
				 bichoMayorNumDisparos = array[i];
			}					
		}
		return bichoMayorNumDisparos;
	}
	/**
	 * 
	 */
	public Bicharraco bichoConMenorNumDisparos(Bicharraco array[]) {
		Bicharraco bichoMenorNumDisparos = array[0];
		for (int i = 1; i < array.length ; i++) {
			if (array[i-1].getDisparosRecibidos() > array[i].getDisparosRecibidos()) {
				 bichoMenorNumDisparos = array[i];
			}					
		}
		return bichoMenorNumDisparos;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the battleDroid
	 */
	public Malvado[] getBattleDroid() {
		return battleDroid;
	}

	/**
	 * @param battleDroid the battleDroid to set
	 */
	public void setBattleDroid(Malvado[] battleDroid) {
		this.battleDroid = battleDroid;
	}

	/**
	 * @return the troopers
	 */
	public Humano[] getTroopers() {
		return troopers;
	}

	/**
	 * @param troopers the troopers to set
	 */
	public void setTroopers(Humano[] troopers) {
		this.troopers = troopers;
	}

}
