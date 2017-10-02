package DSA.SLL;

public class SLLGen <T> {
	class Node <T> {
		T data;
		Node next = null;
		
		public Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	
	int size ;
	Node head, tail;
	
	public <T> SLLGen (){
		size = 0;
		head = tail = null;
	}
	
	public T push(T data){
		Node node = new <T>Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
		return (T)node.data;
	}
	
	public T insert(T data) {
		Node node = new <T>Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
		return (T)node.data;
	}
	
	public T insertAt(T data, int pos) {
		Node node = new <T>Node(data);
		if (head == null) {
			head = tail = node;
			size++;
		} else if (pos <= 1) {
			push(data);
		} else if (pos > size) {
			insert(data);
		} else {
			Node temp = head;
			for(int i = 1; i < pos - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
			size++;
		}
		return (T) node.data;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data.toString() + " ");
			temp = temp.next;
		}
		/*System.out.println("\nHead = " + (head == null ? "null" : head.data.toString())
				+ " Tail = " + (tail == null ? "null" : tail.data.toString())
				+ "size = " + size + "\n\n");*/
	}
	
	public T pop(){
		Node temp = head;
		if (head == null) {
			return null;
		} else {
			temp = head;
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
		}
		return (T) temp.data;
	}
	
	public T removeAt(int pos) {
		if (head == null || pos < 1 || pos > size) {
			return null;
		} else if (pos == 1) {
			return pop();
		} else {
			Node temp = head;
			for(int i = 1; i < pos - 1; i++) {
				temp = temp.next;
			}
			Node node = temp.next;
			temp.next = temp.next.next;
			if (temp.next == null) {
				tail = temp;
			}
			size--;
			return (T) node.data;
		}
	}
}
