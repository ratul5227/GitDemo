
public class ContractorDemo {
	
	public ContractorDemo() {
		System.out.println("This is a contractor without parameter");
	} 
	public ContractorDemo(int a, int b) {
		System.out.println("This is a contractor with parameter " + a +" And "+ b);
	}
	public static void main(String args[]) {
		ContractorDemo CD = new ContractorDemo();
		ContractorDemo CD1 = new ContractorDemo(5,8);
		
	}

}
