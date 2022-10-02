package linkedlist;

public class Queue {

	public static void main(String[] args) {

		LinkedListExample queue=new LinkedListExample();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.print();
		queue.dequeue();
		queue.print();
	}

}
