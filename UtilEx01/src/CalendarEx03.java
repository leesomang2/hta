import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.getTime().toLocaleString());
		
		//날짜 추가
		c1.add(Calendar.DATE, 1);
		System.out.println(c1.getTime().toLocaleString());
		
		c1.add(Calendar.DATE, -2);//날짜뺴기
		System.out.println(c1.getTime().toLocaleString());
		
		c1.add(Calendar.MONTH, 6);//월 추가
		System.out.println(c1.getTime().toLocaleString());
	}

}
