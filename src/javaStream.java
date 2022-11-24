 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class javaStream {

	public static void main(String[] args) {
		//Count the name starts with A from a list
		
		ArrayList <String> name = new ArrayList<String>();
		name.add("Ratul");
		name.add("Akash");
		name.add("Adi");
		name.add("Rajesh");
		name.add("Bidahi");
		name.add("Ajoy");
		int count = 0;
		
		for(int i=0; i<name.size(); i++)
		{
			String data = name.get(i);
			if (data.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		
		//Now Doing same thing using Streams
		
		ArrayList <String> name2 = new ArrayList<String>();
		name2.add("Ratul");
		name2.add("Akash");
		name2.add("Adi");
		name2.add("Rajesh");
		name2.add("Bidahi");
		name2.add("Ajoy");
		
		long count2 = name2.stream().filter(s->s.startsWith("A")).count(); //Here s->s.startsWith("A") this is a lambda expression
		System.out.println(count2);
		
		/*
		 * //Same thing can be done without creating list
		 * 
		 * long count3 =
		 * Stream.of("Ratul","Akash","Adi","Rajesh","Bidahi","Ajoy").filter(p-> {
		 * p.startsWith("A"); return }).count(); System.out.println(count3);
		 */
		
		//Print name from the Arraylist which length is grater than 3
		
		name2.stream().filter(a->a.length()>4).forEach(a-> System.out.println(a));	
		//now to print only first name with this condition
		name2.stream().filter(a->a.length()>4).limit(1).forEach(a->System.out.println("The first name is: "+a));
		
		//Print the name in uppercase from a list of name which have last letter h
		//map function is used to do any changes in stream data
		Stream.of("Ratul","Akash","Adi","Rajesh","Bidahi","Ajoy").filter(a->a.endsWith("h")).map(a->a.toUpperCase())
		.forEach(a-> System.out.println(a));
		
		//sort an array data using stream
		
		String[] data = {"Ram","Avi","sam","Rahul","Somnath","Asok"};
		List<String> listData = Arrays.asList(data); //Converting array to arrayList
		listData.stream().sorted().forEach(i-> System.out.println(i));
		
		//Margeing 2 list using stream and then sort and print
		Stream <String> data2 = Stream.concat(name.stream(), listData.stream());
		data2.sorted().forEach(i->System.out.println("Result after Marge: "+i));
		
		//Now find if Ratul is present on stream list or not
		Stream <String> newList = Stream.of("Ratul","Ram","Avi");
		boolean flag =  newList.anyMatch(i->i.equalsIgnoreCase("Ratul"));  //this anyMatch method return boolean 
		
		System.out.println(flag);
		
		//perform any stream operation and convert stream to list
		List <String> newList2 = name2.stream().map(i->i.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println(newList2.get(0));
		
		//Print unique number from a array
		//sort the array
		//then only print 4th index
		
		List<Integer> value = Arrays.asList(5,6,5,8,7,2,2,3,5,4,6);
		value.stream().distinct().forEach(i->System.out.println(i));
		List <Integer> listData2 = value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("The 4th Index is: "+listData2.get(3));
	
			}
	

}
