import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("홍길동");
		queue.offer("박문수");
		
		queue.add("임꺽정");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.size());
	}

}
