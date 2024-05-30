package Ex;

import java.util.Arrays;

public class Ex5_4 { //배열활용 섞기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = { 0,1,2,3,4,5,6,7,8,9}; //int형 배열 선언후 초기화
		System.out.println(Arrays.toString(numArr)); //numArr [배열값] 출력
		
		for(int i = 0; i < 100; i++) {//100번섞기
			int n = (int)(Math.random()*10); //0~9까지의 랜덤값 출력후 n값에 대입
			int tmp = numArr[0]; // 배열 첫번째값을 int tmp에 대입
			numArr[0] = numArr[n];// n랜덤값 대입받은수를 배열 첫번째값에 대입
			numArr[n] = tmp ;// 배열값 tmp에 받은 수를 arr n에 대입
		}
		System.out.println(Arrays.toString(numArr)); //랜덤값 출력

	}

}
