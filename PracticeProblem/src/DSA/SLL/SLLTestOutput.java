package DSA.SLL;

public class SLLTestOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL list = new SLL();
		// empty list 
		list.display();
		
		list.insert(5);
		list.display();
		
		list.pop();
		list.display();
		
		list.push(7);
		list.push(8);
		list.display();
		
		System.out.println(list.removeAt(2));
		list.display();
		
		list.insertAt(5, 0);
		list.insertAt(6, 1);
		list.insertAt(10, 4);
		list.insertAt(11, 4);
		list.insertAt(12, 3);
		list.display();
		
		System.out.println(list.removeAt(55));
		list.display();
	}

}
