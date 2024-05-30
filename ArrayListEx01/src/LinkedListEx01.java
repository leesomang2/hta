import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		
		l1.add("홍길동");
		l1.add("박문수");
		
		System.out.println(l1.size());
		System.out.println(l1);
		
		for(String data : l1) {
			System.out.println(data);
		}
	}

}
