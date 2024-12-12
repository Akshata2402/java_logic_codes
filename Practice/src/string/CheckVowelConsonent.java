package string;

public class CheckVowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Akshata";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		    char ch=str.charAt(i);
		    if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
		    	System.out.println(ch+" is vowel");
		    }else {
		    	System.out.println(ch+" is consonent");
		    }
		}
	}

}
