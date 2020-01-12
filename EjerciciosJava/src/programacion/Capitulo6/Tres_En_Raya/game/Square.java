package programacion.Capitulo6.Tres_En_Raya.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Square extends Canvas{
	private int X_POSITION, Y_POSITION;
	private int esquinaSupIzquierda_X, esquinaSupIzquierda_Y; //coordenada superior izquierda de cada cuadro
	private int WIDTH, HEIGH; //ANCHO Y ALTO DE CADA CUADRADO
	private boolean clicDone = false;
	private int ownerPlayer = 0;	

	/**
	 * @param x_POSITION
	 * @param y_POSITION
	 */
	public Square(int x_POSITION, int y_POSITION) {
		super();
		X_POSITION = x_POSITION;
		Y_POSITION = y_POSITION;
	}
	

	@Override
	public void paint(Graphics g) {		
		super.paint(g);
		WIDTH = Frame.getInstance().getWidth()/3;
		HEIGH = Frame.getInstance().getHeight()/3;
		esquinaSupIzquierda_X = this.X_POSITION * WIDTH;
		esquinaSupIzquierda_Y = this.Y_POSITION * HEIGH;
		g.setColor(Color.BLACK);
		g.drawRect(esquinaSupIzquierda_X, esquinaSupIzquierda_Y, WIDTH, HEIGH);
		
		drawImage(g);
	//	drawVectorImage(g);
		
	}
	/**
	 * 
	 */
//	private void drawVectorImage(Graphics g) {
//		if (this.ownerPlayer == Arkanoid.PLAYER_1) {
//			g.setColor(Color.YELLOW);
//			g.drawLine(this.esquinaSupIzquierda_X, this.esquinaSupIzquierda_Y, 
//					this.esquinaSupIzquierda_X + this.WIDTH, this.esquinaSupIzquierda_Y + HEIGH);
//			g.drawLine(this.esquinaSupIzquierda_X, this.esquinaSupIzquierda_Y + HEIGH, 
//					this.esquinaSupIzquierda_X + this.WIDTH, this.esquinaSupIzquierda_Y);
//		}
//		if (this.ownerPlayer == Arkanoid.PLAYER_2) {
//			g.setColor(Color.GREEN);	
//			g.drawOval(this.esquinaSupIzquierda_X, this.esquinaSupIzquierda_Y, this.WIDTH, this.HEIGH);
//		}
//	}
	private void drawImage (Graphics g) {
		BufferedImage image = null;
		if (this.ownerPlayer == Frame.PLAYER_1) {
			image = SpritesRepository.getInstance().getSprite("vader.png");
		}
		if (this.ownerPlayer == Frame.PLAYER_2) {
			image = SpritesRepository.getInstance().getSprite("yoda.png");
		}
		if (image != null) {
			int x = this.esquinaSupIzquierda_X + this.WIDTH /2 - image.getWidth() / 2;
			int y = this.esquinaSupIzquierda_Y + this.HEIGH /2 - image.getHeight() / 2;
			g.drawImage(image, x, y, null);
		}
	}
	/**
	 * @param cuentaDeClic 
	 * 
	 */
	public boolean clicInSquare(int X_CLIC, int Y_CLIC) {
		if (X_CLIC > this.esquinaSupIzquierda_X && X_CLIC < (esquinaSupIzquierda_X + WIDTH)
				&& Y_CLIC > this.esquinaSupIzquierda_Y && Y_CLIC < (esquinaSupIzquierda_Y + HEIGH)) {
		return true;
		}
		return false;
	}
	/**
	 * @param player 
	 * 
	 */
	public void clic (int player) {
		if (this.ownerPlayer == 0) {
			this.ownerPlayer = player;
		}
		
		Frame.getInstance().getMatrix()[this.Y_POSITION][this.X_POSITION] = player;		
		
		Frame.getInstance().repaint();
		Frame.getInstance().revalidate();
		
		System.out.println("Estado del juego:");
		for (int i = 0; i < Frame.getInstance().getMatrix().length; i++) {
			for (int j = 0; j < Frame.getInstance().getMatrix().length; j++) {
				System.out.print(Frame.getInstance().getMatrix()[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	/**
	 * @return the x_POSITION
	 */
	public int getX_POSITION() {
		return X_POSITION;
	}

	/**
	 * @param x_POSITION the x_POSITION to set
	 */
	public void setX_POSITION(int x_POSITION) {
		X_POSITION = x_POSITION;
	}

	/**
	 * @return the y_POSITION
	 */
	public int getY_POSITION() {
		return Y_POSITION;
	}

	/**
	 * @param y_POSITION the y_POSITION to set
	 */
	public void setY_POSITION(int y_POSITION) {
		Y_POSITION = y_POSITION;
	}

	/**
	 * 
	 */
	
	

}
