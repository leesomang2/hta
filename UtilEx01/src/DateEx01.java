import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java.util
		//Date 날짜관련
		//Date d = new Date(); 에러
		//java.util.Date d = new java.util.Date(); 귀찮으니 위에서 import
		Date d = new Date();
		
		System.out.println(d);//toString() 을 overriding했다 생각
		System.out.println(d.toString());
		
		// -:deprecated
		//System.out.println(d.toLocaleString());//한글 
		String strDate = d.toLocaleString();
		System.out.println(strDate);
		
		//년 월 일 분리 - 문자열 조작
		System.out.println(strDate.substring(0,4));
		System.out.println(strDate.substring(5,7));
		System.out.println(strDate.substring(8,10));
		
		//
		System.out.println(d.getYear() + 1900);//구형이라 +1900해줘야함
		System.out.println(d.getMonth() + 1);// 0부터 시작해서 1더해줘야함		
		System.out.println(d.getDate() );//		
		System.out.println(d.getDay() );// 0이 일요일
		//요일을 한글로 
		//switch / if
		String[] weekname = {"일","월","화","수","목","금","토"};//잔머리
		System.out.println(weekname[d.getDay()]);
	}

}
