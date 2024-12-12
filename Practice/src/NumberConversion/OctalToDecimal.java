package NumberConversion;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Octal Number");
		int octal=sc.nextInt();
		int decimal=0;
		int num=0;
		while(octal>0) {
			int temp=octal%10;
			decimal+=temp*Math.pow(8,num);
			octal/=10;
			num++;
			
		}
		System.out.println(decimal);

	}

}
