package NumberConversion;

public class DecimalToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int decimal=1457;
		convert(decimal);
		
		

	}
	
	static void convert(int num) {
		char[]hexa=new char[100];
		int i=0;
		while(num!=0) {
			int rem=0;
			rem=num%6;
			if(rem<10) {
				hexa[i]=(char)(rem+48);
				i++;
			}else {
				hexa[i]=(char)(rem+55);
			}
			num=num/16;
		}
		System.out.println("Hexadecimal:");
		for(int j=1;j>=0;j--) {
			System.out.print(hexa[j]);
		}
	}

}
