package programacion.Capitulo6.date_y_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio01_Bloque05 {
	
	private static void parsearFecha() {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
		String fechaUsuario = JOptionPane.showInputDialog("Introduce una fecha");
		Date fechaParseada = null;
		try {
			fechaParseada = sdf.parse(fechaUsuario);
			

		}
		catch (ParseException e) {
			System.out.println("Fecha introducida no válida");
		}
		System.out.println("Fecha introducida: " + fechaParseada);		
		System.out.println("Date / Anio: "+ fechaParseada.getYear());
	
		System.out.println();
		Calendar calendar = Calendar.getInstance();
		Date fechaAPartirDeCalendar = new Date(calendar.getTimeInMillis());
		System.out.println("Fecha a partir de Calendar con campos individualizados: " + 
				new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss").format(fechaAPartirDeCalendar));
		System.out.println("Calendario: " +calendar.getTime().toString());
		System.out.println("Calendar / Anio: "+ calendar.get(Calendar.YEAR));
		System.out.println("Calendar / Mes: "+ calendar.get(Calendar.MONTH));
		System.out.println("Calendar / Dia: "+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Calendar / Hora: "+ calendar.get(Calendar.HOUR));
		System.out.println("Calendar / Minuto: "+ calendar.get(Calendar.MINUTE));
		System.out.println("Calendar / Segundo: "+ calendar.get(Calendar.SECOND));
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(Calendar.YEAR, 4);		
		fecha1.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
		fecha1.set(Calendar.DAY_OF_MONTH, 3);
		fecha1.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR));		
		fecha1.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE));
		fecha1.set(Calendar.SECOND, calendar.get(Calendar.SECOND));
		System.out.println(fecha1.getTime().toString());
		
		Calendar fecha2 = Calendar.getInstance(); 
		fecha2.set(Calendar.YEAR, 2019);		
		fecha2.set(Calendar.MONTH, Calendar.FEBRUARY);
		fecha2.set(Calendar.DAY_OF_MONTH, 05);
		fecha2.set(Calendar.HOUR_OF_DAY, 12);		
		fecha2.set(Calendar.MINUTE, 05);
		fecha2.set(Calendar.SECOND, 11);
		



		
		
	
		
		
		
	}
	
	private static void crearCalendario() {
		String fechaUsuario = JOptionPane.showInputDialog("Introduce una fecha");

	}

	public static void main(String[] args) {
		parsearFecha();
		


	}
	
	

}
