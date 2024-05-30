import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1 = new Date();//현재 시스템 날짜 시간
		Date d2 = new Date( 2024-1900, 5-1, 1); //날짜세팅
		System.out.println(d2.toLocaleString());
		
		Date d3 = new Date( 2024-1900, 5-1, 1-1 );//마지막날 구하기
		System.out.println(d3.toLocaleString());
		
		//2024년 12월 24일의 요일을 알고싶을때
		Date d4 = new Date( 2024-1900, 12-1, 24 );
		
		//timestamp
		System.out.println(d1.getTime());
		Date d5 = new Date(d1.getTime());
		System.out.println(d5.toLocaleString());
		
		Date d6 = new Date(System.currentTimeMillis());
		System.out.println(d6.toLocaleString());
		
		
	}

}
