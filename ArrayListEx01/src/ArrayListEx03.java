import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList();
		
		//모든 자료형은 Object로 변경 가능해서 자료형이 달라도 들어감
		a1.add("홍길동");
		a1.add("박문수");
		a1.add(10);
		a1.add(20);
		
		System.out.println(a1.toString());
		
		//데이터 가져올때
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.get(3));//이렇게는 가능
		
		//for 데이터 안정성 때문에 error발생
		for(int i = 0; i < a1.size(); i++) {
			String str = (String)a1.get(i);
			System.out.println( str );
		}
	}

}
