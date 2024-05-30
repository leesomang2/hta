import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student("1001","홍길동");
		Student s2 = new Student("1002","박문수");
		
		a1.add(s1);
		a1.add(s2);
		//확인하기
		System.out.println(a1.toString());
		
		//가져오기
		Student stu = a1.get(0);
		System.out.println(stu);
	}

}
