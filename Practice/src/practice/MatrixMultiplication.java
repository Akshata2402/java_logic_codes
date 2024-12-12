package practice;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m1[][]= {{2,2,2},
				{2,2,2},
				{2,2,2}};
		int m2[][]= {{2,2,2},
				{2,2,2},
				{2,2,2}};
		int m3[][]=new int[3][3];
		
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m2.length;j++) {
				m3[i][j]=m1[i][j]*m2[i][j];
			}
		}
		
		for(int i=0;i<m3.length;i++) {
			for(int j=0;j<m3.length;j++) {
				System.out.println(m3[i][j]);
			}
		}
		
	}

}
