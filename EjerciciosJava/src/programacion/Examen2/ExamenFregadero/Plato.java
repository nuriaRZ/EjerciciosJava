package programacion.Examen2.ExamenFregadero;

import programacion.Utils;

public class Plato extends Utensilio {

	public Plato(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seRompe() {
		int probabilidad = Utils.ObtenerNumAleatorioEntreLimites(100, 0);
		if (probabilidad < 50) {
			return true;
		}
		return false;
	}

}
