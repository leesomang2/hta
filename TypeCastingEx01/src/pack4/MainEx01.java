package pack4;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Child1Employee child1 = new Child1Employee();
		Child2Employee child2 = new Child2Employee();
		
		child1.salary();
		child2.salary();
		
		//다형성
		Employee e1 = new Child1Employee();
		Employee e2 = new Child2Employee();
		
		e1.salary();
		e2.salary();
		}

}
