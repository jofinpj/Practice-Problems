package DSA.SLL;

public class SLL {
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	int size;
	Node head, tail;
	
	public SLL(){
		size = 0;
		head = tail = null;
	}
	
	public int push(int data){
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
		return head.data;
	}
	
	public int insert(int data){
		Node node = new Node(data);
		if (tail == null){
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
		return node.data;
	}
	
	public int insertAt(int data, int pos) {
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
			size++;
		} else if (pos <= 1){
			push(data);
		} else if (pos > size) {
			insert(data);
		} else {
			Node temp = head;
			for (int i = 1; i < size && i < pos - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
			size++;
		}
		return node.data;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		//System.out.println("\nhead = "+ (head == null ? "null" : head.data) + 
		//		" tail = " + (tail == null ? "null" : tail.data) + " size = " + size + "\n\n");
	}
	
	public int pop(){
		if (head == null) {
			return Integer.MIN_VALUE;
		} else {
			Node node = head;
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
			return node.data;
		}
	}
	
	public int removeAt(int pos) {
		if (head == null || pos < 1 || pos > size) {
			return Integer.MIN_VALUE;
		} else {
			Node temp = head;
			if (pos == 1) {
				return pop();
			}
			for (int i = 1; i < pos - 1; i++){
				temp = temp.next;
			}
			Node node = temp.next;
			temp.next = temp.next.next;
			if (temp.next == null) {
				tail = temp;
			}
			size--;
			return node.data;
		}
	}
}
