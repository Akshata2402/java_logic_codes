package practice;

import java.util.Scanner;

public class DifficientNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt(),sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		if(sum<n){
			System.out.println("Number is difficient");
		}else {
			System.out.println("Number is not difficient");

		}

	}

}
