package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Race {
	public List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
	Vehiculo vehiculo1 = new Coche("Ana",0, Color.RED);
	Vehiculo vehiculo2 = new Coche("Nuria",1, Color.BLUE);
	Vehiculo vehiculo3 = new Moto("Arturo",2, Color.GREEN);
	Vehiculo vehiculo4 = new Moto("Medina",3, Color.MAGENTA);	
	private List <Integer> ordenSegunTiradas = new ArrayList<Integer>();
	protected List <Vehiculo> podium = new ArrayList<Vehiculo>();
	
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
			Vehiculo v = vehiculos.get(i);
			boolean seHaProducidoDesplazamiento = v.seMueve();					
			System.out.println("Vehiculo: "+vehiculos.get(i).getNombre()+" posicion: "+vehiculos.get(i).getPosicion());
			if (seHaProducidoDesplazamiento == false) {
				podium.add(vehiculos.get(i));
			vehiculos.remove(i);
			}
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean esFinDeJuego() {
		boolean estaVacio = true;
		return vehiculos.isEmpty();
	}
	/**
	 * @return the vehiculos
	 */
	public void podium() {
		int menorNumTiradas;
		for (int i = 0; i < vehiculos.size(); i++) {
			ordenSegunTiradas.add(getVehiculos().get(i).tiradasNecesarias.size());
		}
		
		boolean hayCambioDeOrden;
		do {
			hayCambioDeOrden = false;
			for (int i = 0; i < ordenSegunTiradas.size()-1; i++) {
				if (ordenSegunTiradas.get(i+1) < ordenSegunTiradas.get(i)) {
					menorNumTiradas = ordenSegunTiradas.get(i+1);
					ordenSegunTiradas.add(i+1, ordenSegunTiradas.get(i));
					ordenSegunTiradas.add(i, menorNumTiradas);
					hayCambioDeOrden = true;
				}				
			}
		}while (hayCambioDeOrden);
		
	}
	/**
	 * @return the vehiculo1
	 */
	public Vehiculo getVehiculo1() {
		return vehiculo1;
	}
	/**
	 * @param vehiculo1 the vehiculo1 to set
	 */
	public void setVehiculo1(Vehiculo vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}
	/**
	 * @return the vehiculo2
	 */
	public Vehiculo getVehiculo2() {
		return vehiculo2;
	}
	/**
	 * @param vehiculo2 the vehiculo2 to set
	 */
	public void setVehiculo2(Vehiculo vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}
	/**
	 * @return the vehiculo3
	 */
	public Vehiculo getVehiculo3() {
		return vehiculo3;
	}
	/**
	 * @param vehiculo3 the vehiculo3 to set
	 */
	public void setVehiculo3(Vehiculo vehiculo3) {
		this.vehiculo3 = vehiculo3;
	}
	/**
	 * @return the vehiculo4
	 */
	public Vehiculo getVehiculo4() {
		return vehiculo4;
	}
	/**
	 * @param vehiculo4 the vehiculo4 to set
	 */
	public void setVehiculo4(Vehiculo vehiculo4) {
		this.vehiculo4 = vehiculo4;
	}
	/**
	 * @return the vehiculos
	 */
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	/**
	 * @param vehiculos the vehiculos to set
	 */
	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	/**
	 * @return the ordenSegunTiradas
	 */
	public List<Integer> getOrdenSegunTiradas() {
		return ordenSegunTiradas;
	}
	/**
	 * @param ordenSegunTiradas the ordenSegunTiradas to set
	 */
	public void setOrdenSegunTiradas(List<Integer> ordenSegunTiradas) {
		this.ordenSegunTiradas = ordenSegunTiradas;
	}
	/**
	 * @return the podium
	 */
	public List<Vehiculo> getPodium() {
		return podium;
	}
	/**
	 * @param podium the podium to set
	 */
	public void setPodium(List<Vehiculo> podium) {
		this.podium = podium;
	}

	
	

}
