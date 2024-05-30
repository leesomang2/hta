import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		
		hs.add("홍길동");
		hs.add("박문수");
		hs.add("임꺽정");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("홍길동");
		hs.add("홍길동");
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("장길산");
		System.out.println(hs);
		
		//System.out.println(hs.get(0));
		
		
		for( String data : hs) {
			//System.out.println( data );
		}
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
