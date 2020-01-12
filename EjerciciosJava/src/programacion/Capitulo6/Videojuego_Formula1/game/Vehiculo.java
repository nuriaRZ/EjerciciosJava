package programacion.Capitulo6.Videojuego_Formula1.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import programacion.Utils;

public abstract class Vehiculo {
	private String nombre;
	private int posicion;
	private Color color;
	private Pista p;
	private int X_COORD;
	private int Y_COORD;
	public List <Integer> tiradasNecesarias = new ArrayList<Integer>();
	private int numPista;
	/**
	 * @param nombre
	 * @param posicion
	 * @param color
	 */
	public Vehiculo(String nombre, int numPista, Color color) {
		super();
		this.nombre = nombre;
		this.posicion = 0;		
		this.color = color;
		this.numPista = numPista;
		construirPista();
		this.p = new Pista(Y_COORD);
		
	}
	/**
	 * 
	 */
	public boolean seMueve() {
		boolean seMueve = true;
		if(this.posicion < p.getLongitud()) {
			this.posicion += Utils.ObtenerNumAleatorioEntreLimites(6, 1); 
			for (int i = 0; i < p.getObstaculos().size(); i++) {
				if (p.getObstaculos().get(i).getPosicion() == posicion) { // si el vehiculo cae sobre el obstaculo le agregamos a su posicion actual
					posicion += p.getObstaculos().get(i).getImpulso(); // el impulso que tenga el obstaculo
					System.out.println(this.nombre + " ha caido sobre una " + p.getObstaculos().get(i).getNombre() + " que se encuentra en la posicion " 
					+ p.getObstaculos().get(i).getPosicion());
				}
				
				if (p.getObstaculos().get(i).getImpulso() < 0) {
					SoundsRepository.getInstance().playSound(SoundsRepository.sonido_mancha);
				}
				else SoundsRepository.getInstance().playSound(SoundsRepository.sonido_rampa);
			}
			this.tiradasNecesarias.add(this.posicion); //Controla la posicion del vehiculo y el numero de tiradas que ha necesitado
			//cada uno hasta llegar a la meta, esto me ayudara para el podium
		}
		else {
			seMueve = false;
			System.out.println("El vehiculo " + this.nombre + " ha llegado a meta");
		}
		
		return seMueve;		
	}
	/**
	 * 
	 */
	
	/**
	 * 
	 * @param g
	 */
	public abstract void paintMe(Graphics g);
	/**
	 * 
	 * @param g
	 */
	public abstract void paint(Graphics g);
	/**
	 * 
	 * @return
	 */
	public int construirPista() {
		Y_COORD = (numPista*400/4);
		return Y_COORD;
	}
	/**
	 * 	
	 */
	
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", posicion=" + posicion + "]";
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
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion += posicion;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return the p
	 */
	public Pista getP() {
		return p;
	}
	/**
	 * @param p the p to set
	 */
	public void setP(Pista p) {
		this.p = p;
	}
	/**
	 * @return the x_COORD
	 */
	public int getX_COORD() {
		return X_COORD;
	}
	/**
	 * @param x_COORD the x_COORD to set
	 */
	public void setX_COORD(int x_COORD) {
		X_COORD = x_COORD;
	}
	/**
	 * @return the y_COORD
	 */
	public int getY_COORD() {
		return Y_COORD;
	}
	/**
	 * @param y_COORD the y_COORD to set
	 */
	public void setY_COORD(int y_COORD) {
		Y_COORD = y_COORD;
	}
	/**
	 * @return the tiradasNecesarias
	 */
	public List<Integer> getTiradasNecesarias() {
		return tiradasNecesarias;
	}
	/**
	 * @param tiradasNecesarias the tiradasNecesarias to set
	 */
	public void setTiradasNecesarias(List<Integer> tiradasNecesarias) {
		this.tiradasNecesarias = tiradasNecesarias;
	}
	/**
	 * @return the numPista
	 */
	public int getNumPista() {
		return numPista;
	}
	/**
	 * @param numPista the numPista to set
	 */
	public void setNumPista(int numPista) {
		this.numPista = numPista;
	}
	/**
	 * 
	 */
	public void imprimirNumTiradas() {
		System.out.println(tiradasNecesarias.toString());
	}
	

	

}
