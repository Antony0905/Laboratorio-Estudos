package br.com.matheus;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws ParseException {

		System.out.println("");
		System.out.println("Convertendo TimeStamp para Data");
		System.out.println("");
		// Date teste = new Date(Integer.parseInt("1557941514") * 1000L);
		String str = "1557399600000";
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dataRecebendoString = new Date(Long.parseLong(str));
		System.out.println(sf.format(dataRecebendoString));

		System.out.println("");
		System.out.println("Comparação de minutos com Gregorian Calendar");
		System.out.println("");

		Calendar calendar = GregorianCalendar.getInstance();
		Calendar calendar2 = GregorianCalendar.getInstance();
		Timestamp date = Timestamp.valueOf("2019-01-21 14:50:41.492");
		Timestamp date2 = Timestamp.valueOf("2019-01-21 14:50:42.492");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date start = format.parse("2019-01-21 14:50:41.492");
		Date end = format.parse("2019-01-21 14:55:42.492");
		long difference = end.getTime() - start.getTime();
		long minutos = TimeUnit.MILLISECONDS.toMinutes(difference);

		System.out.println(minutos);

		calendar.setTime(date);
		calendar2.setTime(date2);
		Date d1 = calendar.getTime();
		Date d2 = calendar2.getTime();

		long duration = d2.getTime() - d1.getTime();

		long diff = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println(diff);

	}

}
