package errorsInJava;

class Abc{
	public void show() throws ClassNotFoundException{
		//1. you can do the handling like :-
//		try {
//			Class.forName("Mysql");
//		}catch(ClassNotFoundException e) {
//			System.out.println("not able to find the class\s" +e );
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		//2. using throws after show() line above.
		Class.forName("Mysql");
		
	}
}

public class Throwss {
	
	static {
		System.out.println("Class Loaded");
	}
	
	public static void main(String[] args) {
		Abc obj = new Abc();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();//prints stack like which method is calling which method. It makes easy to find where the problem lies.
			/*Somthing like below :- (it starts from last statement and goes to top)
			Class Loaded
			java.lang.ClassNotFoundException: Mysql
			at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
			at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
			at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
			at java.base/java.lang.Class.forName0(Native Method)
			at java.base/java.lang.Class.forName(Class.java:421)
			at java.base/java.lang.Class.forName(Class.java:412)
			at countries_197/errorsInJava.Abc.show(Throwss.java:16)
			at countries_197/errorsInJava.Throwss.main(Throwss.java:30) 
			 */
		}

	}

}
