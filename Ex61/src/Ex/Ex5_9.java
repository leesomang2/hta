package Ex;

public class Ex5_9 {//2차원 배열 초기화 2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {//int형 2차원 배열 선언및 초기화
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
				};
		
		//과목별 총점 담을 변수 생성및 초기화
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학  총점  평균 "); //내용출력
		System.out.println("=============================");//내용출력
		
		                         //배열길이 5
		for(int i = 0 ; i < score.length; i++) { // i는 0이고 i는 스코어배열길이만큼
			int sum = 0; //개인별 총점 담을변수
			float avg = 0.0f; // 개인별 평균 담을 변수
			
			korTotal += score[i][0]; //i값에 열 더해주기
			engTotal += score[i][1];//i값에 열 더해주기
			mathTotal += score[i][2];//i값에 열 더해주기
			System.out.printf("%3d", i + 1); //번호 
			                       
			                       //i에배열길이(열갯수)3
			for (int j = 0; j < score[i].length; j++) { //j는 0 j는 i에 배열길이만큼 for문진행
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			                                                 //과목이 3개
			avg = sum/(float)score[i].length; //전체 더한거 / i에 배열길이(열갯수) 3 
			System.out.printf("%5d %5.1f%n", sum, avg);
			
		}
		System.out.println("====================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal , engTotal, mathTotal);
	}

}
