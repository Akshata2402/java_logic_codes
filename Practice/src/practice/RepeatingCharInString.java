package practice;

public class RepeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="akshata";
        char chararray[] = str.toCharArray();
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
           for (int j = i + 1; j < str.length(); j++) {
              if (chararray[i] == chararray[j]) {
                 System.out.print(chararray[j] + " ");
                 //break;
              }
           }
        }

		

	}

}
