package practice;

public class RemoveBlankSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="  hello  all  ";
		
		String str1=str.replaceAll("\\s","");
		
		System.out.println(str1);

	}

}
