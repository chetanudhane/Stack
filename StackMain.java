package linkedlist;

public class StackMain {

	public static void main(String[] args) {

		LinkedListExample stack=new LinkedListExample();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.print();
		stack.peak();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.peak();
		stack.print();
	}

}
