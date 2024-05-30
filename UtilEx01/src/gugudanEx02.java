import java.util.Scanner;

public class gugudanEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너를 통한 시작단수부터 끝단수 구구단 출력

		Scanner dan = new Scanner(System.in);

		System.out.print("시작단수를 입력하세요 : ");
		int start = dan.nextInt();
		System.out.print("끝단수를 입력하세요 : ");
		int end = dan.nextInt();
		System.out.println(start + "단에서" + end + "단까지 출력");
		for (int i = start; i <= end; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println();
		}
	}

}
