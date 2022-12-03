import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		//get the current date using java class
		
		Date d = new Date();
		
		System.out.println(d.toString());
		
		//get customize date using java class
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/YYYY");  // here we need to add our disare date format as argument
		System.out.println(sdf.format(d));
		
	}

}
