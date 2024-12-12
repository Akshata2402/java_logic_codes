package practice;

import java.util.Scanner;

public class BreakLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			/*int num=sc.nextInt();
			if(num<0) {
				System.out.println("User Enter negative number");

				break;
			}
			System.out.println(num);*/
			
			int n1=sc.nextInt();
			int n2=n1;
			if(n1<n2) {
				System.out.println("Unexcepted input");
				break;
			}
		}

	}

}
