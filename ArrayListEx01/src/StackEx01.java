import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();

		stack.push("홍길동");
		stack.push("박문수");

		System.out.println(stack);

		stack.add("임꺽정");
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());

		System.out.println(stack.get(stack.size()-1));
		System.out.println(stack.size());
		
		stack.remove(stack.size()-1);
		System.out.println(stack.size());
		
	}

}
