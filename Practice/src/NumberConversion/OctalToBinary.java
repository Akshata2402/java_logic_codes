package NumberConversion;

public class OctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int octal=12;
		int decimal=0;
		int n=0;
		while(octal>0) {
			int temp=octal%10;
			decimal+=temp*Math.pow(8,n);
			octal=octal/10;
			n++;
		}
		int binary[]=new int[20];
		int i=0;
		while(decimal>0) {
			int r=decimal%2;
			binary[i++]=r;
			decimal=decimal/2;
		}
		System.out.print("Binary Number:");
		for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]+" ");
		}
	}

}
