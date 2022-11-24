
public class palindromeCheck {

	public static void main(String[] args) {
		int num = 565;
		int temp = num;
		int rev = 0;
		
		while (num>0)
		{
			int reminder = num%10;
			rev = rev*10 + reminder ; 
			num = num/10;
		}
		if (rev == temp)
		{
			System.out.println(temp +"is palindrome");
		}
		else 
		{
			System.out.println(temp +"is not palindrome");
		}
		
		//check palindrome of string
		
		String str = "level";
		
		int i=0;
		int j = str.length()-1;
		int t=0;
		
		while(i<j) {
			if (str.charAt(i)!= str.charAt(j)) {
				System.out.println(str +" is not palindrome");
				t=1;
				break;
			}
			
			i++;
			j--;
		}
		if (t<1) {
			System.out.println(str +" is palindrome");
		}
		

	}

}
