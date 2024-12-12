package NumberConversion;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int binary=sc.nextInt();
		int decimal=0;
		int n=0;
		
		while(binary>0) {
			int temp=binary%10;
			decimal+=temp*Math.pow(2,n);
			binary=binary/10;
			n++;
		}

		int octal[]=new int[20];
		int i=0;
		while(decimal>0) {
			int r=decimal%8;
			octal[i++]=r;
			decimal=decimal/8;
			
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(octal[j]);
		}
	}

}
