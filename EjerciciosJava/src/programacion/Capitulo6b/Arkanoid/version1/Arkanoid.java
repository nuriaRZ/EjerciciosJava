package programacion.Capitulo6b.Arkanoid.version1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import programacion.Utils;

public class Arkanoid extends Canvas {
	JFrame frame = new JFrame("Arkanoid");
	private static final int WIDTH = 350;
	private static final int HEIGHT = 500;
	private static Arkanoid instance = null;
	public List<Actor> actors = new ArrayList<Actor>();
	public List<Actor> newIteractionActors = new ArrayList<Actor>();
	Ball ball = new Ball();
	Nave nave = new Nave();
	Brick brick = null;
	public int remainingLives = 5;
	public boolean getLevel = false;
	public boolean nextBackGround = false;
	public List<Level> levels = new ArrayList<Level>();
	Level activeLevel = null;
	Level level01 = new Level01();
	Level level02 = new Level02();
	



	private long usedTime; // Tiempo usado en cada iteracion del bucle principal
	private static final int SPEED_FPS = 60; // VELOCIDAD DE FOTOGRAMAS
	private BufferStrategy strategy;

	/**
	 * 
	 */

	public Arkanoid() {
		this.levels.add(level01);
		this.levels.add(level02);
		
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);
		frame.setBounds(0, 0, WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				closeApplication(e);
				super.windowClosing(e);
			}
		});

		
		
		frame.setResizable(false);
		frame.setIgnoreRepaint(true);
		this.createBufferStrategy(2);
		strategy = getBufferStrategy();

		this.requestFocus();
	}

	/**
	 * 
	 * @param e
	 */
	public void closeApplication(WindowEvent e) {
		String options[] = { "Aceptar", "Cancelar" };
		int choice = JOptionPane.showOptionDialog(frame, "�Desea terminar la partida?", "Salir del juego",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
		if (choice == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	

	

	/**
	 * Metodo responsable de inicializar el juego de 0
	 */
	public void initWorld() {
		if (getLevel == true) {			
			this.activeLevel = level02;
			getBall().resetBall();
	
		}else this.activeLevel = level01;
		
		this.activeLevel.inicializarFase();
		this.actors.clear();
		this.actors.addAll(this.activeLevel.getActors());

		
		this.actors.add(ball); // a�ado la pelota a la lista de actors
		
		this.actors.add(nave); // a�ado la nave a la lista de actors
		

		this.addKeyListener(nave); // le agrego un listener de teclado
		this.addMouseMotionListener(nave);
		this.addMouseListener(nave);		
		ball.setX_coord(nave.x_coord);
		ball.setY_coord(nave.getY_coord() - (nave.getHeight()+5));
	

	}

	/**
	 * @return the nave
	 */
	public Nave getNave() {
		return nave;
	}

	/**
	 * @param nave the nave to set
	 */
	public void setNave(Nave nave) {
		this.nave = nave;
	}

	/**
	 * 
	 */
	public void updateWorld() {
		
		
		//lista donde a�ado los actores que seran eliminados al colisionar
		List<Actor> actorsForRemoval = new ArrayList<Actor>();
		for (Actor a : this.actors) {

			if (a.isMarkedForRemoval()) {
				actorsForRemoval.add(a);
			}
		}
		
		//eliminino los actores marcados para borrar
		for (Actor a : actorsForRemoval) {
			actors.remove(a);
		}
		//limpio la lista de actores a borrar
		actorsForRemoval.clear();
		//en esta lista se a�adiran actores que tambien seran borrados como las explosiones
		this.actors.addAll(newIteractionActors);
		this.newIteractionActors.clear();

		

		for (Actor actor1 : this.actors) {
			//si el actor 1 es una pelota creo un rectangulo con sus dimensiones y recorro el otro bucle que crear� rectangulos
			// con las dimensiones de los demas objetos
			if (actor1 instanceof Ball) { 
				Rectangle rect1 = new Rectangle(actor1.getX_coord(), actor1.getY_coord(), actor1.getWidth(),
						actor1.getHeight());

				for (Actor actor2 : this.actors) {
					if (!actor2.equals(actor1) && !actor2.isMarkedForRemoval() && !actor1.isMarkedForRemoval()) {
						Rectangle rect2 = new Rectangle(actor2.getX_coord(), actor2.getY_coord(), actor2.getWidth(),
								actor2.getHeight());
						
						//si un rectangulo intersecta con el otro, se producira una colision
						if (rect1.intersects(rect2)) {
							actor1.collisionWith(actor2);
							actor2.collisionWith(actor1);

							if (actor1 instanceof Ball && actor2 instanceof Brick) {								
								break;
							}
						}
					}

				}

			}
		}
		
		// llamo al metodo act de todos los objetos agregados a mi lista de actors
		for (Actor a : this.actors) {
			a.act();
		}
		int contador = 0;
		for (Actor a : this.actors) {
			if(a instanceof Brick) {
				contador++;
			}			

		}
		if (contador == 0) {
			getLevel = true;
			initWorld();
			
		}
		

	}

	/**
	 * 
	 */
	public void game() {
		// inicio del juego
		initWorld();
		SoundsRepository.getInstance().playSound(this.activeLevel.getNombreSonidoInicio());
		// el juego se ejecutar� mientras el canvas sea visible
		while (isVisible()) {
			long startTime = System.currentTimeMillis(); // capturo los milis antes de crear el siguiente frame
			// actualizo y pinto escena
			updateWorld();			
			paintWorld();
			usedTime = System.currentTimeMillis() - startTime;
		
			loseLives();

			

			// hago que el bucle pare unos millis antes de crear la siguiente escena
			try {
				int millisToSleep = (int) (1000 / SPEED_FPS - usedTime);
				if (millisToSleep < 0) {
					millisToSleep = 0;
				}
				Thread.sleep(millisToSleep);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			

		}
	}
	
	public void loseLives () {
		if (getBall().y_coord > Arkanoid.getInstance().getHeight() - getBall().height) {
			remainingLives--;
			SoundsRepository.getInstance().playSound(SoundsRepository.LOSE_LIVES);
			getBall().resetBall();
		}
		if (remainingLives == 0) {
			this.getBall().setMarkedForRemoval(true);
		}

	}
	
	public void paintLives (Graphics2D g) {

		for (int i = 0; i < this.remainingLives; i++) {
			BufferedImage life = SpritesRepository.getInstance().getSprite("life.png");
			int y_lives = 450;
			g.drawImage(life, i*life.getWidth(), y_lives, 25, 19, null );
			
			
		}
	}
	

	
	public void paintBackgroundLevel1(Graphics2D g) {
		BufferedImage levelOneBG = SpritesRepository.getInstance().getSprite("level1.jpg");
		g.drawImage(levelOneBG, 0, 0, this.getWidth(), this.getHeight(), null);
	}
	
	public void paintBackgroundLevel2(Graphics2D g) {
		BufferedImage levelTwoBG = SpritesRepository.getInstance().getSprite("level2.jpg");
		g.drawImage(levelTwoBG, 0, 0, this.getWidth(), this.getHeight(), null);
	}
	


	/**
	 * 
	 */
	public void paintWorld() {
		
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		// pinto el fondo con un rectangulo negro ocupand todo el canvas
		
		
			paintBackgroundLevel2(g);
			
		
		// llamo al metodo paint de todos los objetos de la lista actors para que se
		// representen
	
		for (Actor a : this.actors) {
			a.paint(g);
		}
		paintLives(g);
		paintScore(g);
		
		if (getBall().isMarkedForRemoval()==true) {
			
			BufferedImage gameOverImage = SpritesRepository.getInstance().getSprite("game-over.png");
			g.drawImage(gameOverImage, 5, this.HEIGHT-350, this.WIDTH-10, gameOverImage.getHeight(),null);
			this.strategy.show();
			
		}
		strategy.show();

	}
	
	public void paintScore(Graphics2D g) {
		g.setFont(new Font("Arial", Font.BOLD,20));
		g.setPaint(Color.green);
		g.drawString("Score:", this.WIDTH-100, this.HEIGHT-60 + 20);
		// En rojo pinta una cadena de texto con la puntuaci�n conseguida
		g.setPaint(Color.red);
		g.drawString(nave.getScore() + "", this.WIDTH-30, this.HEIGHT-60 + 20);
	}
	
	

	public static Arkanoid getInstance() {
		if (instance == null) {
			instance = new Arkanoid();
		}
		return instance;
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(Arkanoid instance) {
		Arkanoid.instance = instance;
	}

	public static void main(String[] args) {
		Arkanoid.getInstance().game();
	}

	/**
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}

	/**
	 * @param ball the ball to set
	 */
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	/**
	 * @return the brick
	 */
	public Brick getBrick() {
		return brick;
	}

	/**
	 * @param brick the brick to set
	 */
	public void setBrick(Brick brick) {
		this.brick = brick;
	}
	
	

}
