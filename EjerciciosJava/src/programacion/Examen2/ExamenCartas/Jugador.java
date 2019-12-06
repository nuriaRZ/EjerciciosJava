package programacion.Examen2.ExamenCartas;

public class Jugador {
	private String nombre;
	private Carta[] mano = new Carta[5];
	/**
	 * 
	 */
	public Jugador () {
		
	}
	/**
	 * @param nombre
	 * @param cartas
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;		
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
	public Carta[] getCartas() {
		return mano;
	}
	/**
	 * @param cartas the mano to set
	 */
	public void setCartas(Carta[] mano) {
		this.mano = mano;
	}
	
	
	
	
	
	

}
