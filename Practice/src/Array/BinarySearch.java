package Array;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {40,80,90,60,10,30,50};
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		int key=50;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[mid]==key) {
				System.out.println("Key found");
				break;
			}else if(key>arr[mid]) {
				start=arr[mid]+1;
			}else if(key<arr[mid]){
				end=arr[mid]-1;
				
			}
			mid=(start+end)/2;
		}

	}

}
