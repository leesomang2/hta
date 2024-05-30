
public class ObjectEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비교
		int a1 = 10;
		int a2 = 10;
		
		System.out.println( a1==a2 );//변수 안에 내용 값을 비교
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println( o1 == o2 );//변수 안에 내용(참조주소) 값을 비교
		
		System.out.println( o1.equals(o2));//변수안에 내용(멤버 변수 값)을 비교
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1==str2); //참조값이 다르기 떄문에 false
		
		//String에서 overriding
		System.out.println(str1.equals(str2)); //String클래스에서 내용값비교
		
		Person p1 = new Person(111,"홍길동",22);
		Person p2 = new Person(111,"홍길동",22);
		
		System.out.println( p1 == p2 );//참조주소값비교
		System.out.println( p1.equals(p2) ); //내용비교
		
	}

}
