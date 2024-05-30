package Ex;

public class Ex5_2 {//배열활용 총합,평균

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;  //총합 저장 위한 변수 sum선언
		double avg= 0;  //평균 저장 위한 변수 avg 선언
		
		int[] score = {100, 88 , 100 , 100 , 90}; //int형 배열선언 과 동시에 초기화
		
		for(int i = 0; i < score.length; i++) {//for문 인트형 i선언후 배열 길이만큼 포문진행
			sum += score[i]; // 배열 인덱스값 순서대로 sum에 +
		}
		avg = sum / (double)score.length; //avg는  sum값 / 배열길이 double로 강제형변환 
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
