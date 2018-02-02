import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DisplayAllNumbers {

	public static void main(String args[]) throws ParseException {
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
	}

}
