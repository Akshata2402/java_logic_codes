package practice;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=5,num2=8;
		
		int large=num1>num2?num1:num2;
		
		while(true) {
			if(large%num1==0 && large%num2==0) {
				break;
				
			}
			large++;
		}
		
		System.out.println(large);

	}

}
