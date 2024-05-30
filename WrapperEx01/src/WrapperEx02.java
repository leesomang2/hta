
public class WrapperEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//deprecated - 미래에 없어질 것을 예약 (줄그어진거)
		//Integer i1 = new Integer( 123 );
		
		//형변환 
		Integer i1 = Integer.valueOf( 123 ); //Integer 클래스
		Integer i2 = Integer.valueOf( "123" );
		Integer i3 = 345; 
		
		byte b = i1.byteValue();
		float f = i1.floatValue();
		System.out.println(b);
		System.out.println(f);
		
		String str = i1.toString();
		System.out.println(str);
		
		// 문자열 ->  * 정수/실수 * 중요
		int ii1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("123");
		System.out.println(ii1);
		System.out.println(f1);
		
		String str11 = ii1 + ""; //간단하게 정수형
		System.out.println(str11);
		
	}

}
