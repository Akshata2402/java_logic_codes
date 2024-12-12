package practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Hello,I'm Akshata Nalawade";
		String str2="";
		
		for(int i=0;i<str1.length();i++) {
			str2=str1.charAt(i)+str2;
		}
		System.out.println(str2);
		for(int i=0;i<str2.length();i++) {
			int asci=str2.charAt(i);
			if(asci%2==0) {
				System.out.println(asci);
			}
		}
		
	}

}
