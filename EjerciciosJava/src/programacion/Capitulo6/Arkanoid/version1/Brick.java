package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Brick extends Actor {
	

	public Brick() {
		super();
		this.x_coord = 0;
		this.y_coord = 0;		
		this.width = 25;
		this.height = 15;
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillRect(this.x_coord, this.y_coord, this.width, this.height);
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

}
