package Patterns;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=64;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(k+j)+" ");
			}
			k++;
			System.out.println();
		}

	}

}
