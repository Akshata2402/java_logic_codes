package practice;

import java.util.HashSet;

public class LargestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc abcdef abcd abcdefg ab";
		 
		HashSet<Character> unique=new HashSet<>();
		int maxLength=0,left=0;
		for(int i=0;i<str.length();i++) {
            while(unique.contains(str.charAt(i))){
            	unique.remove(str.charAt(left));
            	left++;
            }
            unique.add(str.charAt(i));
            maxLength=Math.max(maxLength, i-left+1);
		}
		
		System.out.println(maxLength);

	}

}
