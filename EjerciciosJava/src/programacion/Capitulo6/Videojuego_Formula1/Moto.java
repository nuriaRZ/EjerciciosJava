package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Graphics;

import programacion.Utils;

public class Moto extends Vehiculo {

	public Moto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	
	public void paint() {
	//	g.fillOval(0, 0, arg2, arg3);

	}


	@Override
	public void caerEnObstaculo() {
		setPosicion(Utils.ObtenerNumAleatorioEntreLimites(2, 7));
		
		for (int i = 0; i < getP().getObstaculos().size(); i++) {
			if (getPosicion() >= getP().getObstaculos().get(i).getPosicionInicial() 
					&& getPosicion() <= getP().getObstaculos().get(i).getPosicionFinal()) {
				setPosicion(getPosicion()+getP().getObstaculos().get(i).getImpulso());
				System.out.println("Pisa obstaculo retrocede a: " + getPosicion());				
			}			
		}		
	}


	
	
	

}
