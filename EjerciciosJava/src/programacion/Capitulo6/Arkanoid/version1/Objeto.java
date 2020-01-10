package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Objeto {
	
	protected Color color;
	protected int x_coord, y_coord;
	protected int width, height;
	/**
	 * @param nombre
	 * @param color
	 * @param x_coord
	 * @param y_coord
	 * @param width
	 * @param height
	 */
	public Objeto(Color color, int x_coord, int y_coord, int width, int height) {
		super();
		
		this.color = color;
		this.x_coord = x_coord;
		this.y_coord = y_coord;
		this.width = width;
		this.height = height;
	}
	public abstract void paint(Graphics g);
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return the x_coord
	 */
	public int getX_coord() {
		return x_coord;
	}
	/**
	 * @param x_coord the x_coord to set
	 */
	public void setX_coord(int x_coord) {
		this.x_coord = x_coord;
	}
	/**
	 * @return the y_coord
	 */
	public int getY_coord() {
		return y_coord;
	}
	/**
	 * @param y_coord the y_coord to set
	 */
	public void setY_coord(int y_coord) {
		this.y_coord = y_coord;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	

	

}
