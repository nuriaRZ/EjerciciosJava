package programacion.Capitulo6.Tres_En_Raya.game;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frame extends Canvas  {
	JFrame frame = new JFrame("Tres en raya");
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private static Frame instance = null;
	List <Square> board = new ArrayList<Square>();
	
	public static int PLAYER_1 = 1;
	public static int PLAYER_2 = 2;
	private int turn = PLAYER_1;
	public int cuentaDeClicDelP1=1; //como empieza con el turno del jugador 1 ya le sumamos el valor 1
	
	
	
	private int matrix[][] = new int[][] {{0, 0, 0},
										  {0, 0, 0},
										  {0, 0, 0}};
	

	public Frame() {
		SoundsRepository.getInstance();
		SpritesRepository.getInstance();
		
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);		
		frame.setBounds(0, 0, WIDTH, HEIGHT);
		initializeBoard();
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {				
				super.mouseClicked(e);
				if (e.getButton() == MouseEvent.BUTTON1) {
					for (Square s : board) {
						if (s.clicInSquare(e.getX(), e.getY())) {
							s.clic(turn);
							esTresEnRaya();
							endInATie();
							if (turn == PLAYER_1) {
								SoundsRepository.getInstance().playSound("vader_breath.wav");
								turn = PLAYER_2;
								
							}
							else {
								SoundsRepository.getInstance().playSound("lightsab.wav");
								turn = PLAYER_1;
								cuentaDeClicDelP1++;
								
							}
						}
					}
				}
			}
			
		});
		
		SoundsRepository.getInstance().loopSound("star_wars_sound.wav");
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				closeApplication(e);
				super.windowClosing(e);
			}
			
			
			
		});
		frame.setVisible(true);
		this.requestFocus();
	}
	/**
	 * 
	 * @param e
	 */	
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
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for (Square s : board) {
			s.paint(g);
		}
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
	 * @param instance the instance to set
	 */
	private void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.board.add(new Square(i, j));//añadir un nuevo cuadrado en la posicion i,j
			}
			
		}
	}
	/**
	 * 
	 */
	public void esTresEnRaya() {

		// probabilidades de 3 en rayas de player_1
		if ((matrix[0][0] == PLAYER_1 && matrix[0][1] == PLAYER_1 && matrix[0][2] == PLAYER_1)// fila i=0
				|| (matrix[1][0] == PLAYER_1 && matrix[1][1] == PLAYER_1 && matrix[1][2] == PLAYER_1)// fila i=1
				|| (matrix[2][0] == PLAYER_1 && matrix[2][1] == PLAYER_1 && matrix[2][2] == PLAYER_1)// fila i=2
				|| (matrix[0][0] == PLAYER_1 && matrix[1][0] == PLAYER_1 && matrix[2][0] == PLAYER_1)// columna j=0
				|| (matrix[0][1] == PLAYER_1 && matrix[1][1] == PLAYER_1 && matrix[2][1] == PLAYER_1)// columna j=1
				|| (matrix[0][2] == PLAYER_1 && matrix[1][2] == PLAYER_1 && matrix[2][2] == PLAYER_1)// columna j=2
				|| (matrix[0][0] == PLAYER_1 && matrix[1][1] == PLAYER_1 && matrix[2][2] == PLAYER_1)//diagonal principal
				|| (matrix[0][2] == PLAYER_1 && matrix[1][1] == PLAYER_1 && matrix[2][0] == PLAYER_1)) { //diagonal secundaria

			JOptionPane.showMessageDialog(null, "TRES EN RAYAS!! HA GANADO EL JUGADOR 1");
			System.exit(0);
		} 
		else {
			if ((matrix[0][0] == PLAYER_2 && matrix[0][1] == PLAYER_2 && matrix[0][2] == PLAYER_2)// fila i=0
					|| (matrix[1][0] == PLAYER_2 && matrix[1][1] == PLAYER_2 && matrix[1][2] == PLAYER_2)// fila i=1
					|| (matrix[2][0] == PLAYER_2 && matrix[2][1] == PLAYER_2 && matrix[2][2] == PLAYER_2)// fila i=2
					|| (matrix[0][0] == PLAYER_2 && matrix[1][0] == PLAYER_2 && matrix[2][0] == PLAYER_2)// columna j=0
					|| (matrix[0][1] == PLAYER_2 && matrix[1][1] == PLAYER_2 && matrix[2][1] == PLAYER_2)// columna j=1
					|| (matrix[0][2] == PLAYER_2 && matrix[1][2] == PLAYER_2 && matrix[2][2] == PLAYER_2)// columna j=2
					|| (matrix[0][0] == PLAYER_2 && matrix[1][1] == PLAYER_2 && matrix[2][2] == PLAYER_2)//diagonal principal
					|| (matrix[0][2] == PLAYER_2 && matrix[1][1] == PLAYER_2 && matrix[2][0] == PLAYER_2)) { //diagonal secundaria) 

				JOptionPane.showMessageDialog(null, "TRES EN RAYAS!! HA GANADO EL JUGADOR 2");
				System.exit(0);
			}
		}
	}
		
	
	/**
	 * 
	 */
	public void endInATie() {
	//Si el jugador 1 llega a los 5 clic significará que el juego a llegado a empate
		if (cuentaDeClicDelP1==5) {
			JOptionPane.showMessageDialog(null, "EMPATE");
			System.exit(0);
		}
		
	}
	
	/**
	 * @return the matrix
	 */
	public int[][] getMatrix() {
		return matrix;
	}
	/**
	 * @param matrix the matrix to set
	 */
	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}	
	
	

}
