import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 :");
		String id = sc.nextLine();
		System.out.print("비밀번호 :");
		String password = sc.nextLine();
		
		System.out.println("입력 "+ id);
		System.out.println("입력 "+ password);
		
		
		sc.close(); //입력한거 종료
	}

}
