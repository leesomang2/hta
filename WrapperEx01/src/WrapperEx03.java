
public class WrapperEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer i1 = Integer.valueOf(10); //10 -> 객체형 변환
		
		Integer i2 = 10; //Autoboxing 10이 자동적으로 객체형
		
		int i3 = i1; //Unboxing 객체형을 기본형으로 
		
		int sum = i1 + 20;
		System.out.println( sum );
		
		if( i1 == i3 ) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}

}
