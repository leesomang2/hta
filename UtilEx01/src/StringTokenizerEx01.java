import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringTokenizer = split
		String strData = "사과 참외 수박 딸기";
		StringTokenizer st1 = new StringTokenizer(strData);
		
		System.out.println(st1.countTokens());//4개가 저장된거
		
		//System.out.println(st1.nextToken()); //첫번째 데이터 출력
		//System.out.println(st1.nextToken()); //두번째 데이터 출력
		//System.out.println(st1.hasMoreTokens()); //다음에 읽을게 있는지 확인
		//System.out.println(st1.nextToken()); 
		//System.out.println(st1.hasMoreTokens());
		//System.out.println(st1.nextToken());
		//System.out.println(st1.hasMoreTokens());
		//System.out.println(st1.nextToken());
		
		//while(st1.hasMoreTokens()) {
			//System.out.println(st1.nextToken());
		//}
		
		String strData2 = "사과&참외&수박&딸기";
		StringTokenizer st2 = new StringTokenizer(strData2,"&");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
