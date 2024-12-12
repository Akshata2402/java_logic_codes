package string;

public class ReverseStringWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               System.out.println(reverseString("JAva"));
	}
	
	public static String reverseString(String str) {
		if(str.isEmpty())
			return str;
		
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
