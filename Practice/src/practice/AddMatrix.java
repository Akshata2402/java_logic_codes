package practice;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {10,20,
				      30,40};
		
		int arr2[]= {1,2,
				     3,4};
		
		int arr3[]= {0,0,
				     0,0};
		
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		

	}

}
