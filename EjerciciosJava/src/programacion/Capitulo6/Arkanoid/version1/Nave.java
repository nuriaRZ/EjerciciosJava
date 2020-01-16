package programacion.Capitulo6.Arkanoid.version1;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Nave extends Actor implements KeyListener{
	
	private BufferedImage image;
	private boolean left, right; //BANDERAS QUE QUE APUNTARAN A LAS TECLAS CON LAS QUE SE MOVERA LA NAVE
	protected int vx; //cantidad de pixeles que aumentara al moverse de la posicion actual 
	protected static final int SPEED = 4; // VELOCIDAD DEL MOVIMIENTO DE LA NAVE

	public Nave() {
		
		//definicion de coordenadas del inicio del juego
		this.x_coord = 165;
		this.y_coord = 400;
		image = SpritesRepository.getInstance().getSprite("nave-50x15.png"); //carga de la imagen para mas fluidez
		this.width = this.image.getWidth();
		this.height = this.image.getHeight();
		
		
	}

	@Override //metodo en el que se pinta la imagen de la nave
	public void paint(Graphics g) {
		drawImage(g);
	
	}
	private void drawImage (Graphics g) {
		g.drawImage(this.image, this.x_coord, this.y_coord, null);
	}

	@Override 
	public void act() {
		//la nave solo se mover� sobre el eje x
		this.x_coord += this.vx;
		
		//limitacion del movimiento de la nave de manera que si llega a los bordes de la ventana no salga de la pantalla
		if (this.x_coord < 0 ) { this.x_coord = 0; }
		if (this.x_coord > (Arkanoid.getInstance().getWidth() - 25)) {
			this.x_coord = Arkanoid.getInstance().getWidth() - 25;
		}
	}
	/**
	 * al pulsar la tecla se activa la bandera
	 */

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT: right = true; break; 	
		case KeyEvent.VK_LEFT: left = true; break;	

		default:
			break;
		}
		updateSpeed();
	}
	/**
	 * al dejar de pulsar la tecla se desactiva la bandera
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT: right = false; break;	
		case KeyEvent.VK_LEFT: left = false; break;	

		default:
			break;
		}
		updateSpeed();
			
	}
	/**
	 * actualizacion de la velovidad segun la direccion que tome la nave
	 */
	protected void updateSpeed() {
		vx = 0;
		if (left) vx = -SPEED;
		if (right) vx = SPEED;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
