package practice;

public class AutomorphNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=25;
		int square=num*num;
		
		if(String.valueOf(square).endsWith(String.valueOf(num))) {
			System.out.println("Automorphic no");
		}else {
			System.out.println("Not automorphic");
		}

	}

}
