
public class MultiDimensionalArray {

	public static void main(String[] args) {
		int arr1[][] = {{5,2,3},{4,1,6}};
		
		System.out.println("Printing all value form this array");
		for (int i=0;i<2; i++)
		{
			for (int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			
			System.out.println("\n");
		}
		
		//Print minimum number from this array
		
		System.out.println("Printing minimum value form this array");
		
		int min = arr1[0][0];
		int minRow = 0;
		int minColumn = 0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(arr1[i][j]<min) {
					min = arr1[i][j];
					minRow = i;
					minColumn = j;
				}
			}
		}
		System.out.println("The minimum value is "+min);
		
		System.out.println("Printing minimum value of a column where minimum value is there");
		
		int maxNum = arr1[0][minColumn];
	
		for (int j=minColumn;j<2;j++) {
			if(arr1[j][minColumn]> maxNum) {
				maxNum = arr1[j][minColumn];
			}
			
		}
		
		System.out.println("The Maximum value is "+maxNum);
		
		System.out.println("Total column "+arr1.length);
		System.out.println("Total Row "+arr1[0].length);
		
	
	}
}
