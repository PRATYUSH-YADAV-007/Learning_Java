//To get the most out of this file, see notion's page of telusko_java in which a section of encapsulation is there. Happy learning

package learning;
//Learnings from this code file:
//From now on , evrrytime u make an instance variable make it private. 
//we shd be able to access this data indirectly , the way to access these data (private one) is by using methods/behaviours (like someone is asking for my name and then i am 
//responding using a method like speaking, writing, or actions) of the class. 


class Human{
	private int age ;   //private keyword means this age is accessible in the same class only.
	private String name; 
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {  
		this.age = age;               
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		
		Human obj = new Human();
//		obj.age = 20;
//		obj.name = "Pratyush";
		
//		System.out.println(obj.name); // anyone can access my data (here name is my data)
		obj.setAge(20);
		obj.setName("Pratyush");
		System.out.println(obj.getAge() + " : " + obj.getName()); 
		
	}
}



//without this keyword
//class Human{
//private int age ;   //private keyword means this age is accessible in the same class only.
//private String name; 
//
//public int getAge() {
//	return age;
//}
//public void setAge(int a) { //a is local var and age is instance var but if we write age = age , then it is a problem as it can be an instance as well as local var both
//	age = a;                //In case of confusion, local var is given higher preference. So we use the concept of "this" to tell it is instance var
//}
//
//public String getName() {
//	return name;
//}
//public void setName(String n) {
//	name = n;
//}
//}
