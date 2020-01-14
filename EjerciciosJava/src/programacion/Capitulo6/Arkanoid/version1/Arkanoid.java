package programacion.Capitulo6.Arkanoid.version1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
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
	private static final int WIDTH = 300;
	private static final int HEIGHT = 500;
	private static Arkanoid instance = null;
	public List<Ladrillo> wall = new ArrayList<Ladrillo>();
	Pelota ball = new Pelota();
	Objeto nave = new Nave();
	
	
	
	private long usedTime; //Tiempo usado en cada iteracion del bucle principal
	private static final int SPEED_FPS = 60; //VELOCIDAD DE FOTOGRAMAS
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
		String options[] = {"Aceptar", "Cancelar"};
		int choice = JOptionPane.showOptionDialog(frame, "�Desea terminar la partida?", "Salir del juego", JOptionPane.YES_NO_OPTION 
				,JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
		if (choice == JOptionPane.YES_OPTION) {
			System.exit(0);
			}
	}
	/**
	 * 
	 */
	public void initWorld() {
		int x_coord = 10;
		int y_coord = 10;
		//creo fila de ladrillos
		for (int i = 0; i < 12; i++) {
			Ladrillo l = new Ladrillo();
			l.setColor(Color.RED);
			l.setX_coord(x_coord);
			l.setY_coord(y_coord);
			wall.add(l);			
			x_coord += l.getWidth() + 2;
		}
		x_coord = 10;
		y_coord += 12;
		for (int i = 0; i < 12; i++) {
			Ladrillo l = new Ladrillo();
			l.setColor(Color.YELLOW);
			l.setX_coord(x_coord);
			l.setY_coord(y_coord);
			x_coord += l.getWidth() + 2;
			wall.add(l);			
			
		}
		
		x_coord = 10;
		y_coord += 12;
		for (int i = 0; i < 12; i++) {
			Ladrillo l = new Ladrillo();
			l.setColor(Color.BLUE);
			l.setX_coord(x_coord);
			l.setY_coord(y_coord);
			x_coord += l.getWidth() + 2;
			wall.add(l);			
			
		}
		
		x_coord = 10;
		y_coord += 12;
		for (int i = 0; i < 12; i++) {
			Ladrillo l = new Ladrillo();
			l.setColor(Color.PINK);
			l.setX_coord(x_coord);
			l.setY_coord(y_coord);
			x_coord += l.getWidth() + 2;
			wall.add(l);			
			
		}
		
		x_coord = 10;
		y_coord += 12;
		for (int i = 0; i < 12; i++) {
			Ladrillo l = new Ladrillo();
			l.setColor(Color.GREEN);
			l.setX_coord(x_coord);
			l.setY_coord(y_coord);
			x_coord += l.getWidth() + 2;
			wall.add(l);			
			
		}
		x_coord = 10;
		y_coord += 12;
		for (int i = 0; i < 12; i++) {
			Ladrillo l = new Ladrillo();
			l.setColor(Color.CYAN);
			l.setX_coord(x_coord);
			l.setY_coord(y_coord);
			x_coord += l.getWidth() + 2;
			wall.add(l);			
			
		}
	}
	/**
	 * 
	 */
	public void updateWorld() {
	ball.act();	
		
	}
	/**
	 * 
	 */
	public void game() {
		initWorld();		
		
		while (isVisible()) {
			
			updateWorld();			
			paintWorld();
			
			try {
				Thread.sleep(SPEED_FPS);
				
			}catch (InterruptedException e) {}
			
		}
	}
/**
 * 
 */
	public void paintWorld() {
		
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
				
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for (Ladrillo l : this.wall) {			
			l.paint(g);
		}		
		ball.paint(g);
		nave.paint(g);
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


	
	

}
