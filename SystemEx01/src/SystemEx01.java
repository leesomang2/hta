
public class SystemEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		
		//입력값 검사 
		if(args.length != 1) {
			System.out.println("비정상 입력");
			//프로그램 강제 종료
		}else {
			System.out.println("정상 입력");
		}
		
		System.out.println("프로그램 끝");
	}

}
