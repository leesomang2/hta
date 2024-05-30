package Ex;
import java.util.Arrays;

public class Ex5_1 { //배열의 출력 예

	public static void main(String[] args) {
		int[] iArr1 = new int[10]; //int형 배열 선언 new int에 10개짜리배열
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60} //int형 배열 선언 동시에 초기화
		int[] iArr3 = { 100, 95, 80, 70, 60 };//int형 배열 선언 동시에 초기화
		char[] chArr = { 'a', 'b', 'c', 'd' };//char형 배열 선언 동시에 초기화

		for (int i = 0; i < iArr1.length; i++) { // iArr1배열에 1~10숫자 순서대로 초기화
			iArr1[i] = i + 1;
		}
		
		for (int i = 0; i < iArr2.length; i++) {// iArr2배열에 1~10 랜덤숫자 초기화
		iArr2[i] = (int)(Math.random()*10) + 1;
		}
		
		for(int i = 0; i < iArr1.length; i++) { 
			System.out.print(iArr1[i]+","); //iArr1 배열 순서대로 출력
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2)); //배열 [값출력]
		System.out.println(Arrays.toString(iArr3));//배열 [값출력]
		System.out.println(Arrays.toString(chArr));//배열 [값출력]
		System.out.println(iArr3);//참조주소 출력 
		System.out.println(chArr);//가지고 있는 값만출력 abcd
		
		}

	}

