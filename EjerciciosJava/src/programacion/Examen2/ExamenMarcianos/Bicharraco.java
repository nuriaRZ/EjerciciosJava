package programacion.Examen2.ExamenMarcianos;

import programacion.Utils;

public class Bicharraco {
	private String nombre;
	private int puntosVida;
	private boolean vivo;
	private int disparosRecibidos;
	
	/**
	 * @param nombre
	 * @param puntosVida
	 * @param vivo
	 */
	public Bicharraco(String nombre) {
		super();
		this.nombre = nombre;
		this.puntosVida = Utils.ObtenerNumAleatorioEntreLimites(100, 50);
		this.vivo = true;
		
	}
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	public void recibirDisparo() {
		disparosRecibidos++;
		this.puntosVida -= Utils.ObtenerNumAleatorioEntreLimites(0, 25);
		if (this.puntosVida<=0) {
			vivo=false;
		}
	}
	
	@Override
	public String toString() {
		return "Bicharraco [nombre=" + nombre + ", puntosVida=" + puntosVida + ", vivo=" + vivo + 
				", disparosRecibidos= " + disparosRecibidos +"]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}
	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}
	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	/**
	 * @return the disparosRecibidos
	 */
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}

	/**
	 * @param disparosRecibidos the disparosRecibidos to set
	 */
	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}
	
	

}
