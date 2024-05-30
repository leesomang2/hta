import java.text.DecimalFormat;

public class FormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형식화된 출력
		
		System.out.printf("%s-%s%n", "10","100");
		
		//형식화된 입력
		String fNum = String.format("%s-%s", "10","100");
		System.out.println(fNum);
		
		//숫자
		//날짜
		
		//DecimalFormat format = new DecimalFormat( "000,0000.000" ); 빈곳들 0으로 채워줌
		DecimalFormat format = new DecimalFormat( "###,###.###" ); //숫자를 문자ㅓ열화
		
		//double dbNum = 1234.5;
		double dbNum = 1234.56;
		//double dbNum = 234.5;
		
		String strNum = format.format(dbNum);
		System.out.println(strNum);
	}

}
