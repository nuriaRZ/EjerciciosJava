package programacion.Capitulo6b.Arkanoid.version1;


import java.util.ArrayList;
import java.util.List;

public abstract class Level {
	protected List <Actor> actors = new ArrayList<Actor>();

	public Level() {
		inicializarFase();
	}
	
	public abstract void inicializarFase();

	/**
	 * @return the actores
	 */
	public List<Actor> getActors() {
		return actors;
	}
	
	public String getNombreSonidoInicio () {
		return "Arkanoid-start-of-stage.wav";
	}

}
