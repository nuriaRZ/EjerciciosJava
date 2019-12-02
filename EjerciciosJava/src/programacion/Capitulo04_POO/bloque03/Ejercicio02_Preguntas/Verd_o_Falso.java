package programacion.Capitulo04_POO.bloque03.Ejercicio02_Preguntas;

public class Verd_o_Falso extends Cuestion {
	
	private String pregunta03;
	private String pregunta04;
	

	public Verd_o_Falso() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param enunciado
	 * @param respCorrecta
	 */
	public Verd_o_Falso(String enunciado, int respCorrecta, String pregunta03, String pregunta04) {
		super(enunciado, respCorrecta);
		this.pregunta03 = this.getEnunciado("¿Arturo es el mejor?");
		this.pregunta04 = this.getEnunciado("¿La capital de Tailandia es Bangkok?");
	}



	@Override
	public void mostrarEnPantalla() {
		// TODO Auto-generated method stub

	}

	@Override
	public void evaluarRespuesta() {
		// TODO Auto-generated method stub

	}

}
