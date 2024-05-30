
public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 저장과 관련된 클래스
		// String / StringBuffer / String Builder

		// 생성
		String str1 = "Hello String"; // 일반적인방식

		String str2 = new String("Hello String"); // 생성자를 통해 만들기
		char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
		String str3 = new String(str1);

		System.out.println(str1);

		// 문자열의 비교
		String str11 = "Hello String";
		String str12 = "Hello String";
		System.out.println(str11.equals(str12));
		System.out.println(str11 ==str12);
		
		String str21 = new String("Hello String");
		String str22 = new String("Hello String");
		System.out.println(str21.equals(str22));
		System.out.println(str21=str22);
	}

}
