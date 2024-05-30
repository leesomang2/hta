import java.util.Calendar;

public class CalendarEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재달의 달력
		int year = 2024;
		int month = 5;
		
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		
		startCalendar.set(year, month-1,1);
		endCalendar.set(year, month-1,1-1);
		
		int startDayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
		int endDate = endCalendar.get(Calendar.DATE);
		
		System.out.println( "     "+year+"년"+month+"월");
		System.out.println( " SU MO TU WE TH FR SA");
		
		for(int i=1; i<startDayOfWeek; i++) {
			System.out.println("     ");
		}
		
		
		
		
		
	}

}
