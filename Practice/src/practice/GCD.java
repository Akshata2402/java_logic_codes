package practice;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=56;
		int n2=98;
		int gcd=findGcd(n1,n2);
		int lcm=findLcm(n1,n2);
		System.out.println("The GCD of "+n1+" and "+n2+" is "+gcd);
		
		System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);


	}
	
	public static int findLcm(int a,int b) {
		return (a*b)/findGcd(a,b);
	}
	public static int findGcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return findGcd(b,a%b);
	}

}
