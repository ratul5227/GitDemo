
public class SortArrayUsingLoop {

	public static void main(String[] args) {
		int [] arr = {1,3,2,4,8,5};
		
		int temp =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("This is sorted array"+arr[i]);
		}
		
	}

}
