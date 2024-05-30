import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 조작 : Arrays
		String[] arrs = {"aaa","bbb","ccc"};
		
		System.out.println(arrs.toString());
		System.out.println(Arrays.toString(arrs)); //배열내용확인
		
		//초기화
		Arrays.fill(arrs, "xxx");
		System.out.println(Arrays.toString(arrs));
		
		//일부초기화
		Arrays.fill(arrs,0,2, "yyy");
		System.out.println(Arrays.toString(arrs));
		
		String[] arrs1 = {"aaa","bbb","ccc"};
		String[] arrs2 = {"aaa","bbb","ccc"};
		
		System.out.println( arrs1 == arrs2); //참조주소 비교기 때문에 false
		System.out.println( Arrays.equals(arrs1, arrs2)); //equals 로 내용확인 true
		
		Integer[] arrNums = {5, 3, 4, 2, 1};
		Arrays.sort(arrNums);//정렬
		System.out.println(Arrays.toString(arrNums));
	}

}
