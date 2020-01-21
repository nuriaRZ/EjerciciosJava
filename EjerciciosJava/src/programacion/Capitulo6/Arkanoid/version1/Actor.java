package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public abstract class Actor {
	
	public Color color;
	public int x_coord, y_coord;
	public int width, height;
	protected boolean markedForRemoval = false; //cuando el objeto deba ser eliminado se pondra a true
	public List <BufferedImage> sprites = new ArrayList<BufferedImage>();
	protected BufferedImage spriteActual = null;
	private int unidadDeTiempo = 0;
	protected int velocidadDeCambioDeSprite = 0;
	

	
	/**
	 * @param nombre
	 * @param color
	 * @param x_coord
	 * @param y_coord
	 * @param width
	 * @param height
	 */
	public Actor() {
		super();
		
		this.color = color;
		this.x_coord = x_coord;
		this.y_coord = y_coord;
		this.width = width;
		this.height = height;
	}
	/**
	 * 
	 * @param spriteNames
	 */
	public Actor (String spriteNames[]) {
		this.velocidadDeCambioDeSprite = 1;
		cargarImagenesDeSprite(spriteNames);
	}
	/**
	 * 
	 * @param spriteNames
	 * @param velocidadDeCambioDeSprite
	 */
	public Actor(String spriteNames[], int velocidadDeCambioDeSprite) {
		this.velocidadDeCambioDeSprite = velocidadDeCambioDeSprite;
		cargarImagenesDeSprite(spriteNames);
	}
	/**
	 * 
	 * @param spriteNames
	 */
	private void cargarImagenesDeSprite(String spriteNames[]) {
		for (String sprite : spriteNames) {
			this.sprites.add(SpritesRepository.getInstance().getSprite(sprite));
		}
		
		if (this.sprites.size() > 0) {
			this.spriteActual = this.sprites.get(0);
		}
		adjustHeightAndWidth();
	}
	/**
	 * 
	 */
	private void adjustHeightAndWidth() {
		if (this.sprites.size() > 0) {
			this.height = this.sprites.get(0).getHeight();
			this.width = this.sprites.get(0).getWidth();			
		}
		
		for (BufferedImage sprite: this.sprites) {
			if (this.spriteActual.getHeight() > this.width) {
				this.width = sprite.getWidth();
			}
			if (this.spriteActual.getHeight() > this.height) {
				this.height = sprite.getHeight();
			}
		}
	}
		

	/**
	 * 
	 * @param g
	 */	
	public abstract void paint(Graphics g);

	/**
	 * @return the color
	 */
	public void act() {
		if (this.sprites != null && this.sprites.size() > 1) {
			unidadDeTiempo++;
			
			if (unidadDeTiempo % velocidadDeCambioDeSprite == 0) {
				unidadDeTiempo = 0;
				
				int indiceSpriteActual = sprites.indexOf(this.spriteActual);
				int indiceNextSprite = (indiceSpriteActual + 1) % sprites.size();
				this.spriteActual = sprites.get(indiceNextSprite);
			}
		}
	}
	/**
	 * 
	 */
	public void collisionWith (Actor actorCollisioned) {}

	/**
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return the x_coord
	 */
	public int getX_coord() {
		return x_coord;
	}
	/**
	 * @param x_coord the x_coord to set
	 */
	public void setX_coord(int x_coord) {
		this.x_coord = x_coord;
	}
	/**
	 * @return the y_coord
	 */
	public int getY_coord() {
		return y_coord;
	}
	/**
	 * @param y_coord the y_coord to set
	 */
	public void setY_coord(int y_coord) {
		this.y_coord = y_coord;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the markedForRemoval
	 */
	public boolean isMarkedForRemoval() {
		return markedForRemoval;
	}
	/**
	 * @param markedForRemoval the markedForRemoval to set
	 */
	public void setMarkedForRemoval(boolean markedForRemoval) {
		this.markedForRemoval = markedForRemoval;
	}


	
	
	
	

	

}
