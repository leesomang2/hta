import java.util.Scanner;

public class ScannerEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요. 입력을 마치려면 q를 입력하세요");
		String msg ="";
		
		while( true ) {//무한루프
			System.out.print("입력 >");//입력 프롬프트
			msg = sc.nextLine();
			
			//q가 아닐경우에 if문실행 q일경우 else문실행
			if(!msg.equalsIgnoreCase("q")){//equalsIgnoreCase대소문자안가림
			System.out.println("입력 메시지: " + msg);//입력값처리
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
