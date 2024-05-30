import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 자료형 -8가지
		//Autoboxing
		ArrayList a1 = new ArrayList();
		
		//object - wrapper - autoboxing - 1
		a1.add( 1 ); //삽입  autoboxing으로 간편하게
		a1.add( 2 ); //삽입
		
		Integer i1 = Integer.valueOf( 3 );    //원래 숫자 넣으려면 이형식으로 넣어야함 원칙
		Object obj = i1;     
		a1.add(obj);
		
		System.out.println(a1.toString());
		
		Integer i2 = (Integer)a1.get(0);
		System.out.println(i2.intValue()); //데이터가져오기
		
		//unboxing
		int i3 = (int)a1.get(1); //객체인데 Integer 아닌 int로 형변환 
		System.out.println( i3 );
	}

}
