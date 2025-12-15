package learning;

class Humans
{
	private int age;
	private String name; 
	
	public Humans() {
		name = "john" ;
		age = 30;
	}
	
	public Humans(String name) {
		super();//leave this for now.
		this.name = name;
	}
	
	public Humans(int a, String n) { //parameterized constructor
		age = a;
		name = n;
	}
	
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

public class Constructors {
	public static void main(String[] args) {
		
		Humans obj = new Humans();
		Humans obj1 = new Humans(22,"avi");
		System.out.println(obj.getName()+ " : " + obj.getAge() ); 
		
		System.out.println(obj1.getName()+ " : " + obj1.getAge() ); 
	}
}



//****************************************************************************8
//Just basic simple constrctor:-
//class Humans
//{
//	private int age;
//	private String name; 
//	
//	public Humans() {
//		name = "john" ;
//		age = 30;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {  
//		this.age = age;               
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//}
//
//public class Constructors {
//	public static void main(String[] args) {
//		
//		Humans obj = new Humans();
//		
//		System.out.println(obj.getName()+ " : " + obj.getAge() ); 
//		
//		
//	}
//}
