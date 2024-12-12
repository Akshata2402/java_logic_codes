package practice;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello , Good Monoing";
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)!=' ') && (str.charAt(i)!='\t')) {
				//sb.append(str[i]);
			}
		}
		System.out.println(sb);

	}

}
