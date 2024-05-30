import java.util.Calendar;
import java.util.Date;

public class CalendarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		c1.set(2025,5-1, 1);
		System.out.println(c1.toString());
		
		Date d = c1.getTime();
		System.out.println(d.toLocaleString());
	}

}
