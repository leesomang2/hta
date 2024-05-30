import java.util.Objects;

public class Person {//extend object생략
	//캡슐화 
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//내부데이터 접근용
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override//주소값보여주다 내용값으로 보임
	public String toString() { //우클릭 소스 ->제네레이트ToString
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Person p = (Person)obj;
		//내용값 비교
		if(p.id == this.id&&p.name.equals(this.name)&&p.age==this.age) {
			result = true;
		}
		return result;
	}
	
	
}
