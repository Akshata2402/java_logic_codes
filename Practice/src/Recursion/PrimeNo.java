package Recursion;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12;
		if(isPrime(n,2))
			System.out.println("It is prime number");
		else
			System.out.println("It is not prime number");
		

	}
	
	static boolean isPrime(int n,int i) {
		if(n<=2)
			return (n==2)?true:false;
		if(n%i==0)
			return false;
		if(i*i>n)
			return true;
		
	   return isPrime(n,i+1);
			
	}

}
