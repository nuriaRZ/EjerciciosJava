package entornos.MatrizDeBotones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class matrizDeBotones {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matrizDeBotones window = new matrizDeBotones();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public matrizDeBotones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		int X_COORD = 12;
		int Y_COORD = 12;
		int matriz[][] = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				
				JButton JButton = new JButton();
				JButton.setBounds(X_COORD, Y_COORD, 55, 49);
				JButton.setText(Integer.toString(j+1));
				frame.getContentPane().add(JButton);
				X_COORD += 55; 
			}
			Y_COORD += 49;
			X_COORD = 12;
		}
		
		
		
		
	}
}
