package programacion.Capitulo6.excepciones.ej02_bloque04;

public class MinimoPalabrasIntroducidasException extends Exception {
	private int minNumeroPalabras;

	public MinimoPalabrasIntroducidasException(int minNumPalabras) {
		this.minNumeroPalabras = minNumPalabras;
	}

	public MinimoPalabrasIntroducidasException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MinimoPalabrasIntroducidasException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MinimoPalabrasIntroducidasException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MinimoPalabrasIntroducidasException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
