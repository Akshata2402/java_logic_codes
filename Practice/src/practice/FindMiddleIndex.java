package practice;

public class FindMiddleIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50,60};
		
		if(arr.length==0) {
			System.out.println("Array is empty");
		}else {
			int middleIndex=arr.length/2;
			if(arr.length%2==0) {
				System.out.println(arr[middleIndex-1]+" & "+arr[middleIndex]);
			}else {
				System.out.println(arr[middleIndex]);
			}
		}

	}

}
