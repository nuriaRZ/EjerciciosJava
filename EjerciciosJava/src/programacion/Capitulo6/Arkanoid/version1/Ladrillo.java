package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Ladrillo extends Objeto {
	

	public Ladrillo() {
		super();
		this.x_coord = 0;
		this.y_coord = 0;
		this.color = Color.WHITE;
		this.width = 20;
		this.height = 10;
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillRect(this.x_coord+10, this.y_coord+10, this.width, this.height);
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
