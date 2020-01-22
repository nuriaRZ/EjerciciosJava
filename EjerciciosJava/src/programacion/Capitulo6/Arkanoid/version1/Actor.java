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
	protected BufferedImage currentSprite = null; //sprite actual
	private int timeUnit = 0; //unidad de tiempo que aumentara cada vez que se llama al metodo act
	protected int spriteChangeSpeed = 0; //nos indica cada cuanto tiempo debemos mostrar el siguiente sprite
	

	
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
	}
	
	//para cuando el actor solo tiene un unico sprite
	
	Actor(String spriteName){
		this.spriteChangeSpeed = 1;
		cargarImagenesDeSprite(new String[] { spriteName });
	}
	/**
	 *indica los nombres de los sprites que utiliza el actor
	 * @param spriteNames
	 */
	public Actor (String spriteNames[]) {
		this.spriteChangeSpeed = 1;
		cargarImagenesDeSprite(spriteNames);
	}
	/**
	 * 
	 * @param spriteNames
	 * @param velocidadDeCambioDeSprite
	 */
	public Actor(String spriteNames[], int spriteChangeSpeed) {
		this.spriteChangeSpeed = spriteChangeSpeed;
		cargarImagenesDeSprite(spriteNames);
	}
	/**
	 * cargar la lista de imagenes que constituyen el sprite
	 * @param spriteNames
	 */
	private void cargarImagenesDeSprite(String spriteNames[]) {
		for (String sprite : spriteNames) {
			this.sprites.add(SpritesRepository.getInstance().getSprite(sprite));
		}
		//ajusto el primer sprite del actor
		if (this.sprites.size() > 0) {
			this.currentSprite = this.sprites.get(0);
		}
		adjustHeightAndWidth();
	}
	/**
	 * ajusta el tamaño de los sprites segun su height and width
	 */
	private void adjustHeightAndWidth() {
		if (this.sprites.size() > 0) {
			this.height = this.sprites.get(0).getHeight();
			this.width = this.sprites.get(0).getWidth();			
		}
		
		for (BufferedImage sprite: this.sprites) {
			if (sprite.getWidth() > this.width) {
				this.width = sprite.getWidth();
			}
			if (sprite.getHeight() > this.height) {
				this.height = sprite.getHeight();
			}
		}
	}
		

	/**
	 * pinta el sprite actual en las coordenadas establecidas
	 * @param g
	 */	
	public void paint(Graphics2D g) {
		g.drawImage(this.currentSprite, this.x_coord, this.y_coord, null);
	}

	/**
	 * metodo que hace que realiza la animacion de las imagenes con el calculo de unidades de tiempo y cambio de imagen
	 * @return the color
	 */
	public void act() {
		if (this.sprites != null && this.sprites.size() > 1) {
			timeUnit++;
			
			if (timeUnit % spriteChangeSpeed == 0) {
				timeUnit = 0;
				
				int indexCurrentSprite = sprites.indexOf(this.currentSprite);
				int indiceNextSprite = (indexCurrentSprite + 1) % sprites.size();
				this.currentSprite = sprites.get(indiceNextSprite);
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
	
	public BufferedImage getImage() {
		return currentSprite;
	}
	
	public void setImage (BufferedImage image) {
		this.currentSprite = image;
		this.adjustHeightAndWidth();
	}


	
	
	
	

	

}
