package common;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towersOfHanoi(4, 'A', 'C', 'B');
	}
	
	public static void towersOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
		// If only one disk, make the move and return
		if(n==1){
			System.out.println("Move disk 1 from peg "+fromPeg + " to peg "+ toPeg);
			return;
		}
		
		// Move top n-1 disks from A to B, using C as auxiliary
		towersOfHanoi(n-1, fromPeg, auxPeg, toPeg);
		
		// Move remaining disks from A to C
		System.out.println("Move disk from peg "+ fromPeg + " to Peg "+ toPeg);
		
		// Move n-1 disks from B to C using A as auxiliary
		towersOfHanoi(n-1, auxPeg, toPeg, fromPeg);
	}

}
