package Patterns;

public class Alpha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=70;
		for(int i=1;i<=5;i++) {
			a=a-i;
			for(int j=1;j<=i;j++) {
				System.out.print((char)(a)+" ");
				a++;
			}
			System.out.println();
		}

	}

}
