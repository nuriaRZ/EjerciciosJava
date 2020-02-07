package programacion.Capitulo6b.Videojuego_Formula1.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.plaf.basic.BasicLookAndFeel;

import programacion.Utils;

public class Moto extends Vehiculo {

	public Moto(String nombre, int numPista, Color color) {
		super(nombre, numPista, color);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {		
		this.getP().paint(g);
		this.paintMe(g);

	}
	
	public void paintMe(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect((this.getPosicion()*Frame.getWidht()/100)+10, this.getY_COORD()+50, 40, 10);
		g.setColor(Color.BLACK);
		g.fillArc((this.getPosicion()*Frame.getWidht()/100)+30, this.getY_COORD()+50, 30, 30, 45, 45);
		g.fillOval((this.getPosicion()*Frame.getInstance().getWidth()/100)+30, this.getY_COORD()+55, 15, 15);
		g.fillOval((this.getPosicion()*Frame.getInstance().getWidth()/100)+10, this.getY_COORD()+55, 15, 15);
	}

	@Override
	public boolean seMueve() {
		// TODO Auto-generated method stub
		return super.seMueve();
	}

	@Override
	public int construirPista() {
		// TODO Auto-generated method stub
		return super.construirPista();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
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
	public Color getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public Pista getP() {
		// TODO Auto-generated method stub
		return super.getP();
	}

	@Override
	public void setP(Pista p) {
		// TODO Auto-generated method stub
		super.setP(p);
	}

	@Override
	public int getX_COORD() {
		// TODO Auto-generated method stub
		return super.getX_COORD();
	}

	@Override
	public void setX_COORD(int x_COORD) {
		// TODO Auto-generated method stub
		super.setX_COORD(x_COORD);
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

	@Override
	public List<Integer> getTiradasNecesarias() {
		// TODO Auto-generated method stub
		return super.getTiradasNecesarias();
	}

	@Override
	public void setTiradasNecesarias(List<Integer> tiradasNecesarias) {
		// TODO Auto-generated method stub
		super.setTiradasNecesarias(tiradasNecesarias);
	}

	@Override
	public int getNumPista() {
		// TODO Auto-generated method stub
		return super.getNumPista();
	}

	@Override
	public void setNumPista(int numPista) {
		// TODO Auto-generated method stub
		super.setNumPista(numPista);
	}

	@Override
	public void imprimirNumTiradas() {
		// TODO Auto-generated method stub
		super.imprimirNumTiradas();
	}




	
	
	

}
