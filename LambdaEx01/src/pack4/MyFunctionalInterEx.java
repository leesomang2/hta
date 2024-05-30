package pack4;

import java.util.function.Consumer;

public class MyFunctionalInterEx {
	
	public static void main(String[] args) {
		
		//매개변수가 1개있고 , 리턴이 없는 메서드
		Consumer<Integer> consumer = i -> System.out.println("i :" + i);
		consumer.accept(10);
	}
}
