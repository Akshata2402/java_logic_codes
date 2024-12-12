package practice;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		for(int i=1;i<=n;i++) {

			int p=1;
			for(int j=1;j<=i;j++) {
				
				System.out.print(p+" ");
                p = p * (i - j) / j;

				
			}
			System.out.println();
		}

	}

}
