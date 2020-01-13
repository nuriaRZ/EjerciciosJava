package programacion.Capitulo6.Arkanoid.version1;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Nave extends Objeto{
	
	private BufferedImage image;

	public Nave() {
		super();
		this.x_coord = 135;
		this.y_coord = 400;
		image = SpritesRepository.getInstance().getSprite("nave-25x7.png");
		
	}

	@Override
	public void paint(Graphics g) {
		drawImage(g);
	
	}
	
	private void drawImage (Graphics g) {
		g.drawImage(this.image, this.x_coord, this.y_coord, null);
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	
		

}
