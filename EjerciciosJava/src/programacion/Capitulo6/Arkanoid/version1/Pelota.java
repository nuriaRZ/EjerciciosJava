package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Pelota extends Objeto {
	
	protected int vx;
	protected int vy;

	public Pelota() {
		super();
		this.color = Color.WHITE;
		this.x_coord = 240;
		this.y_coord = 140;
		this.height = 15;
		this.width = 15;
		this.vx = 5;
		this.vy = 5;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillOval(this.x_coord, this.y_coord, this.width, this.height);
		
	}
	
	public void act() {
		this.x_coord += this.vx;
		this.y_coord += this.vy;
		
		
		if (this.x_coord < 0 || this.x_coord > (Arkanoid.getInstance().getWidth() - this.getWidth())) {
				
			vx = -vx;
			
		}
		if (this.y_coord < 0 || this.y_coord > (Arkanoid.getInstance().getHeight() - this.getHeight())) {
			vy = -vy;
		}
	}	
		
	

	/**
	 * @return the vx
	 */
	public int getVx() {
		return vx;
	}

	/**
	 * @param vx the vx to set
	 */
	public void setVx(int vx) {
		this.vx = vx;
	}

	/**
	 * @return the vy
	 */
//	public int getVy() {
//		return vy;
//	}
//
//	/**
//	 * @param vy the vy to set
//	 */
//	public void setVy(int vy) {
//		this.vy = vy;
//	}
	
	

	
}
