package pack3;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		p.viewParent();
		p.doFunc();
		
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		p1.viewParent();
		//p1.viewChild1();  error
		p1.doFunc();
		p2.doFunc();
		
		
		Child1 c1 = new Child1();
		c1.viewChild1();
		c1.doFunc();
	}

}
