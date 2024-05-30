import java.util.Arrays;

public class ArraysEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNums = {5, 4, 3, 2, 1};
		
		//정렬이 전제조건 
		int index = Arrays.binarySearch(arrNums, 3);
		System.out.println(index);
		
		Arrays.sort(arrNums);
		index = Arrays.binarySearch(arrNums, 3);
		System.out.println(index);
		
	}

}
