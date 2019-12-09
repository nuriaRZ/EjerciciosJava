package programacion.Examen2.Repaso.RepasoCartas;

import java.util.Arrays;

public class Jugador {
	private String nombre;
	Carta mano[] = new Carta[5];
	/**
	 * 
	 */
	public Jugador() {
		
	}
	/**
	 * @param nombre
	 * @param mano
	 */
	public Jugador(String nombre ) {		
		this.nombre = nombre;
		
	}
	/**
	 * 
	 */
	public void Jugada() {
		for (int i = 0; i < mano.length; i++) {
			if (mano[i]!=null) {
				Carta cartaComprobar = mano[i];
				int coincidencias=0;
				for (int j = 0; j < mano.length; j++) {
					if (mano[j]!=null) {
						if (cartaComprobar.getValor()==mano[j].getValor()) {
							mano[j]=null;
							coincidencias++;
						}
					}
				}
				switch (coincidencias) {
				case 4:
					System.out.println("\n El jugador tiene un poker, 4 cartas de valor "+cartaComprobar.getValor());
					break;
				case 3:
					System.out.println("\n El jugador tiene un trio, 3 cartas de valor "+cartaComprobar.getValor());
					break;
				case 2:
					System.out.println("\n El jugador tiene una pareja, 2 cartas de valor "+cartaComprobar.getValor());
					break;

				default:
					break;
				}
			}
		}
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
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}
	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
	}
	
	
	

}
