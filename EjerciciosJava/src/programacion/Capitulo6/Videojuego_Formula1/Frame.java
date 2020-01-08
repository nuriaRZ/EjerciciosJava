package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class Frame extends Canvas {
	Race kart = new Race();
	
	JFrame frame = new JFrame("SeepdRace");
	protected static final int WIDTH = 1000;
	protected static final int HEIGHT = 400;
	private static Frame instance = null;
	
	
	public Frame() {
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);		
		frame.setBounds(0, 0, WIDTH, HEIGHT);
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (e.getButton() == MouseEvent.BUTTON1) {
					kart.avanzar();
					Frame.getInstance().repaint();
					Frame.getInstance().revalidate();
				}
				
			}
			
		});
				
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				closeApplication(e);
			}
		});
		
		frame.setVisible(true);
		this.requestFocus();
	}
	
	public void closeApplication(WindowEvent e) {
		String options[] = {"Aceptar", "Cancelar"};
		int choice = JOptionPane.showOptionDialog(frame, "¿Desea terminar la partida?", "Salir del juego", JOptionPane.YES_NO_OPTION 
				,JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
		if (choice == JOptionPane.YES_OPTION) {
			System.exit(0);
			}
	}
	
	@Override
	public void paint(Graphics g) {		
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Frame.getInstance().getWidth(), Frame.getInstance().getHeight());
		
		for (Vehiculo vehiculo : kart.vehiculos ) {
			vehiculo.paint(g);
		}
		
//		if (kart.esFinDeJuego()) {
//			g.setColor(Color.WHITE);
//			g.fillRect(0, 0, this.getWidth(), this.getHeight());
//		}
	}
	/**
	 * @return the instance
	 */
	public static Frame getInstance() {
		if (instance == null) {
			instance = new Frame();
		}
		return instance;
	}
	/**
	 * @return the kart
	 */
	public Race getKart() {
		return kart;
	}

	/**
	 * @param kart the kart to set
	 */
	public void setKart(Race kart) {
		this.kart = kart;
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
	public static void setInstance(Frame instance) {
		Frame.instance = instance;
	}
	
	public static int getWidht() {
		return Frame.WIDTH;
	}
	


	
}
