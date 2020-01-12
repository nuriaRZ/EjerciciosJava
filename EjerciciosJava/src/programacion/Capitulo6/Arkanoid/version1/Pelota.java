package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;

public class Pelota extends Objeto {
	
	protected int vx;

	public Pelota() {
		super();
		this.color = Color.WHITE;
		this.x_coord = 135;
		this.y_coord = 250;
		this.height = 15;
		this.width = 15;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillOval(this.x_coord, this.y_coord, this.width, this.height);
		
	}
	
	public void movimiento() {
		this.x_coord += this.vx;
		//this.y_coord += this.vy;
		
		if (this.x_coord < 0 || this.x_coord > (Arkanoid.getInstance().getWidth() - this.getWidth()) );
				//|| this.y_coord < 0 || this.y_coord > (Arkanoid.getInstance().getHeight() - this.getHeight()));
		vx = -vx;
		//vy = -vy;
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
