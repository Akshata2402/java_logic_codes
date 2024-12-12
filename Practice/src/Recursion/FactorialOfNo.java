package Recursion;

public class FactorialOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Factorial of "+n+" is "+factorial(n));

	}
	
	static int factorial(int n) {
		if(n==0)
			return 1;
		return n* factorial(n-1);
	}

}
