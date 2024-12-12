package practice;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int row=9,space=row/2,star=1;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<star;k++){
				System.out.print("*");
			}
			if(i<row/2){
				space--;
				star+=2;
		    }else{
				space++;
				star-=2;
			}
		   System.out.println();
		}
	}

}
