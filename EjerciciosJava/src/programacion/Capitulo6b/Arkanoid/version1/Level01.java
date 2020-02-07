package programacion.Capitulo6b.Arkanoid.version1;

import java.awt.Color;

public class Level01 extends Level {

	public Level01() {

	}

	@Override
	public void inicializarFase() {
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
//		Brick b = new Brick();
//		actors.add(b);
//		b.setColor(Color.blue);
//		b.setX_coord(x_coord);
//		b.setY_coord(y_coord);

	}

}
