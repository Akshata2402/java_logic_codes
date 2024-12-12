package practice;

public class AbundantNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12,sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum>num) {
			System.out.println(num+" is an Abundant number");
			System.out.println("The Abundant Number is "+(sum-num));
		}else {
			System.out.println(num+" is not an abundant number");
		}

	}

}
