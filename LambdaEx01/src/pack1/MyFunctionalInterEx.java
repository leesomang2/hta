package pack1;


public class MyFunctionalInterEx {
	public static void main(String[] args) {
		
		//내부익명클래스
		MyFunctionalInter f = new MyFunctionalInter() {
			
			@Override
			public void method() {
				System.out.println("method() 호출");
			}
		};
		
		f.method();
		
		//Lambda
		f = () ->{
			System.out.println("method() 호출2");
		};
		
		f.method();
		
		//더 줄이기
		f = () -> System.out.println("method() 호출3");
		
		f.method();
	}
}
