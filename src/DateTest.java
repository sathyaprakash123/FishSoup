import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;

public class DateTest {
	
	public static void main(String args[]) throws ParseException
	{
		Date CurrentDate = new Date();
		System.out.println("Current Date: " + CurrentDate.toString());
		String FutureDate = "Sat Dec 30 00:00:00 UTC 2017";
		SimpleDateFormat ffdate = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date DestDate = ffdate.parse(FutureDate);
		System.out.println("Dest Date : "+ DestDate);
		double diff = (DestDate.getTime()- CurrentDate.getTime())/3600000;
		System.out.println(diff);
		
		}

}
