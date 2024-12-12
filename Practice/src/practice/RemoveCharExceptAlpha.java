package practice;

public class RemoveCharExceptAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="$p*r;e..pi,ns'ta?";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)<'A'&& str.charAt(i)>'Z' || str.charAt(i)>'a' && str.charAt(i)>'z' ) {
				str=str.substring(0,i)+str.substring(i+1);
				i--;
			}
		}
		System.out.println(str);

	}

}
