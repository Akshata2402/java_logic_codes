package practice;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {54,89,12,64,76,33};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int start=0,end=arr.length-1;
		int mid=(start+end)/2;
		boolean flag=false;
		int key=20;
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[mid]) {
				flag=true;
				break;
			}else if(key>arr[mid]) {
				start=arr[mid]+1;
			}else if(key<arr[mid]) {
				end=arr[mid]-1;
			}
			mid=(start+end)/2;
		}
		
		if(flag==true) {
			System.out.println("Key found");
		}else {
			System.out.println("Key not found");
		}

	}

}
