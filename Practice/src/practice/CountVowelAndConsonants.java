package practice;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		
		String str="Chak De! India";
		
		int vowels=0,consonent=0;
		
		String small=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch=small.charAt(i);
			if(ch!=' '&&(ch>='a'&&ch<='z')) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowels++;
				}else {
					consonent++;
				}
			}
		}
		
		System.out.println("Number of Vowels is:"+vowels);
        System.out.println("Number of Consonent is:"+consonent);		

	}

}
