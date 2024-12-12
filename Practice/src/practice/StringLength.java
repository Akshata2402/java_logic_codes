package practice;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length=0;
		String str="Hello";
		for(char c:str.toCharArray()) {
			length++;
		}
		
		System.out.println("Length of string is "+length);

	}

}
