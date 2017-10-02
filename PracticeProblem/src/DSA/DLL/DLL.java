package DSA.DLL;

public class DLL {
	class Node {
		int data;
		Node next, prev;
		public Node(int data) {
			this.data = data;
			next = prev = null;
		}
	}
	
	int size;
	Node head, tail;
	
	public DLL() {
		size = 0;
		head = tail = null;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
		size++;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
	}
	
	public void insertAt(int data, int pos) {
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
		} else if (pos <= 1) {
			head.prev = node;
			node.next = head;
			head = node;
		} else {
			Node temp = head;
			for(int i = 1; i < pos - 1 && temp.next != null; i++){
				temp = temp.next;
			}
			node.prev = temp;
			node.next = temp.next;
			temp.next = node;
			if (node.next == null) {
				tail = node;
			} else {
				node.next.prev = node;
			}
		}
		size++;
	}
	
	public int pop() {
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		Node node = head;
		head = head.next;
		if (head == null) {
			tail = null;
		} else {
			head.prev = null;
		}
		size--;
		return node.data;
	}
	
	public int removeAt(int pos) {
		if (head == null || pos < 1 || pos > size) {
			return Integer.MIN_VALUE;
		}
		Node node = null;
		if (pos == 1) {
			node = head;
			head = head.next;
			if (head == null) {
				tail = null;
			} else {
				head.prev = null;
			}
		} else {
			Node temp = head;
			for(int i = 1; i < pos - 1; i++)
				temp = temp.next;
			node = temp.next;
			temp.next = temp.next.next;
			if (temp.next == null) {
				tail = temp;
			} else {
				temp.next.prev = temp;
			}
		}
		size--;
		return node.data;
	}
	
	public int remove(int data) {
		return Integer.MIN_VALUE;
	}
}
