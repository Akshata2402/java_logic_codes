package practice;
import java.util.*;

public class CovertArrayIntoZigZag {
	

	    static int arr[]= {4,3,7,8,6,2,1};
	    static void zigZag() {
	    	Arrays.sort(arr);
	    	for(int i=1;i<=arr.length-2;i+=2) {
	    		int temp=arr[i];
	    		arr[i]=arr[i+1];
	    		arr[i+1]=temp;
	    	}
	    }
	    
	    public static void main(String[] args) {
			zigZag();
			System.out.println(Arrays.toString(arr));
		}
	}


