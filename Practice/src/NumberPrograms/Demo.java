package NumberPrograms;

public class Demo {
	public static void main(String[] args) {
//		String hex="cg";
//		String digits="0123456789ABCDEF";
//		hex=hex.toUpperCase();
//		int val=0;
//		for(int i=0;i<hex.length();i++) {
//			char ch=hex.charAt(i);
//			int d=digits.indexOf(ch);
//			val=16*val+d;
//		}
//		System.out.println(val);
		
		int d=191;
		int hexa[]=new int[100];
		
		int i=0;
		while(d>0) {
			int r=d%16;
			if(r<10) {
				hexa[i]=(char)(r+48);
				i++;
			}else {
				hexa[i]=(char)(r+55);
				i++;
			}
			d/=16;
		}
		for(int j=i-1;j>=0;j--) {
			char ch=(char)hexa[j];
			System.out.print(ch);
		}
	}

}
