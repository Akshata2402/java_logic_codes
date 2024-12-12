package practice;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,rem=0,n=125;
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);

	}

}
