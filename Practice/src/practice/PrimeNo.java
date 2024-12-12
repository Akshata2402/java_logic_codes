package practice;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100;
		
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		
//		if(count==2) {
//			System.out.println("Prime number");
//		}else {
//			System.out.println("Not Prime Number");
//		}
			
		
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
