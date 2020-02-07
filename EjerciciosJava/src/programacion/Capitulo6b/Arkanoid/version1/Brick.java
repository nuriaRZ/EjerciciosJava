package programacion.Capitulo6b.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Transparency;

public class Brick extends Actor {
	public int strength;
	public static final int SCORE_FOR_BROKE_BRICK = 5;
	public static final int SCORE_FOR_BROKE_HARD_BRICK = 2;

	public Brick() {
		super();
		this.x_coord = 0;
		this.y_coord = 0;		
		this.width = 25;
		this.height = 15;
		this.strength = 1;
		
		
		
	}

	//metodo paint de cada ladrillo
	public void paint(Graphics2D g) {
		
		g.setColor(getColor());
		g.fillRect(this.x_coord, this.y_coord, this.width, this.height);
		
		
	}
	
	public void paintChoque(Graphics2D g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(this.x_coord, this.y_coord, this.width, this.height);

		
	}


	@Override
	public void act() {
			
	}
	

	


	@Override //metodo de colision
	public void collisionWith(Actor actorCollisioned) {
		
		super.collisionWith(actorCollisioned);
		// si el ladrillo colisiona con un objeto tipo bola
		if (actorCollisioned instanceof Ball) {			
			//this.setMarkedForRemoval(true); //se marcara para ser borrado
			//creo una explosion centrandolo en mitad del ladrillo
			this.strength--;
			if (strength == 0) {
				this.setMarkedForRemoval(true);
				SoundsRepository.getInstance().playSound("Arkanoid-SFX-01.wav");
				explosion();
				Arkanoid.getInstance().getNave().addScore(SCORE_FOR_BROKE_BRICK);
			}
			if (strength != 0) {			
				SoundsRepository.getInstance().playSound("Arkanoid-SFX-08.wav");
				Arkanoid.getInstance().getNave().addScore(SCORE_FOR_BROKE_HARD_BRICK);
				
			}
	
			
		}
	}
	
	public void explosion() {
		Explosion ex = new Explosion();
		ex.setX_coord(this.x_coord + (this.width / 2) - ex.getWidth() / 2);
		ex.setY_coord(this.y_coord + (this.height / 2) - ex.getHeight() / 2);
		//lo a�ado a la lista de siguiente iteraccion de actores
		Arkanoid.getInstance().newIteractionActors.add(ex);
		SoundsRepository.getInstance().playSound("explosion.wav");
	}

	/**
	 * @return the dureza
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param dureza the dureza to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
}
