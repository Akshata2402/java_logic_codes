package practice;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}};
		
		int b[][]=new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			     b[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(b[i][j]);
			}
		}
		

	   }

}
