package Patterns;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=4;
		for(int i=1;i<=4;i++) {
			k=k-i;
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
				
			}
			
			System.out.println();
		}

	}

}
