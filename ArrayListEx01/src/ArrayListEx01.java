import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList 생성
		ArrayList a1 = new ArrayList(); //크기가 0인
		ArrayList a2 = new ArrayList(100); //크기가 100
		
		String data1 = "홍길동";
		//String -> Object 로 자동형변환
		a1.add(data1);
		
		Object obj1 = data1;
		a1.add(obj1);
		a1.add("박문수");
		
		System.out.println(a1.size()); //데이터 사이즈
		System.out.println(a1.toString());//안에 데이터 배열형식출력
		
		a1.add("임꺽정");
		System.out.println(a1.toString());
		
		//get (가져오기   가져오려는 데이터가 String이기때문에 형변환필요
		Object obj = a1.get(0);
		String str = (String)obj;
		
		System.out.println(str);
		
		//전체 데이터 for문
		for(int i = 0; i < a1.size(); i ++) {
			String tstr = (String)a1.get(i);
			System.out.println(tstr);
		}
		
		//향상된 포문
		for(Object tobj : a1) {
			String tstr = (String)tobj;
			System.out.println(tstr);
		}
		
		
		//데이터 삽입
		a1.add(2, "장길산"); //  인덱스 2번째에 "장길산" 삽입
		
		System.out.println(a1);
		
		a1.set(0, "이몽룡"); // 인덱스 0번째 이몽룡으로 수정
		System.out.println(a1);
		
		//특정 데이터 지우기
		a1.remove(0);
		System.out.println(a1);
		
		a1.remove(0);
		System.out.println(a1);
		
		a1.clear();  //전체 지우기
		System.out.println(a1);
		
		}
}
