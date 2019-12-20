package programacion.Capitulo6.Videojuego_Formula1;

import java.util.ArrayList;
import java.util.List;

public class Race {
	Vehiculo vehiculo1 = new Coche("Ana");
	Vehiculo vehiculo2 = new Coche("Nuria");
	Vehiculo vehiculo3 = new Moto("Arturo");
	Vehiculo vehiculo4 = new Moto("Medina");
	List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
	
	public Race() {
		super();		
		vehiculos.add(vehiculo1);
		vehiculos.add(vehiculo2);
		vehiculos.add(vehiculo3);
		vehiculos.add(vehiculo4);
		
	}
	/**
	 * 
	 */
	public void avanzar() {
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).seMueve();
			System.out.println("Vehiculo: "+vehiculos.get(i).getNombre()+" posicion: "+vehiculos.get(i).getPosicion());
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
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPosicion()>=100) {				
				System.out.println("Ha ganado el vehiculo: "+ vehiculos.get(i).getNombre());
				return true;
			}
		}
		return false;
	}
	/**
	 * @return the vehiculos
	 */

	
	

}
