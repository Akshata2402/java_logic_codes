package Array;

import java.util.HashMap;

public class OccurenceOfElement {

    public static void main(String[] args) {

    	int arr[]= {1,5,1,2,5,6,1,8,2,1};
    	
    	HashMap<Integer,Integer> count=new HashMap<>();
    	
    	for(int element:arr) {
    		count.put(element,count.getOrDefault(element, 0)+1);
    	}
    	
    	for(HashMap.Entry<Integer,Integer> entry:count.entrySet()) {
    		System.out.println("Element "+entry.getKey()+" value "+entry.getValue());
    	}
    }

}
