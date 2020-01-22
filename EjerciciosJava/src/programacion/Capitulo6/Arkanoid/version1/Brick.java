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

	//metodo paint de cada ladrillo
	public void paint(Graphics2D g) {
		g.setColor(getColor());
		g.fillRect(this.x_coord, this.y_coord, this.width, this.height);
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override //metodo de colision
	public void collisionWith(Actor actorCollisioned) {
		super.collisionWith(actorCollisioned);
		// si el ladrillo colisiona con un objeto tipo bola
		if (actorCollisioned instanceof Ball) {
			this.setMarkedForRemoval(true); //se marcara para ser borrado
			//creo una explosion centrandolo en mitad del ladrillo
			Explosion ex = new Explosion();
			ex.setX_coord(this.x_coord + (this.width / 2) - ex.getWidth() / 2);
			ex.setY_coord(this.y_coord + (this.height / 2) - ex.getHeight() / 2);
			//lo añado a la lista de siguiente iteraccion de actores
			Arkanoid.getInstance().newIteractionActors.add(ex);
			//SoundsRepository.getInstance().playSound("explosion.wav");
			
		}
	}
	
}
