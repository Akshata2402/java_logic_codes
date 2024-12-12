package Recursion;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1099;
		System.out.println("Revered No :");
		reverse(n);

	}

	static void reverse(int n) {
		if(n<10){
			System.out.println(n);
			return;
		}else {
			System.out.print(n%10);
			reverse(n/10);
		}
		
	}
}
