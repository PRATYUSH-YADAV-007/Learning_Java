package learning;

//import java.util.Scanner;

public class Strings {
	public static void main(String[] args){
		//String name = "Pratyush"; // string object created this way also 
		String nam = new String("Pratyush"); //string object can also be created this way
		System.out.println("hello " + nam);
		
//In Java, the equals() and hashCode() methods are fundamental for object comparison and the operation of hash-based collections like HashMap, HashSet, and Hashtable.
//The equals() method determines whether two objects are logically equal. By default, it compares object references, meaning it returns true only if both objects point 
//to the same memory location. However, for meaningful comparisons, this method is typically overridden to compare the actual data or state of the objects, such as their
//fields. The equals() method must adhere to a contract that includes being 
		//reflexive (an object equals itself), 
		  //symmetric (if a.equals(b) is true, then b.equals(a) must //also be true),
		  //transitive (if a.equals(b) and b.equals(c) are true, then a.equals(c) must be true),
		  //consistent (multiple calls return the same result unless the objects are modified), 
		  //and not equal to null.
		
//The hashCode() method returns an integer hash code that represents the object's state. This hash code is used by hash-based collections to determine the "bucket" 
//where an object should be stored and retrieved efficiently. The contract for hashCode() requires that the same object must return the same hash code
//during a single execution of a program, provided the object's state used in equals() comparisons hasn't changed.

//Crucially, if two objects are equal according to the equals() method, they must have the same hash code. However, objects with the same hash code are not necessarily 
//equal, and unequal objects can have the same or different hash codes. The relationship between equals() and hashCode() is governed by a contract:
//if a.equals(b) is true, then a.hashCode() must equal b.hashCode().
//Violating this contract can lead to unpredictable behavior in hash-based collections, such as an object being added multiple times to a Set or becoming inaccessible in
//a Map. Therefore, whenever the equals() method is overridden, the hashCode() method must also be overritten to ensure both methods are consistent with each other.
		
		//System.out.println(nam.hashCode()); 
		
		//methods of String class
		//System.out.println(nam.charAt(1));
		
		
		
	}
}
