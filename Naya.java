//this file just tells about anonymous objects (see telusko video on utube on this topic)

package learning;

class A{
	public A() {
		System.out.println("object created");
	}
	public void show() {
		System.out.println("in A show");
	}
}

public class Naya {
	public static void main(String[] args) {
//		A obj = new A();
//		obj.show();
		
		//if i just write :-
		new A(); // it just creates the object in heap memory , this is called anonymous object. (check by running this only alone and u will see object created)
	}
}
