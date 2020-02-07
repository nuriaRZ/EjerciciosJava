package programacion.Capitulo6b.Arkanoid.version1;

import java.awt.Color;

public class Level02 extends Level {

	public Level02() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inicializarFase() {
		int x_coord = 10;
		int y_coord = 10;
		int constanteSeparacion = 17;
		 
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				Brick b = new Brick(); //creo un nuevo ladrillo
				b.setX_coord(x_coord); //le asigno la coordenada X
				b.setY_coord(y_coord); //le asigno la coordenada y
				actors.add(b); //lo a�ado a la lista de actores
				
				y_coord += b.getHeight()+2; //por cada ladrillo a la coordenada x le sumo su ancho mas 2u de separacion entre ladrillos
				if (i==0)b.setColor(Color.YELLOW);
				if (j==5 && i==0) {
					b.setColor(Color.GRAY);
					b.setStrength(2);
				}
				if (i==1)  b.setColor(Color.MAGENTA);
				if (j==5 && i==1) {
					b.setColor(Color.orange);
					b.setStrength(-1);
				}
	
			
			}
			x_coord += 27;				
			y_coord =10;

		}
			
		y_coord += constanteSeparacion ;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				Brick b = new Brick(); //creo un nuevo ladrillo
				b.setX_coord(x_coord); //le asigno la coordenada X
				b.setY_coord(y_coord); //le asigno la coordenada y
				actors.add(b); //lo a�ado a la lista de actores
				
				y_coord += b.getHeight()+2; //por cada ladrillo a la coordenada x le sumo su ancho mas 2u de separacion entre ladrillos
				if (i==0)b.setColor(Color.GREEN);
				if (j==5 && i==0) {
					b.setColor(Color.GRAY);
					b.setStrength(2);
				}
				if (i==1)  b.setColor(Color.RED);
				if (j==5 && i==1) {
					b.setColor(Color.orange);
					b.setStrength(-1);
				}
	
			}
			x_coord += 27;				
			y_coord = 27;

		}
		
		y_coord += constanteSeparacion + 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				Brick b = new Brick(); //creo un nuevo ladrillo
				b.setX_coord(x_coord); //le asigno la coordenada X
				b.setY_coord(y_coord); //le asigno la coordenada y
				actors.add(b); //lo a�ado a la lista de actores
				
				y_coord += b.getHeight()+2; //por cada ladrillo a la coordenada x le sumo su ancho mas 2u de separacion entre ladrillos
				if (i==0)b.setColor(Color.BLUE);
				if (j==5 && i==0) {
					b.setColor(Color.GRAY);
					b.setStrength(2);
				}
				if (i==1)  b.setColor(Color.CYAN);
				if (j==5 && i==1) {
					b.setColor(Color.orange);
					b.setStrength(-1);
				}
	
			}
			x_coord += 27;				
			y_coord =45;

		}
		
		y_coord += constanteSeparacion+1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				Brick b = new Brick(); //creo un nuevo ladrillo
				b.setX_coord(x_coord); //le asigno la coordenada X
				b.setY_coord(y_coord); //le asigno la coordenada y
				actors.add(b); //lo a�ado a la lista de actores
				
				y_coord += b.getHeight()+2; //por cada ladrillo a la coordenada x le sumo su ancho mas 2u de separacion entre ladrillos
				if (i==0)b.setColor(Color.BLUE);
				if (j==5 && i==0) {
					b.setColor(Color.GRAY);
					b.setStrength(2);
				}
				if (i==1)  b.setColor(Color.RED);
				if (j==5 && i==1) {
					b.setColor(Color.orange);
					b.setStrength(-1);
				}
	
			}
			x_coord += 27;				
			y_coord = 63;

		}
		
		y_coord += constanteSeparacion+1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				Brick b = new Brick(); //creo un nuevo ladrillo
				b.setX_coord(x_coord); //le asigno la coordenada X
				b.setY_coord(y_coord); //le asigno la coordenada y
				actors.add(b); //lo a�ado a la lista de actores
				
				y_coord += b.getHeight()+2; //por cada ladrillo a la coordenada x le sumo su ancho mas 2u de separacion entre ladrillos
				if (i==0)b.setColor(Color.GREEN);
				if (j==5 && i==0) {
					b.setColor(Color.GRAY);
					b.setStrength(2);
				}
				if (i==1)  b.setColor(Color.CYAN);
				if (j==5 && i==1) {
					b.setColor(Color.orange);
					b.setStrength(-1);
				}
				
	
			}
			x_coord += 27;				
			y_coord =81;

		}
		
		y_coord += constanteSeparacion + 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				Brick b = new Brick(); //creo un nuevo ladrillo
				b.setX_coord(x_coord); //le asigno la coordenada X
				b.setY_coord(y_coord); //le asigno la coordenada y
				actors.add(b); //lo a�ado a la lista de actores
				
				y_coord += b.getHeight()+2; //por cada ladrillo a la coordenada x le sumo su ancho mas 2u de separacion entre ladrillos
				if (i==0)b.setColor(Color.WHITE);
				if (j==5 && i==0) {
					b.setColor(Color.GRAY);
					b.setStrength(2);
				}
				if (i==1)  b.setColor(Color.PINK);
				if (j==5 && i==1) {
					b.setColor(Color.ORANGE);
					b.setStrength(-1);
				}
				
			

			}
			x_coord += 27;				
			y_coord =99;
		}

	}

}
