package practice;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {53,66,11,53,88};
		
		int result[]=removeDuplicate(arr,arr.length);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		

	}
	
	public static int[] removeDuplicate(int arr[],int n) {
		
		int temp[]=new int[n];
		int j=0;
		
		for(int i=0;i<n;i++) {
			boolean isduplicate=false;
			for(int k=0;k<j;k++) {
				if(arr[i]==temp[k]) {
					isduplicate=true;
					break;
				}
			}
			if(!isduplicate) {
				temp[j++]=arr[i];
			}
		}
		
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        
        return result;
	
	}

}
