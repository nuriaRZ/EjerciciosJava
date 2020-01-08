

package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Color;
import java.awt.Graphics;

public class ManchaAceite extends Obstaculo {


	public ManchaAceite(String nombre, int y_COORD) {
		super(nombre);
		this.impulso = -2;
		this.color = Color.BLACK;
		this.Y_COORD = y_COORD;
		
	}
	


	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(getPosicion()*Frame.getInstance().getWidth()/100, Y_COORD, getEspacio()*Frame.getInstance().getWidth()/50, Frame.getInstance().getHeight()/4);
		
	}
	



}
