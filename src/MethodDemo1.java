
public class MethodDemo1 {

	public static void main(String[] args) {
		MethodDemo1 data = new MethodDemo1();
		data.getdata();
		int results = data.addition(5, 6);
		System.out.println(results);
		String test = data.getreturndata();
		System.out.println(test);
		MethodDemo2 testData = new MethodDemo2(); //creating object of another class
		testData.getuserdata(); //access methods of another class 
		getdata2(); // access static method of own class
		testData.getuserdata2(); // access static method of another class
		
		

	}
	//Creating a Methods
	//Here public is a access modifier so it can be access by another class
	//void is return type it can be int, string... so void is for no return type
	//if we use void this means this method will not return anything
	
	public void getdata()   
	{
		System.out.println("Hello World");
	}
	
	public String getreturndata()
	{
		return "This is Ratul";
	}
	//Static methods can be access by own class without creating object
	//By adding static keyword we are giving this method to class level access
	public static void getdata2()   
	{
		System.out.println("This is a static method");
	}
	public int addition(int firstnum, int secondnum)
	{
		int result = firstnum + secondnum;
		return result;
		
	}

}
