import java.util.Scanner;

public class gugudanEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너를 통한 구구단 출력

		Scanner dan = new Scanner(System.in);

		for (;;) {
			System.out.print("단수를 입력하세요 : ");
			String id = dan.nextLine();
			if (id.equals("종료")) {
				System.out.println("프로그램 종료");
				break;
			}
			for (int i = 1; i <= 9; i++) {
				int a = Integer.parseInt(id);
				System.out.println(a + "*" + i + "=" + a * i);
			}
		}
		dan.close();
	}
}
