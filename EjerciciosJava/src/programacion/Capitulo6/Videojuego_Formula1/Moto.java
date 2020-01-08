package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Color;
import java.awt.Graphics;

import programacion.Utils;

public class Moto extends Vehiculo {

	public Moto(String nombre, int numPista, Color color) {
		super(nombre, numPista, color);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {		
		this.getP().paint(g);
		this.paintMe(g);

	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(this.getPosicion()*Frame.getInstance().getWidth()/100, this.getY_COORD(), 40, 5);

	}




	
	
	

}
