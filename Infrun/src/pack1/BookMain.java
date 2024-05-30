package pack1;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.displayInfo();
		
		Book book2 = new Book("Hello java","seo");
		book2.displayInfo();
		
		Book book3 = new Book("JPA 프로그래밍", "kim",700);
		book3.displayInfo();
		
	}

}
