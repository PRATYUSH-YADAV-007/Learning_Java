package errorsInJava;

class PratyushException extends RuntimeException{
	public PratyushException(String str){
		super(str);//this is how we call a super class's constructor.
	}
}

public class CustomException {
	public static void main(String[] args) {
		int i=20;
		int j=0;
		try {
			j = 18/i;
			if(j==0) throw new PratyushException("I am Loving java"); 
		}catch(PratyushException e) {
			j = 18/1; 
			System.out.println("thats the default output " + e);
		}
		catch(ArithmeticException e) {
			j = 18/1; 
			System.out.println("thats the default output " + e);
		}
		catch(Exception e) {
			System.out.println("something went wrong " + e);
		}
		System.out.println(j);
	}
}
