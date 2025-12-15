package learning;

class Mobile
{
	String brand;
	int price;
	static String name;
	
	public Mobile() { // if we want to initialize with something at the Mobile obj1 = new Mobile() then we can use the constructor.
		brand = "";
		price = 200;
		System.out.println("in constructor block"); //testing to see how many times a constructor is called
		//name = "phone"; //I don't want to initialize this every time as this can be initialized once so i use the help of static block.
	}
	
	static { // static block is called once, irrespective of how many objects u create.
		name = "phone"; 
		System.out.println("in static block");//testing to see how many times a static block is called
		//also u can keep the static block before or after the constructor , then also u will get the same result.
		
		////As a fact : Static block is always executed before the constructor.
		
	}
	
	public void show() {
		System.out.println(brand +" "+ price +" "+ name );
	}
	
	public static void show1(Mobile object) { //object specifies which object we are talking about
		System.out.println(object.brand +" "+ object.price +" "+ name);
	}
	
}

public class StaticKeyword {
	public static void main(String[] args) throws ClassNotFoundException{
		
		Class.forName("learning.Mobile"); //it is a method which loads the class i want explicitly.
		
//		Mobile obj1 = new Mobile(); 
//		obj1.brand = "Apple";
//		obj1.price = 12000;
//		
//		Mobile obj2 = new Mobile();
//		obj2.brand = "Samsung";
//		obj2.price = 10000;
		
//		Mobile.name = "SmartPhone";
		
//		obj1.show();
//		obj2.show();
//		
//		Mobile.show1(obj2);
		
//		Mobile obj3 = new Mobile();
		
	}
}
