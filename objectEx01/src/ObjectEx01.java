
public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성 object클래스
		Object o1 = new Object();
		
		System.out.println(o1);//클래스이름@참조주소 출력
		System.out.println(o1.toString()); //위에꺼랑 같은거
		
		String str = o1.toString();
		System.out.println(str);
		
		//o1.getClass() = 클래스의 정보  
		System.out.println(o1.getClass().getName());//클래스 이름만 출력
		System.out.println(o1.hashCode());//위에 주소 16진수표기를 10진수표기로바꿈
		System.out.printf("%x%n",o1.hashCode());//10진수표기를 16진수로 보기
		
		Person p = new Person(111,"홍길동",22);
		System.out.println(p);
		System.out.println(p.toString());//상속으로 사용가능
		
		//내부 데이터 확인
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		
		//toString
		//일반적 : 참조값,주소값 / 내부 데이터가 있는경우 데이터확인
		//String 클래스 내부에서 toString 메서드를 overriding
		String str1 = new String("Hello");
		System.out.println(str1); 
		System.out.println(str1.toString());
	}

}
