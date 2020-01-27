package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ball extends Actor {

	protected int vx; // cantidad de pixeles que aumentar� en su movimiento
	protected int vy;
	protected boolean space;
	private int contador;

	public Ball() {
		super();
		this.color = Color.WHITE;		
		this.height = 15;
		this.width = 15;
		this.vx = 3;
		this.vy = 3;	


	}

	public void paint(Graphics2D g) {
		g.setColor(getColor());
		g.fillOval(this.x_coord, this.y_coord, this.width, this.height);


	}

	@Override
	public void act() {
		
		// movimento de la pelota sobre el eje x y el eje y
		this.x_coord += this.vx;
		this.y_coord += this.vy;
		// control de la pelota para que no salga del margen de la ventana
		if (this.x_coord < 0 || this.x_coord > (Arkanoid.getInstance().getWidth() - this.getWidth())) {
			vx = -vx; // en caso de que toque el limite se le cambia la direccion
		}
		if (this.y_coord < 0 || this.y_coord > (Arkanoid.getInstance().getHeight() - this.getHeight())) {
			vy = -vy;
		}

		
	
	}

	@Override
	public void collisionWith(Actor actorCollisioned) {

		super.collisionWith(actorCollisioned);
		

		if (actorCollisioned instanceof Brick || actorCollisioned instanceof Nave) {
			vx = -vx;
			vy = -vy;

			SoundsRepository.getInstance().playSound("Arkanoid-SFX-01.wav");
			
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






}
