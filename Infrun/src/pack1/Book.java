package pack1;

public class Book {
	String title;
	String author;
	int page;
	
	Book(){
		this("","",0);
	}
	
	Book (String title,String author ,int page){
		this.title = title;
		this.author= author;
		this.page = page;
	}
	Book (String title,String author ){
		this( title, author, 400); 
		
	}
	void displayInfo() {
		System.out.println("책의 이름은 : " + title + " 저자 : " + author +" 페이지수 : "+page);
	}
	
}
