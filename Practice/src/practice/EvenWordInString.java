package practice;

public class EvenWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am Akshata Nalawade";
		
		for(String word:str.split(" ")) {
			if(word.length() % 2 == 0) {
				System.out.println(word);
			}
		}

	}

}
