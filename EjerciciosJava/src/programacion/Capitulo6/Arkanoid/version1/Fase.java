package programacion.Capitulo6.Arkanoid.version1;


import java.util.ArrayList;
import java.util.List;

public abstract class Fase {
	public List <Actor> listaActores = null;

	public Fase() {
	}
	
	public abstract void inicializarFase();
	

}
