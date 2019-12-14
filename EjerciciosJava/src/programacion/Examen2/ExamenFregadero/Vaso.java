package programacion.Examen2.ExamenFregadero;

import programacion.Utils;

public class Vaso extends Utensilio {

	public Vaso(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seRompe() {
		int probabilidad = Utils.ObtenerNumAleatorioEntreLimites(100, 0);
		if (probabilidad < 35) {
			return true;
		}
		return false;
	}

}
