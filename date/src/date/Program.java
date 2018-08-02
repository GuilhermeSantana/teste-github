package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();

		Date d1 = data1.parse("02/03/1996");
		Date d2 = data2.parse("02/03/1996 13:05:01");
		Date d3 = Date.from(Instant.parse("2018-07-26T08:50:06Z"));

		System.out.println(data2.format(x1));
		System.out.println(data1.format(d1));
		System.out.println(data2.format(d2));
		System.out.println(data3.format(d3));

	}
}
