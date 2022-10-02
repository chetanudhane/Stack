package linkedlist;

public class LinkedListExample {

	private Node head;

	private class Node {
		int key;
		Node next;

		public Node(int key) {
			this.key = key;
		}
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public void peak() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println("Peak element is " + temp.key);
		}
	}

	public int pop() {
		if(head == null) {
			System.out.println("Stack is Empty");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.key;
	}

	public void print() {
		Node temp = head;
		System.out.println("Stack : ");
		while (temp != null) {
			System.out.print(temp.key + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
}
