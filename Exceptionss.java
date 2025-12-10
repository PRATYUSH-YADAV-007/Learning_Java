package errorsInJava;

public class Exceptionss {
	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		try // put only critical statements in try block
		{
			j = 18/i;
		}
		catch(Exception e) 
		{
			System.out.println("Something went wrong!!\s" + e);
		}
		System.out.println(j);
	}
}
