package practice;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int person[]= {56,80,20,37,55,10};
		
		for(int i=0;i<person.length;i++) {
			for(int j=0;j<person.length-i-1;j++) {
				if(person[j]>person[j+1]) {
					int temp=person[j];
					person[j]=person[j+1];
					person[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<person.length;i++) {
			System.out.println(person[i]);
		}

	}

}
