package programacion.Examen2.ExamenFregadero;

import programacion.Utils;
import programacion.Examen2.ExamenMarcianos.Bicharraco;


public class Fregadero {
	Utensilio[] vajillaSucia = new Utensilio[20];
	Utensilio[] vajillaLimpia = new Utensilio[20];
	Utensilio[] vajillaRota = new Utensilio[20];

	public Fregadero() {
		int contadorVajilla=0;
		for (int i = 0; i < 5; i++) {
			vajillaSucia[contadorVajilla] = new Vaso("V:"+(i+1));
			contadorVajilla++;			
		}
		for (int i = 0; i < 5; i++) {
			vajillaSucia[contadorVajilla] = new Plato("P:"+(contadorVajilla+1));
			contadorVajilla++;			
		}
		for (int i = 0; i < 5; i++) {
			vajillaSucia[contadorVajilla] = new Fuente("F:"+(contadorVajilla+1));
			contadorVajilla++;			
		}
		for (int i = 0; i < 5; i++) {
			vajillaSucia[contadorVajilla] = new Cubierto("C:"+(contadorVajilla+1));
			contadorVajilla++;			
		}
		
	}
	/**
	 * 
	 */
	public void limpiarHastaQuedarLimpio() {
		int contUtensiliosLimpios=0;
		int contUtensiliosRotos=0;
		Utensilio utensilio = vajillaSucia[vajillaSucia.length-1];
		for (int i = this.vajillaSucia.length-1; i > -1; i--) {	
			utensilio=this.vajillaSucia[i];
				utensilio.limpiar();			
			
			
			if (utensilio.seRompe()==true) {
				this.vajillaRota[contUtensiliosRotos]=utensilio;
				contUtensiliosRotos++;
			}
			else {
				this.vajillaLimpia[contUtensiliosLimpios]=utensilio;
				contUtensiliosLimpios++;
			}
			
			vajillaSucia[i]=null;
			imprimirSituacionActual();
		}		
	}
	/**
	 * 
	 */
	public void imprimirSituacionActual() {
		imprimir(vajillaSucia,"Vajilla Sucia");
		imprimir(vajillaLimpia, "Vajilla Limpia");
		imprimir(vajillaRota, "Vajilla Rota");
	}
	/**
	 * 
	 * @param vajilla
	 * @param titulo
	 */
	
	public void imprimir(Utensilio vajilla[], String titulo) {
		System.out.println(titulo);
		for (Utensilio v: vajilla) {
			if (v != null) {
				System.out.print(v.getId()+"  ");
			}
			else System.out.print("X  ");
		}
		System.out.println();
		System.out.println();		
	}
	/**
	 * 
	 */
	public Utensilio getUtensilioConMenorPasadas() {
		Utensilio utensilioMenorNumPasadas = vajillaLimpia[0];
		for (int i = 1; i < vajillaLimpia.length ; i++) {
			if (this.vajillaLimpia[i]!=null) {
				if (vajillaLimpia[i].getNumPasadas() < vajillaLimpia[i-1].getNumPasadas()) {
					 utensilioMenorNumPasadas = vajillaLimpia[i];
				}	
			}
							
		}
		return utensilioMenorNumPasadas;
	}
	/**
	 * 
	 * @param vajilla
	 * @return
	 */
	
	public Utensilio getUtensilioConMayorPasadas() {
		Utensilio utensilioMayorNumPasadas = vajillaLimpia[0];
		for (int i = 1; i < vajillaLimpia.length ; i++) {
			if (this.vajillaLimpia[i]!=null) {
				if (vajillaLimpia[i].getNumPasadas() > vajillaLimpia[i-1].getNumPasadas()) {
					 utensilioMayorNumPasadas = vajillaLimpia[i];
				}	
			}
								
		}
		return utensilioMayorNumPasadas;
	}

	

}
