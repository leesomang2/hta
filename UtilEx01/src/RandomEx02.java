import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lotto
		//5줄 출력 1줄당 6개
		Random r1 = new Random();
		
		for(int i = 1; i <= 5; i++) {
			for(int j=1; j<= 6; j++) {
		System.out.print(r1.nextInt(45)+1);
		System.out.print(" ");
		}System.out.println();
		}
		
		//간격까지 맞춘거
		Random r = new Random();
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j<=6; j++) {
				System.out.printf("%2d ",r.nextInt(45)+1);
			}
			System.out.println();
		}
	}

}
