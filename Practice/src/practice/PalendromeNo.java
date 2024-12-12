package practice;

public class PalendromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int rem=0,rev=0,n=555;
		int temp=n;
		
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		if(temp==rev) {
			System.out.println("Palendrome Number");
		}else {
			System.out.println("Not Palendrome Number");
		}*/
		
		for(int i=1;i<100;i++) {
			if(isPalendrome(i)) {
				System.out.println(i);
			}
			
		}
		

	}
	
	static boolean isPalendrome(int n) {
		int temp=n;
		int rev=0,rem=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return temp==rev;
		
	}
	

}
