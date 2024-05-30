import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	//같은내용 거름
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return name.equals(p.name) && age==p.age;
	}
	public int hashCode() {
		return Objects.hash(name, age);
	}//같은내용 거름
	
	
	
}
