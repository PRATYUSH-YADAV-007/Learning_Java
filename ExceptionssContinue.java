package errorsInJava;

public class ExceptionssContinue {
	public static void main(String[] args) {
		
//		int i=0;
//		int j=0;
//		try // put only critical statements in try block
//		{
//			j = 18/i;
//		}
//		catch(Exception e) 
//		{
//			System.out.println("Something went wrong!! " + e);
//		}
//		System.out.println(j);
		
		
		
//		int[] arr = new int[5];
//		try
//		{
//			System.out.println(arr[5]);
//		}
//		catch(Exception e) 
//		{
//			System.out.println("Something went wrong!! " + e);
//		}
		
		
		
		int i=2;
		int j=0;
		int[] arr = new int[5];
		String name = null;
		try // put only critical statements in try block
		{
			j = 18/i;
			System.out.println(arr[5]);
			System.out.println(name.length());
		}
		catch(ArithmeticException e) //customised for user
		{
			System.out.println("you cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) //customised for user
		{
			System.out.println("arrays have index from 0 to length of array - 1.");
		}
		catch(Exception e)  //for all those exceptions for which I dont know, the Exception class will handle all those.
		{
			System.out.println("Something went wrong!! " + e);
		}
		System.out.println(j);
		
	}
}
