package Ex;

public class Ex5_8 { //2차원배열초기화

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {  // 4행 3열 짜리 2차원배열 설정
				{100, 100, 100 },
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		int sum = 0 ; //합친 값 담을 변수 sum 선언                        (행갯수)
		for(int i = 0; i < score.length; i++) {// i=0초기화후 i 가 배열길이(4)보다 작을떄까지만 for문진행
			for(int j=0; j < score[i].length; j++) {// j 0초기화후 score의 행의길이(3) 만큼 for문진행 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				 //값출력후 sum 에 값 다 플러스
				sum+= score[i][j];
			}
		}
		System.out.println("sum = " + sum); //전체값 출력후 sum값 출력
	}
	

}
