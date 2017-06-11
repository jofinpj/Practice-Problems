package common;

/*
 * Find the prime number
 * check if a given number is prime or not
 * print prime number upto n
 * print n prime number
 */

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 20;
		
		//check if n is prime
		//System.out.println(isPrime(n));
		
		//print prime numbers upto n
		/*for (int i = 1; i<=n; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}*/
		
		//print first n prime numbers
		int i = 1;
		int j = 1;
		while(i<=n){
			if(isPrime(j)){
				System.out.println(i+"th prime = "+j);
				i++;
			}
			j++;
		}

	}
	
	static boolean isPrime(int n){
		boolean isPrime = true;
		if(n == 1)
			isPrime = false;
		
		for(int i=2; i*i<=n; i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

}
