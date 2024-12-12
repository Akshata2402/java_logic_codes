package Patterns;

public class AlphabateTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		char ch='A';
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
				
		}
	}

}
