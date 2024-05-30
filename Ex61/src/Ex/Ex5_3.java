package Ex;

public class Ex5_3 {//배열 활용 최대값 최소값

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {79, 88, 91, 33, 100, 55, 95 }; //int형 배열선언후 값초기화 7개
		
		int max = score[0]; // int max선언후 값 int형 배열 첫번째 인덱스로 초기화
		int min = score[0]; // int min선언후 값 int형 배열 첫번째 인덱스로 초기화
		
		for(int i=1; i < score.length; i++) { //배열의 두번째 값부터 읽기위해 i = 1 로 초기화 // for문시작
			if(score[i] > max ) { //score[i]배열의 값이 max 값보다 높으면 
				max = score[i]; // max 는 score[i]값 대입
			}else if (score[i] < min) { //그게아니고 score[i]의값이 min값보다 작으면
				min = score[i]; // min 은 score[i] 값 대입
			}
		}//for 문 끝
		System.out.println("최대값 :" + max); //마지막대입값출력  최대값 : 100 
		System.out.println("최소값 :" + min);//마지막대입값출력   최소값 : 33
	}

}
