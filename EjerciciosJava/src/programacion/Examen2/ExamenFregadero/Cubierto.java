package programacion.Examen2.ExamenFregadero;

import programacion.Utils;

public class Cubierto extends Utensilio {

	public Cubierto(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seRompe() {
		int probabilidad = Utils.ObtenerNumAleatorioEntreLimites(100, 0);
		if (probabilidad < 5) {
			return true;
		}
		return false;
	}

}
