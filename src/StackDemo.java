import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		
		stack.add("America");
		stack.add("Australia");
		stack.add("India");
		stack.push("Sydney");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		String poppedElement = stack.pop();
		
		System.out.println(poppedElement);
		
		System.out.println(stack);

	}

}
