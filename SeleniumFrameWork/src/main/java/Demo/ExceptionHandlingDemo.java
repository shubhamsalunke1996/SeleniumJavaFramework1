package Demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws Exception {
	demo();	
	expection();	

	}
	public static void demo() {
		try {
			System.out.println("Hello world......! ");
			
			int i=1/0;
			
			
			System.out.println("Completed");
		} catch (Exception e) {
		System.out.println("Run successfully......!");
		System.out.println( "Message is :" +e.getMessage());
		System.out.println( "Cause is :" +e.getMessage());
		e.printStackTrace();
		}
	finally {
		System.out.println("I am inside finally block");
	}
	}
	
	public static void expection() throws Exception {
		System.out.println("Hello world......! ");
		throw new ArithmeticException("not valid operation");
		//int g=1/0;
		
		
		//System.out.println("Completed");
	}

}
