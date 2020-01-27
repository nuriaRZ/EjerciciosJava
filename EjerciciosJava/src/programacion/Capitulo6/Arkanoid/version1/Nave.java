package programacion.Capitulo6.Arkanoid.version1;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class Nave extends Actor implements KeyListener, MouseMotionListener, MouseListener{
	
	private BufferedImage image;
	private boolean left, right, space, click; //BANDERAS QUE QUE APUNTARAN A LAS TECLAS CON LAS QUE SE MOVERA LA NAVE
	protected int vx; //cantidad de pixeles que aumentara al moverse de la posicion actual 
	protected static final int SPEED = 4; // VELOCIDAD DEL MOVIMIENTO DE LA NAVE
	private int contador = 0;
	
	public Nave() {


		//definicion de coordenadas del inicio del juego
		this.x_coord = 165;
		this.y_coord = 400;
		image = SpritesRepository.getInstance().getSprite("nave-50x15.png"); //carga de la imagen para mas fluidez
		this.width = this.image.getWidth();
		this.height = this.image.getHeight();
		
		
	}

	 //metodo en el que se pinta la imagen de la nave
	public void paint(Graphics2D g) {
		drawImage(g);
	
	}
	private void drawImage (Graphics2D g) {
		g.drawImage(this.image, this.x_coord, this.y_coord, null);
	}

	@Override 
	public void act() {
		
		if (contador == 0) {
			Arkanoid.getInstance().getBall().setX_coord(getX_coord() + (getWidth()/2) -6);
			Arkanoid.getInstance().getBall().setY_coord(getY_coord() - (getHeight()+3));
		}
		
		//la nave solo se mover� sobre el eje x
		this.x_coord += this.vx;
		
		//limitacion del movimiento de la nave de manera que si llega a los bordes de la ventana no salga de la pantalla
		if (this.x_coord < 0 ) { this.x_coord = 0; }
		if (this.x_coord > (Arkanoid.getInstance().getWidth() - this.getWidth())) {
			this.x_coord = Arkanoid.getInstance().getWidth() - this.getWidth();
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
		case KeyEvent.VK_SPACE: space = true; break;
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
		case KeyEvent.VK_SPACE: space = false; break;
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
		if (space) {
			contador++;
			Arkanoid.getInstance().getBall().act();
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		setX_coord(e.getX());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		switch (e.getButton()) {
		case MouseEvent.BUTTON1: space = true; break;


		default:
			break;
		}
		updateSpeed();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
