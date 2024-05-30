
public class AnnotationEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx01 c = new ClassEx01();
		c.newMethod();
		
		//deprecated
		c.oldMethod();
		
		System.out.println(c.newField);
		System.out.println(c.oldField);
	}

}
