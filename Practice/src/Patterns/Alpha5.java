package Patterns;

public class Alpha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=65;
		int m=66;
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				if(i%2!=0) {
				   System.out.print((char)k+" ");
				   k+=2;
				}else {
					System.out.print((char)m+" ");
					m+=2;
				}
				
			}
			
			System.out.println();
		}

	}

}

/*A C E G
  B D F
  C E 
  D*/

/*      4
      3 4
     2 3 4
   1 2 3 4*/

