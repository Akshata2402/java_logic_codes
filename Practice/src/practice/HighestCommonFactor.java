package practice;

public class HighestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=36,num2=60,hcf=0;
		
		for(int i=1;i<=num1 || i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				hcf=i;
			}
		}
		
		System.out.println("Highest Common Factor of "+num1+" & "+num2+" is "+hcf);

	}

}
