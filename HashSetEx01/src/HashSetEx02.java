import java.util.HashSet;

public class HashSetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("홍길동", 21);
		Person p2 = new Person("박문수", 22);
		
		HashSet<Person> hs = new HashSet<Person>()	;
		hs.add(p1);
		hs.add(p2);
		
		System.out.println( hs );
		
		Person p3 = new Person("박문수", 22);
		hs.add(p3);

		System.out.println( hs );
	}

}
