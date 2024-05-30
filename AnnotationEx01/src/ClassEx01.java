
public class ClassEx01 {
	int newField;
	
	@Deprecated
	int oldField;
	
	public void newMethod() {
		System.out.println("newMethod() 호출");
	}
	
	@Deprecated
	public void oldMethod() {
		System.out.println("oldMethod() 호출");
	}
	
}
