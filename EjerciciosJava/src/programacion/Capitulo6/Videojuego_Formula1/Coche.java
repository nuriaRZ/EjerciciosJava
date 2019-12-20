package programacion.Capitulo6.Videojuego_Formula1;

import programacion.Utils;

public class Coche extends Vehiculo {

	public Coche(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void caerEnObstaculo() {
		setPosicion(Utils.ObtenerNumAleatorioEntreLimites(1, 5));
		
		for (int i = 0; i < getP().getObstaculos().size(); i++) {
			if (getPosicion() >= getP().getObstaculos().get(i).getPosicionInicial() 
					&& getPosicion() <= getP().getObstaculos().get(i).getPosicionFinal()) {
				setPosicion(getPosicion()+getP().getObstaculos().get(i).getImpulso());
				System.out.println("Pisa obstaculo retrocede a: " + getPosicion());				
			}			
		}		
	}

}
