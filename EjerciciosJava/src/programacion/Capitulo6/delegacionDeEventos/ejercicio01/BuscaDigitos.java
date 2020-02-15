package programacion.Capitulo6.delegacionDeEventos.ejercicio01;

public class BuscaDigitos implements TresDigitosIntroducidosListener {
	
	public BuscaDigitos() {
		Principal.addTresDigitosIntroducidosListener(this);
	}

	@Override
	public void tresDigitosIntroducidosListener(DigitoIntroducidoEvent event) {
		System.out.println("Digito encontrado: "+ event.getDigitoIntroducido());
		
	}

}
