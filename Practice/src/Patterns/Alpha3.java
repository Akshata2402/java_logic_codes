package Patterns;

public class Alpha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=65;
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print((char)(a)+" ");
				a++;
			}
			System.out.println();
		}

	}

}
