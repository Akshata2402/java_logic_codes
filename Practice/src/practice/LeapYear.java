package practice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println(isLeapYear(2004));

	}
	
//	public static boolean isLeapYear(int year) {
//		if(year%400==0) {
//			return true;
//		}else if(year%4==0 && year%100!=0) {
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
	public static boolean isLeapYear(int year) {
        if(year%4==0 && year%100!=0 || year%400==0) {
		  return true;
		}
		return false;
		
	}
	

}
