package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Color;
import java.awt.Graphics;


import programacion.Utils;

public class Coche extends Vehiculo {

	public Coche(String nombre, int numPista, Color color) {
		super(nombre, numPista, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {		
		this.getP().paint(g);
		this.paintMe(g);

	}
	
	public void paintMe(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect((this.getPosicion()*Frame.getInstance().getWidth()/100)+10, this.getY_COORD()+35, 30, 20);
		g.fillRect((this.getPosicion()*Frame.getInstance().getWidth()/100/100), this.getY_COORD()+50, 50, 20);
		g.setColor(Color.BLACK);
		g.fillRect((this.getPosicion()*Frame.getInstance().getWidth()/100)+13, this.getY_COORD()+37, 20, 15);
		g.fillOval((this.getPosicion()*Frame.getInstance().getWidth()/100)+30, this.getY_COORD()+65, 15, 15);
		g.fillOval((this.getPosicion()*Frame.getInstance().getWidth()/100)+5, this.getY_COORD()+65, 15, 15);

	}



}
