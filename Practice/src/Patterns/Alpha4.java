package Patterns;

public class Alpha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j<=3-i) {
					System.out.print(" ");
					
				}else {
				   System.out.print((char)(a));
				   a++;
				}
			}
			System.out.println();
		}

	}

}
