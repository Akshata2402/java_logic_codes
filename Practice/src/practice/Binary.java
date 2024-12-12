package practice;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
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
