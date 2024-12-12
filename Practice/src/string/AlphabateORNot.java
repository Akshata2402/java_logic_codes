package string;

public class AlphabateORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Akshata11";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
				System.out.println(ch+" is alphabate");
			}else {
				System.out.println(ch+" is not alphabate");
			}
		}

	}

}
