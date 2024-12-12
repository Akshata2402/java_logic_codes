package NumberPrograms;

public class KoprekarNo {
	public static void main(String[] args) {

		if (isKoprekarNumber(45)) {
			System.out.println("It is an Koprekar Number.");
		} else {
			System.out.println("It is not Koprekar Number.");
		}
	}

	public static boolean isKoprekarNumber(int num) {
		
		int sq=num*num;
		
		String str=String.valueOf(sq);
		
		int len=str.length();
		
		String left=str.substring(0,len/2);
		String right=str.substring(len/2);
		
		int add=Integer.parseInt(left)+Integer.parseInt(right);
		
		if(add==num)
			return true;
		
		return false;
	}
}
