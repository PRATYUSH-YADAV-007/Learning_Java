package errorsInJava;

public class throw_ {
	public static void main(String[] args) {
//		int i=0;
//		int j=0;
//		try {
//			j = 18/i;
//		}catch(ArithmeticException e) {
//			j = 18/1; // I can do like this so that rather than error I am handling the exception.
//		}
//		catch(Exception e) {
//			System.out.println("something went wrong " + e);
//		}
//		System.out.println(j);
		
		
		int i=20;
		int j=0;
		try {
			j = 18/i;
			if(j==0) throw new ArithmeticException("IAmLearnignJavaFromTelusko"); //we can customize the error also using throw. Here, 
			//the error of divide by zero, I want to handle it using my way (like I returned 18/1) rather than showing error.
		}catch(ArithmeticException e) {
			j = 18/1; 
			System.out.println("thats the default output " + e);
		}
		catch(Exception e) {
			System.out.println("something went wrong " + e);
		}
		System.out.println(j);
	}

}
