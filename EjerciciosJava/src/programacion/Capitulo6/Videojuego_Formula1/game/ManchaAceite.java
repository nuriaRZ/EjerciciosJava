

package programacion.Capitulo6.Videojuego_Formula1.game;

import java.awt.Color;
import java.awt.Graphics;

public class ManchaAceite extends Obstaculo {


	public ManchaAceite(String nombre, int y_COORD) {
		super(nombre);
		this.impulso = -2;
		this.color = Color.BLACK;
		this.Y_COORD = y_COORD;
		
	}
	


	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(getPosicion()*Frame.getInstance().getWidth()/100, Y_COORD, getEspacio()*Frame.getInstance().getWidth()/50, Frame.getInstance().getHeight()/4);
		
	}



	@Override
	public int getEspacio() {
		// TODO Auto-generated method stub
		return super.getEspacio();
	}



	@Override
	public void setEspacio(int espacio) {
		// TODO Auto-generated method stub
		super.setEspacio(espacio);
	}



	@Override
	public int getImpulso() {
		// TODO Auto-generated method stub
		return super.getImpulso();
	}



	@Override
	public void setImpulso(int impulso) {
		// TODO Auto-generated method stub
		super.setImpulso(impulso);
	}



	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}



	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}



	@Override
	public int getPosicion() {
		// TODO Auto-generated method stub
		return super.getPosicion();
	}



	@Override
	public void setPosicion(int posicion) {
		// TODO Auto-generated method stub
		super.setPosicion(posicion);
	}



	@Override
	public int getY_COORD() {
		// TODO Auto-generated method stub
		return super.getY_COORD();
	}



	@Override
	public void setY_COORD(int y_COORD) {
		// TODO Auto-generated method stub
		super.setY_COORD(y_COORD);
	}
	
	



}
