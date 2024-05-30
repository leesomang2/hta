//args를 통한 값입력 받고 처리하기 RunConfiguration
public class CalculatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력
		if( args.length != 1 ) {
			System.out.println("1개 입력하셔야 합니다");
		}else {
		//	System.out.println("정상 입력");
		}
		//처리
		//"10 oper 10"
		String[] datas =args[0].split(" ");
		//System.out.println(datas[0]);
		//System.out.println(datas[1]);
		//System.out.println(datas[2]);
		int value1 = Integer.parseInt(datas[0]);
		String oper = datas[1];
		int value2 = Integer.parseInt(datas[2]);
		
		//switch문 사용가능
		//if( oper=="+" ){//문자열이기때문에 equals 사용
		if(oper.equals("+")) {
			System.out.println("결과 : " + ( value1 + value2));
		}else if(oper.equals("-")) {
			System.out.println("결과 : " + ( value1 - value2));
		}else if(oper.equals("*")) {
			System.out.println("결과 : " + ( value1 * value2));
		}else {
			System.out.println("결과 : " + ( value1 / value2));
		}
		
		//출력
		
	}

}
