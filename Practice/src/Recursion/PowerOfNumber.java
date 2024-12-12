package Recursion;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base=5,x=3;
		System.out.println("Required power of number is "+power(base,x));

	}
	
	static int power(int base,int x) {
		if(x==0)
			return 1;
		return (base*power(base,x-1));
	}

}
