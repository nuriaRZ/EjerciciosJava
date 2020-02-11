package programacion.Capitulo6.excepciones.ej02_bloque04;

import javax.swing.JOptionPane;

public class Principal {
	
	private static String getFraseBombilla() throws SoloEspaciosException, 
													MinimoPalabrasIntroducidasException, 
													NoAparecePalabraBombillaException, 
													AparecenPalabrasOfensivasException {
		String frase = JOptionPane.showInputDialog("Introduzca una frase con la palabra \"bombilla\"");
		//excepcion si solo se encuentran espacios
		if (frase.trim().equals("")){
			throw new SoloEspaciosException("No se encontraron palabras");
		}
		//excepcion si hay menos de 3 palabras
		String palabras[] = frase.split("[ ]{1,}");
		if (palabras.length < 3) {
			throw new MinimoPalabrasIntroducidasException(3);
		}
		//exception si no aparece la palabra bombilla
		//se pasa la frase completa a mayuscula por si el usuario escribe alguna letra en mayuscula
		if (frase.toUpperCase().indexOf("BOMBILLA") == -1) {
			throw new NoAparecePalabraBombillaException("No se ha encontrado la palabra \"bombilla\"");
		}
		//exception si se encuentran palabras ofensivas
		//Array con las palabras que queremos comparar
		String palabrasOfensivas[] = new String[] {"TONTO", "TONTA", "IDIOTA"};
		for (String p : palabrasOfensivas) {
			if (frase.toUpperCase().indexOf(p) != - 1) {
				throw new AparecenPalabrasOfensivasException("Se ha encontrado una palabra ofensiva: " + p);
			}
		}
		
		
		return frase;
	}

	public static void main(String[] args) {
	try {
		System.out.println(getFraseBombilla());
	} catch (SoloEspaciosException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MinimoPalabrasIntroducidasException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoAparecePalabraBombillaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (AparecenPalabrasOfensivasException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (Exception e) { //por si aparecen errores no controlados
		e.printStackTrace();
	}
	
	}
}
