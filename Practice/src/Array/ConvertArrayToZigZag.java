package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConvertArrayToZigZag {

	static int arr[]= {50,60,40,80,90,10,20,30,70};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           zigZag();
           System.out.print(Arrays.toString(arr));
	}

	public static void zigZag() {
		Arrays.sort(arr);
		for(int i=1;i<=arr.length-2;i+=2){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
}
