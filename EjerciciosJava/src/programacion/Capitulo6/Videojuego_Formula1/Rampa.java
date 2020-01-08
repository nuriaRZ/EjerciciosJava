package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Color;
import java.awt.Graphics;



public class Rampa extends Obstaculo {


	/**
	 * @param nombre
	 */
	public Rampa(String nombre, int Y_COORD) {
		super(nombre);
		this.impulso = 5;
		this.color = Color.YELLOW;
		this.Y_COORD = Y_COORD;
	}
	/**
	 * @return 
	 * 
	 */

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(getPosicion()*Frame.getInstance().getWidth()/100, Y_COORD, getEspacio()*Frame.getInstance().getWidth()/100, Frame.getInstance().getHeight()/4);
		
	}
	

}
