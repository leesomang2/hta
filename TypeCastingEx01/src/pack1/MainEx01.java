package pack1;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child1 c1 = new Child1();
		
		//Parent p1 = c1; 상속관계 아니라 error
		
		Child2 c2 = new Child2();
		Parent p2 = c2;
		
		Parent p3 = new Child2();
		
		//모든 클래스는 Object로 형변환 가능
		Object o1 = new Parent();
		Object o2 = new Child1();
		Object o3 = new Child2();
	}

}
