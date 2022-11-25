import java.util.ArrayList;

public class CoreJavaBrashUp2 {

	public static void main(String[] args) {
	
		int [] arr2 = {1,2,3,4,5,6,8,9,10,11,14};
		//Print values of this array which can be multiply by 2
		
		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println("Those are multiply by 2: " + arr2[i]);
			}
			else
			{
				System.out.println("Those are not multiply by 2: " + arr2[i]);
			}

			
		}
		//Creating ArrayList 
		
				ArrayList <String> NewArray = new ArrayList<String>();
				NewArray.add("ratul");
				NewArray.add("New test");
				NewArray.add("Learing");
				
				NewArray.remove(1); // To remove the any element from Array list
				String ArrayValue = NewArray.get(1);
				System.out.println(ArrayValue);
				
		//Creating ArrayList that have multiple datatype
				ArrayList <Object> NewArr2 = new ArrayList<Object>();
				NewArr2.add("test");
				NewArr2.add(1);
				NewArr2.add(5.23);
				Object data = NewArr2.get(1); 
				System.out.println(data);
		
				System.out.println("This is print for git 4");
				System.out.println("This is print for git 5");
				
				System.out.println("This is the code for development branch");
			

	}

}
