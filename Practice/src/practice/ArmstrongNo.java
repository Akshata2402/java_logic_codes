package practice;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153,result=0,rem=0,count=0;
		
		int temp=num;
		
		while(num!=0) {
			num/=10;
			count++;
		}
		
		num=temp;
		
		while(num!=0) {
			rem=num%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power*=rem;
			}
			result+=power;
			num/=10;
		}
		if(result==temp) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
		
		
    }

	}


