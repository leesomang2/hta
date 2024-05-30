package pack1;

public class MainEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child2 c2 = new Child2();
		
		//강제 형변환
		//Child2 c31= p;
		
		//Child2 c32= (Child2)p;   runtime exception
		
		Parent p1 = c2; //먼저 바꿈
		Child2 c3 = (Child2)p1;//형변환
		
	}

}
