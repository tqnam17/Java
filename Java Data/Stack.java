import java.util.Stack;

public class Main {
public static void main(String[] args) {
	Stack<String> stack = new Stack<String>();
	
	System.out.println(stack.empty());
	stack.push("Mine");
	stack.push("Sky");
	stack.push("DOOM");
	
	stack.push("Borde");
	stack.push("FFVI");
	
	stack.pop();
	stack.pop();	
	
	System.out.println(stack.peek());
	System.out.println(stack);
	System.out.println(stack.search("Mine"));
	System.out.println(stack.search("DOOM"));
}
}
