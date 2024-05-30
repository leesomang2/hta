package pack2;

public class MyFunctionalInterEx {
	public static void main (String[] args) {
		
		MyFunctionalInter f = () -> System.out.println("method() 호출");
		
		f.method1();
	}
}
