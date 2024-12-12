package practice;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6,sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		
		if(num==sum) {
			System.out.println(num+" is Perfect Number");
		}

	}

}
