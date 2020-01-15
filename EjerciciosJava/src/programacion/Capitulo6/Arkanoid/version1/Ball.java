package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Ball extends Actor {
	
	protected int vx; // cantidad de pixeles que aumentará en su movimiento
	protected int vy;
	public Rectangle dimensionBola = null;

	public Ball() {
		super();
		this.color = Color.WHITE;
		this.x_coord = 240;
		this.y_coord = 140;
		this.height = 15;
		this.width = 15;
		this.vx = 3;
		this.vy = 3;
		//dimensionBola = new Rectangle (this.getX_coord(), this.getY_coord(), this.getWidth(), this.getHeight());
	}


	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillOval(this.x_coord, this.y_coord, this.width, this.height);
		
	}
	@Override
	public void act() {
		
		//movimento de la pelota sobre el eje x y el eje y
		this.x_coord += this.vx;
		this.y_coord += this.vy;
	//control de la pelota para que no salga del margen de la ventana
		if (this.x_coord < 0 || this.x_coord > (Arkanoid.getInstance().getWidth() - this.getWidth())) {				
			vx = -vx;	// en caso de que toque el limite se le cambia la direccion		
		}
		if (this.y_coord < 0 || this.y_coord > (Arkanoid.getInstance().getHeight() - this.getHeight())) {
			vy = -vy;
		}
	}
	
	
	
	@Override
	public void collisionWith(Actor actorCollisioned) {
		
		super.collisionWith(actorCollisioned);
		int vX = 3;
		int vY = 3;
		
			if (actorCollisioned instanceof Brick) {
				Ball.this.vx= -vX ;
				Ball.this.vy= vY;
				
				//this.x_coord *= -this.getVx();
				System.out.println("colision");
		}
			if (actorCollisioned instanceof Nave) {
				Ball.this.vx = vX;
				Ball.this.vy = -vY;
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
	public int getVy() {
		return vy;
	}

	/**
	 * @param vy the vy to set
	 */
	public void setVy(int vy) {
		this.vy = vy;
	}

	/**
	 * @return the dimensionBola
	 */
	public Rectangle getDimensionBola() {
		return dimensionBola;
	}

	/**
	 * @param dimensionBola the dimensionBola to set
	 */
	public void setDimensionBola(Rectangle dimensionBola) {
		this.dimensionBola = dimensionBola;
	}
	
	
	

	
}
