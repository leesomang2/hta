import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generic (지네릭)  자료형 선언
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("홍길동");
		a1.add("박문수");
		//a1.add(10);  String 지정해서 error발생
		
		String str = a1.get(0);
		System.out.println( str );
		
		for( String pstr : a1) {
			System.out.println( pstr );
		}
		
	}

}
