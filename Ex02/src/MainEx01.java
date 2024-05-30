
public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.viewParent();
		
		Child1 c1 =new Child1();
		c1.viewChild();
		c1.viewParent();
		
		c1.viewMethod();
	}

}
