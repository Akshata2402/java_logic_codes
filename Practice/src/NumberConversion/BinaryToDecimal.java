package NumberConversion;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int binary=sc.nextInt();
		int decimal=0;
		int num=0;
		while(binary>0) {
			int temp=binary%10;
			decimal+=temp*Math.pow(2,num);
			binary/=10;
			num++;
		}
		
		System.out.println(decimal);

	}

}
