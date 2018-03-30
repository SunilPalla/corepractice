package core;

import java.util.Stack;

/**
 * Created by sunilp on 3/21/18.
 */
public class StackImpl {
	public static void main(String[] args) {
		stackImpl();
	}

	private static void stackImpl() {
		Stack stack = new Stack();
		stack.add("a");
		stack.add("b");
		stack.add("c");
		stack.add("d");
		stack.add("e");
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		System.out.println(stack.peek());
		stack.push("d");
		System.out.println(stack.toString());

	}
}
