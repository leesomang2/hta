import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다국어
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		System.out.println(c1.toString());
	
		//특정한 날짜데이터
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH)+1);
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));//일요일이 1
		
		System.out.println(c1.getTimeInMillis());//timestamp
		
		System.out.println(c1.getActualMaximum(Calendar.DATE));//
		System.out.println(c1.getActualMinimum(Calendar.DATE));//
		
	}

}




                                  