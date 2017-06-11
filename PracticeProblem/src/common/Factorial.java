package common;

/*
 * Get the factorial of a number with out using recursion
 * Get the factorial of a number using recursion
 */

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(factorial(n)+" "+fact_recur(n));
	}
	
	static long factorial(int n){
		long fact = 1;
		for (int i = 2; i<=n; i++){
			fact = fact*i;
		}
		return fact;
	}
	
	static long fact_recur(int n){
		if(n==1){
			return 1;
		}
		return (n * fact_recur(n-1));
	}

}
