package programacion.Capitulo6.Arkanoid.version1;

import java.awt.Color;

public class Ladrillo extends Objeto {

	public Ladrillo(Color color, int x_coord, int y_coord, int width, int height) {
		super(color, x_coord, y_coord, width, height);
		this.x_coord = 0;
		this.y_coord = 0;
		this.color = Color.WHITE;
		this.width = 10;
		this.height = 20;
	}
	
	

}
