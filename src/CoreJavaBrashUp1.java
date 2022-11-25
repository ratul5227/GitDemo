import java.util.ArrayList;

public class CoreJavaBrashUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data Types
		int num = 5;
		String Name = "ratul";
		char latter = 'R';
		double dec = 5.5;
		boolean mycart = true;  //Here we are not use string as this is a boolean value not collection
								//of character
		System.out.println(num + " is the value of the num veriable");
		System.out.println(Name);
		
		//Arrays
		int[] arr = new int[5]; // here integer operator is use to store memory for this array
								//This is how we declare a array in java
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//Another way of create and assigning value to an array
		
		int [] arr2 = {1,2,3,4,5};
		
		int test = arr2[2]; //this is how we can assess the array element
		
		System.out.println("This is the array value " + test);
		
		//print all array element using loop
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
			
			
		}
				
		// String Array
		String[] name = {"ratul","ghosh","selenium"};
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		//Enhance for loop structure 
		for(String S: name)
		{
			System.out.println(S);
		}
		
		//Array can't store multiple data type so we have to use type of our array as object.
		//So this is how we can store multiple data type data into an array. 
		Object [] array = new Object[5];
		
		array[0] = "test";
		array[1] = 2;
		System.out.println(array[0]);
		
		
		
		System.out.println("This is print for git 1");
		System.out.println("This is print for git 2");
				

	}

}
