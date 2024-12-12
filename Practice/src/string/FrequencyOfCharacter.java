package string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Akshata";
		char[] ch=str.toCharArray();
		Map<Character,Integer> freq=new HashMap<Character,Integer>();
		
		for(char cl:ch) {
			if(freq.containsKey(cl)) {
				freq.put(cl,freq.get(cl)+1);
			}else {
				freq.put(cl, 1);
			}
		}
		System.out.println(freq);
	}

}
