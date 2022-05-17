import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Amit");
		queue.add("Aman");
		queue.add("Raynell");
		queue.add("Vilecha");
		
		System.out.println(queue.peek());
		
		System.out.println(queue);
		
		//With poll we can see which element is being removed, and can print
		System.out.println(queue.poll());

		System.out.println(queue);

		//With remove we can sonly remove the element, and cannot print
		queue.remove();	
		
		System.out.println(queue.size());

		System.out.println(queue);

	}

}
