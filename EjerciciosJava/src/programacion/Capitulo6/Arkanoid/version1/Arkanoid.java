package programacion.Capitulo6.Arkanoid.version1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
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
	Ball ball = null;
	Nave nave = null;

	private long usedTime; // Tiempo usado en cada iteracion del bucle principal
	private static final int SPEED_FPS = 60; // VELOCIDAD DE FOTOGRAMAS
	private BufferStrategy strategy;

	/**
	 * 
	 */

	public Arkanoid() {
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
		SoundsRepository.getInstance().playSound("Arkanoid-start-of-stage.wav");
		int x_coord = 10;
		int y_coord = 10;
		// creacion de ladrillos
		for (int i = 0; i < 6; i++) { //bucle por filas
			for (int j = 0; j < 12; j++) {//bucle por columnas
				Brick b = new Brick(); //creo un nuevo ladrillo
				b.setX_coord(x_coord); //le asigno la coordenada X
				b.setY_coord(y_coord); //le asigno la coordenada y
				actors.add(b); //lo a�ado a la lista de actores
				x_coord += b.getWidth()+2; //por cada ladrillo a la coordenada x le sumo su ancho mas 2u de separacion entre ladrillos
				 //asigno los colores segun las filas
				if (i==0) b.setColor(Color.BLUE); 
				if (i==1) b.setColor(Color.RED);
				if (i==2) b.setColor(Color.ORANGE);
				if (i==3) b.setColor(Color.GREEN);
				if (i==4) b.setColor(Color.YELLOW);
				if (i==5) b.setColor(Color.CYAN);
				
			}
			
			x_coord = 10;
			y_coord += 17;
		}

		Ball ball = new Ball(); // creo una pelota
		this.actors.add(ball); // a�ado la pelota a la lista de actors
		this.ball = ball;
		


		Nave nave = new Nave(); // creo una nave
		this.actors.add(nave); // a�ado la nave a la lista de actors
		this.nave = nave; // puntero hacia la nave
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
		

	}

	/**
	 * 
	 */
	public void game() {
		// inicio del juego
		initWorld();
		// el juego se ejecutar� mientras el canvas sea visible
		while (isVisible()) {
			long startTime = System.currentTimeMillis(); // capturo los milis antes de crear el siguiente frame
			// actualizo y pinto escena
			updateWorld();
			paintWorld();
			usedTime = System.currentTimeMillis() - startTime;
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

	/**
	 * 
	 */
	public void paintWorld() {

		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		// pinto el fondo con un rectangulo negro ocupand todo el canvas
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		// llamo al metodo paint de todos los objetos de la lista actors para que se
		// representen
		for (Actor a : this.actors) {
			a.paint(g);
		}
		strategy.show();

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
	
	

}
