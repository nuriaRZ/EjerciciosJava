package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame extends Canvas {
	JFrame frame = new JFrame("SeepdRace");
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private static Frame instance = null;
	List <Pista> pista = new ArrayList<Pista>();
	
	public Frame() {
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);		
		frame.setBounds(0, 0, WIDTH, HEIGHT);
		frame.setVisible(true);
		this.requestFocus();
	}
	
	@Override
	public void paint(Graphics g) {		
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for (Pista p : pista) {
			p.paint(g);
		}
	}
	/**
	 * 
	 * @return
	 */
	public static Frame getInstance() {
		if (instance == null) {
			instance = new Frame();
		}
		return instance;
	}
}
