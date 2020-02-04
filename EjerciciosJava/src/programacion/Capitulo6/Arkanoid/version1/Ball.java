package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

public class Ball extends Actor {

	protected int vx; // cantidad de pixeles que aumentar� en su movimiento
	protected int vy;
	protected boolean space;	
	private PuntoAltaPrecision coordenadas = null;
	private TrayectoriaRecta trayectoria = null;
	private long millisEnInicializacion = 0;
	private float distanciaSiguienteFrame = 5; 
	private float aceleracion = 1.00005f;
	private static int MAX_VELOCIDAD = 13;
	
	
	

	public Ball() {
		super();
		this.color = Color.WHITE;		
		this.height = 15;
		this.width = 15;
		this.vx = 3;
		this.vy = 3;
		this.millisEnInicializacion = new Date().getTime();


	}

	public void paint(Graphics2D g) {
		g.setColor(getColor());
		g.fillOval(this.x_coord, this.y_coord, this.width, this.height);


	}

	@Override
	public void act() {
		Nave nave = Arkanoid.getInstance().getNave();
		
		if (trayectoria == null) {
			long millisAhora = new Date().getTime();
			if (millisAhora - millisEnInicializacion > 5000) {
				lanzarPelota();
			}
			else {
				this.x_coord = nave.getX_coord() + nave.getWidth()/2 - width/2;
				this.y_coord = nave.getY_coord() - this.height - 1;
			}
		}
		else {//si ya existe una trayectoria
			if (this.y_coord < 0 ) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			}
			
			if (this.x_coord < 0 || this.x_coord > Arkanoid.getInstance().getWidth() - this.width) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
			}
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, this.distanciaSiguienteFrame);
			this.x_coord = Math.round(this.coordenadas.x);
			this.y_coord = Math.round(this.coordenadas.y);
			
			if (this.distanciaSiguienteFrame < MAX_VELOCIDAD) {
				this.distanciaSiguienteFrame *= aceleracion;
			}
			
		}

		
	}
	




	@Override
	public void collisionWith(Actor actorCollisioned) {

		super.collisionWith(actorCollisioned);
		Brick brick = Arkanoid.getInstance().getBrick();
		if (actorCollisioned instanceof Brick || actorCollisioned instanceof Nave) {
			trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
		
		}
		


	}
	



	public void lanzarPelota() {
				
		this.coordenadas = new PuntoAltaPrecision(this.x_coord, this.y_coord);
		this.trayectoria = new TrayectoriaRecta (-1.02f, coordenadas, true);
		SoundsRepository.getInstance().playSound("Arkanoid-SFX-02.wav");
	}
	
	public void resetBall() {
		Nave nave = Arkanoid.getInstance().getNave();
		millisEnInicializacion = new Date().getTime();
		trayectoria = null;
		distanciaSiguienteFrame = 5;
		nave.setX_coord(Arkanoid.getInstance().getWidth()/2);
		nave.setSeHaPresionadoBoton(false);
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
	 * @return the coordenadas
	 */
	public PuntoAltaPrecision getCoordenadas() {
		return coordenadas;
	}

	/**
	 * @param coordenadas the coordenadas to set
	 */
	public void setCoordenadas(PuntoAltaPrecision coordenadas) {
		this.coordenadas = coordenadas;
	}

	/**
	 * @return the trayectoria
	 */
	public TrayectoriaRecta getTrayectoria() {
		return trayectoria;
	}

	/**
	 * @param trayectoria the trayectoria to set
	 */
	public void setTrayectoria(TrayectoriaRecta trayectoria) {
		this.trayectoria = trayectoria;
	}

	/**
	 * @return the millisEnInicializacion
	 */
	public long getMillisEnInicializacion() {
		return millisEnInicializacion;
	}

	/**
	 * @param millisEnInicializacion the millisEnInicializacion to set
	 */
	public void setMillisEnInicializacion(long millisEnInicializacion) {
		this.millisEnInicializacion = millisEnInicializacion;
	}

	/**
	 * @return the distanciaSiguienteFrame
	 */
	public float getDistanciaSiguienteFrame() {
		return distanciaSiguienteFrame;
	}

	/**
	 * @param distanciaSiguienteFrame the distanciaSiguienteFrame to set
	 */
	public void setDistanciaSiguienteFrame(float distanciaSiguienteFrame) {
		this.distanciaSiguienteFrame = distanciaSiguienteFrame;
	}

	/**
	 * @return the aceleracion
	 */
	public float getAceleracion() {
		return aceleracion;
	}

	/**
	 * @param aceleracion the aceleracion to set
	 */
	public void setAceleracion(float aceleracion) {
		this.aceleracion = aceleracion;
	}
	/**
	 * @return the remainingLives
	 */






}
