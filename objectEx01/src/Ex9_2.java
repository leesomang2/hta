class Person1{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person1)obj).id;
		else 
			return false;
	}
	Person1(long id){
		this.id=id;
	}
}



public class Ex9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 =new Person1(8011081111222L);
		Person1 p2 =new Person1(8011081111222L);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다르 사람입니다");
				
			
	}

}
