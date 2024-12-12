package practice;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="AAA";
		String rev="";
		
		for(int i=0;i<str1.length();i++) {
			rev=rev+str1.charAt(i);
		}
		
		if(str1.equals(rev)) {
			System.out.println("String is palendrom");
		}

	}

}
