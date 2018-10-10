package DemoLog4j;

public class ExceptionHandingDemo2 {

	public static void main(String[] args) {
		try {
			exception_demo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void exception_demo() throws Exception {
		
		System.out.println("Hello World");
		//throw new ArithmeticException("Invalid Operation");
		int a =1/0;
		System.out.println("Completed");
	}

}
