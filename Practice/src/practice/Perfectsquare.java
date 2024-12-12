package practice;

public class Perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=84;
		if(isPerfectSquare(x)) {
			System.out.println("Ture");
		}else {
			System.out.println("False");
		}

	}
	
	static boolean isPerfectSquare(int x) {
		if(x>=0) {
			int sr=(int)Math.sqrt(x);
			return ((sr*sr)==x);
		}
		
		return false;
	}

}
