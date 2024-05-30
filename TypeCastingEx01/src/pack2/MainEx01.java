package pack2;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동형변환
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		
		//
		//Child1 c1 = (Child1)p2; //runtime error 출신다름 p2=Child2
		Child1 c1 = (Child1)p1;
	}

}
