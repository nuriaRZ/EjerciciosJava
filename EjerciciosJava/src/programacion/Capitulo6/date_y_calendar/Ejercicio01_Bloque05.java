package programacion.Capitulo6.date_y_calendar;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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
			System.out.println("Fecha introducida no v�lida");
		}
		System.out.println("Fecha introducida: " + fechaParseada);		
		System.out.println("Date / Anio: "+ new SimpleDateFormat("yyyy").format(fechaParseada));
		System.out.println("Date / Mes: "+ new SimpleDateFormat("MM").format(fechaParseada));
		System.out.println("Date / Dia: "+ new SimpleDateFormat("dd").format(fechaParseada));
		System.out.println("Date / Hora: "+ new SimpleDateFormat("hh").format(fechaParseada));
		System.out.println("Date / Minuto: "+ new SimpleDateFormat("mm").format(fechaParseada));
		System.out.println("Date / Segundo: "+ new SimpleDateFormat("ss").format(fechaParseada));
	
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
		
		System.out.println();
		
		calendar.set(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Sumar 3 dias: "+calendar.getTime().toString());
		calendar.set(Calendar.WEEK_OF_MONTH, -2);
		System.out.println("Restar 2 semanas: "+calendar.getTime().toString());
		calendar.set(Calendar.DAY_OF_YEAR, 300);
		System.out.println("Sumar 300 dias: "+calendar.getTime().toString());
		calendar.set(Calendar.YEAR, 4);
		System.out.println("Sumar 4 anios: "+calendar.getTime().toString());
		
		

		



		
		
	
		
		
		
	}
	
	private static void diferenciaHoraria() {
		Calendar horaEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		System.out.println("Hora en Roma (Italia): " + horaEnRoma.get(Calendar.HOUR_OF_DAY));
		
		Calendar horaEnSidney = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		System.out.println("Hora en Sidney (Australia): " + horaEnSidney.get(Calendar.HOUR_OF_DAY));
		
		int diferenciaHoraria = horaEnSidney.get(Calendar.HOUR_OF_DAY) - horaEnRoma.get(Calendar.HOUR_OF_DAY);
		System.out.println("Diferencia horaria: " +diferenciaHoraria);
	}

	public static void main(String[] args) {
		//parsearFecha();
		diferenciaHoraria();


	}
	
	

}
