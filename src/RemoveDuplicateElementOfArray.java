
public class RemoveDuplicateElementOfArray {

		public static void main(String[] args) {
			
			int [] arr = {1,2,3,1,2,2,4,3,2};
			
			int j =0,count;
			for(int i=0;i<arr.length;i++) {
				count = 0;
				for (j=i+1;j<arr.length;j++) {
					if (arr[i] == arr[j]) {
						count++;
						break;
					}
					
				}
				if(count==0) {
					System.out.println(arr[i]);
				}
			}
			
			
		

		}
		
}
