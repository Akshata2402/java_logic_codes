package practice;

public class AlphaPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayAlpha(65);

	}
	
	public static void displayAlpha(int x) {
		//int i=65;
		
		if(x<=90) {
			System.out.println((char)(x));
			displayAlpha(x+1);
		}
	}

}
