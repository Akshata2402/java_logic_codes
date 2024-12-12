package Patterns;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=4;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			k--;
			System.out.println();
		}

	}

}
