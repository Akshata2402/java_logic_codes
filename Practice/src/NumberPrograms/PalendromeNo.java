package NumberPrograms;

public class PalendromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=100;i++) {
		     if(isPalendrome(i)) {
		    	 System.out.println(i);
		     }
		}
	}
	
	static boolean isPalendrome(int n) {
		int temp=n,rev=0;
		
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		return rev==temp;
	}

}
