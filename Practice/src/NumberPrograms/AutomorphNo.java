package NumberPrograms;

public class AutomorphNo {
      public static void main(String[] args) {
		int n=25;
		
		int sq=n*n;
		if(String.valueOf(sq).endsWith(String.valueOf(n))) {
			System.out.println("Automorph Number");
		}else {
			System.out.println("Not Automorph Number");
		}
	}
}
