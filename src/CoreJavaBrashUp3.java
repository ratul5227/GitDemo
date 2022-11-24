
public class CoreJavaBrashUp3 {

	public static void main(String[] args) {
		// String is an Object
		
		//Creating String Object
						
		//1 way of creating string object like this 
						
		String s = "Ratul Ghosh Learing"; //this is called string literal
		
		//Another way of creating string is 
		String s1 = new String("Ratul Ghosh Learing Selenium");
		
		//As string is a object so we can do many thins using string like
		
		String value = "This is selenium learning";
		
		String [] SpitedValue = value.split(" "); //We are spiting string with white space so after split its will have
						 // multiple string so it will became a array of string. thats why we
						// declare this veriable as string array.
		System.out.println(SpitedValue[0]);
		System.out.println(SpitedValue[1]);
		System.out.println(SpitedValue[2]);
		System.out.println(SpitedValue[3]);
		System.out.println(value);
		
		String [] SpitedVlue2 = value.split("selenium"); //now spiting with character
		System.out.println(SpitedVlue2[0]);
		System.out.println(SpitedVlue2[1]);
		System.out.println(SpitedVlue2[1].trim()); // this will trim the space
		
		//How to print all character of a string
		
		for (int i=0; i<value.length(); i++)
		{
			System.out.println(value.charAt(i));  //CharAt is a method of string which will return string character index
		}
		
		//Print the string character in reverse order
		
		System.out.println("Those are all string character in reverse order");
		
		for(int i=value.length()-1; i>=0; i--)
		{
			System.out.println(value.charAt(i));
		}


	}

}
