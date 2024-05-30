import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.in = 표준입력(키보드입력)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 :");
		String msg1 = sc.next();// next = 단어입력
		String msg2 = sc.next();// next = 단어입력
		System.out.println("입력: " + msg1);
		System.out.println("입력: " + msg2);
		
		sc.close(); //입력한거 종료
	}

}
