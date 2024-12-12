package NumberPrograms;

public class SpyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2,sum=0,product=1;
		while(n>0) {
			int ld=n%10;
			sum+=ld;
			product*=ld;
			n/=10;
		}
		
		if(sum==product)
			System.out.println("Spy Number");
		else
			System.out.println("Not Spy Number");
	}

}
