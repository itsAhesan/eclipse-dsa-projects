package com.jony.array.sorting.linkedlist;

public class LinkedListDemo {

	Node start;
	Node end;

	public LinkedListDemo() {
		start = null;
		end = null;
	}

	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public Node getEnd() {
		return end;
	}

	public void setEnd(Node end) {
		this.end = end;
	}

	public void add(int data) {
		if (start == null) {
			start = new Node(data);
			end = start;
		} else {
			Node temp = new Node(data);
			end.next = temp;
			end = temp;
		}

	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = start;
		start = node;

	}

	public boolean search(Node node, int x) {
		Node current = node; // Initialize current
		while (current != null) {
			if (current.data == x)
				return true; // data found
			current = current.next;
		}
		return false; // data not found
	}

	public void print() {
		Node current = start;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}

	public static void main(String[] args) {
		LinkedListDemo lsd = new LinkedListDemo();
		lsd.add(20);
		lsd.add(21);
		lsd.add(5);
		lsd.add(50);

		lsd.push(10);
		
		boolean search = lsd.search(lsd.start, 21);
		if(search==true){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		lsd.print();

	}

}
