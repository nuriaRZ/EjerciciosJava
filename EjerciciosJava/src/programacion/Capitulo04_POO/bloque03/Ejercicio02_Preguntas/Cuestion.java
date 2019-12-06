package programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas;

public abstract class Cuestion {
	protected String enunciado;
	protected int respCorrecta;
	
	
	
	public Cuestion () {
		
	}	
	
	/**
	 * @param enunciado
	 * @param respCorrecta
	 */
	public Cuestion(String enunciado, int respCorrecta) {
		super();
		this.enunciado = enunciado;
		this.respCorrecta = respCorrecta;
		
	}

	/**
	 * 
	 */
	
	public abstract int mostrarEnPantalla();
	/**
	 * 
	 */
	public boolean evaluarRespuesta(int respUsuario) {
		return this.respCorrecta==respUsuario;
	}
	/**
	 * @param string 
	 * @return the enunciado
	 */
	public String getEnunciado(String enunciado) {
		return enunciado;
	}
	/**
	 * @param enunciado the enunciado to set
	 */
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	/**
	 * @return the respCorrecta
	 */
	public int getRespCorrecta() {
		return respCorrecta;
	}
	/**
	 * @param respCorrecta the respCorrecta to set
	 */
	public void setRespCorrecta(int respCorrecta) {
		this.respCorrecta = respCorrecta;
	}
	
	

}
