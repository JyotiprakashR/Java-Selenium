package collectionFramework;

import java.util.Stack;

public class StackClass {

	public static void main(String a[]) {

		
		Stack<String> stack = new Stack<>();
		
		stack.addElement("Tom");
		stack.addElement("Tom");
		
		stack.addElement("Hello");
		
		stack.addElement("Lily");
		
		stack.addElement("Ben");
		
		stack.addElement(null);
		stack.addElement(null);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.indexOf("Tom"));
		System.out.println(stack.search("Tom"));
	}

}
