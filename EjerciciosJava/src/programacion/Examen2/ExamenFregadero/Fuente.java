package programacion.Examen2.ExamenFregadero;

import programacion.Utils;

public class Fuente extends Utensilio {

	public Fuente(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seRompe() {
		int probabilidad = Utils.ObtenerNumAleatorioEntreLimites(100, 0);
		if (probabilidad < 20) {
			return true;
		}
		return false;
	}

}
