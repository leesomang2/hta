
public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello String Hello String";
		
		System.out.println(str1.length());
		System.out.println("Hello".length());
		
		//문자 추출(형변환)
		char ch1 = str1.charAt(0); // 첫글자 추출
		System.out.println( ch1 ); 
		char ch2 = str1.charAt(str1.length()-1); //마지막 글자 추출
		System.out.println( ch2 );
		
		//문자열 추출
		String pstr1 = str1.substring( 2 );
		System.out.println( pstr1 );
		String pstr2 = str1.substring( 2 , 4 );
		System.out.println( pstr2 );
		
		//문자열 위치 검색- indexOf/ lastIndexOf
		//int pos1 = str1.indexOf('l');
		int pos1 = str1.indexOf("ll"); // -1 출력시 문자열에 있는 문자아님
		System.out.println( pos1 );
		
		//문자열의 존재 여부
		//startsWith(시작확인) /endsWith(끝확인)/ contains(포함확인)
		System.out.println( str1.startsWith("He"));
		System.out.println( str1.startsWith("he"));
		
		//문자열 치환
		System.out.println(str1.replaceAll("Hello","안녕"));
		
		//문자열 결합 : +
		System.out.println(str1.concat("안녕"));
		
		//대소문자 변경
		System.out.println("hello".toUpperCase());
		System.out.println("HELLO".toLowerCase());
		
		//문자열 앞뒤 공백문자 제거
		String oStr1 = "     Hello  String     ";
		System.out.println( oStr1.length());
		String oStr2 = oStr1.trim(); //중간은 제거안됨
		System.out.println(oStr2.length());
		System.out.println(oStr2 + "끝");
		
		//구분자 중심의 문자열 분리
		String sStr1 = "apple,banana,pineapple,kiwi";
		String[] strArr1 = sStr1.split(",");
		for(String str : strArr1) {
			System.out.println(str);
		
		}
		
		// 문자열 형식의 출력 printf
		// 문자열 형식 
		String jStr1 = String.format("%s,%s,%s","딸기","사과","수박");
		System.out.println( jStr1 );
				
		
	}

}
