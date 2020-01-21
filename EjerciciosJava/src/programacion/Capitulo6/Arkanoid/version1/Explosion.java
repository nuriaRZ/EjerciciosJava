package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Explosion extends Actor {
	public String[] SPRITES = new String[]{"sprite-explosion1.png", "sprite-explosion2.png", "sprite-explosion3.png", "sprite-explosion4.png",
		"sprite-explosion5.png", "sprite-explosion6.png", "sprite-explosion7.png", "sprite-explosion8.png", "sprite-explosion9.png"};
	

	public Explosion() {
		
	}


	@Override
	public void paint(Graphics g) {		
		
	}


	@Override
	public void act() {		
		super.act();
		
		if (this.spriteActual.equals(this.sprites.get(this.sprites.size()-1))){
			this.setMarkedForRemoval(true);
		}
	}
	
	

}