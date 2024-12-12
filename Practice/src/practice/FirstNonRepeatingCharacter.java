package practice;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="kartik";
		boolean flag=true;
		
		for(char i:str.toCharArray()) {
			if(str.indexOf(i)==str.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+i);
				flag=false;
				break;
			}
			if(flag)
				System.out.println("There is no repeating character in string");
		}

	}

}
