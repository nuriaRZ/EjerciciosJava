package programacion.Capitulo6.Videojuego_Formula1;

public class Race {
	Vehiculo vehiculos[] = new Vehiculo[4];
	

	public Race() {
		super();
		vehiculos[0] = new Coche("Ana");
		vehiculos[1] = new Coche("Nuria");
		vehiculos[2] = new Moto("Arturo");
		vehiculos[3] = new Moto("Medina");
		
		
	}
	/**
	 * 
	 */
	public void avanzar() {
		for (int i = 0; i < vehiculos.length; i++) {
			vehiculos[i].seMueve();
			System.out.println("Vehiculo: "+vehiculos[i].getNombre()+" posicion: "+vehiculos[i].getPosicion());
		}
		System.out.println();
	}
	/**
	 * 
	 */
	public void caerEnObstaculo() {
		
	}
	/**
	 * 
	 * @return
	 */
	public boolean esFinDeJuego() {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i].getPosicion()>=100) {				
				System.out.println("Ha ganado el vehiculo: "+ vehiculos[i].getNombre());
				return true;
			}
		}
		return false;
	}
	/**
	 * @return the vehiculos
	 */
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	/**
	 * @param vehiculos the vehiculos to set
	 */
	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	

}
