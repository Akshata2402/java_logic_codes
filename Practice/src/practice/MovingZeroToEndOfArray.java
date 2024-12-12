package practice;

public class MovingZeroToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,0,5,1,9,0,3,6};
		int j=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
