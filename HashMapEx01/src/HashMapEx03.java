import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", 22);
		Person p2 = new Person("박문수", 23);

		HashMap<String, Person> hm = new HashMap<String, Person>();
		hm.put("a", p1);
		hm.put("b", p2);

		System.out.println(hm);
		
		
		//keyset를 통해 가져오기
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println( key );
		}
		
		//values로 가져오기
		Collection<Person> values = hm.values();
		for(Person value : values) {
			System.out.println(value);
		}
	}

}
