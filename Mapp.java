package learning_continues_2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapp {
	public static void main(String[] args) {
//		Map<String, Integer> students = new HashMap<>();
//		
//		students.put("Pra", 23 );
//		students.put("ty", 34);
//		students.put("us", 45 );
//		students.put("h", 56 );
//		students.put("h",98);
		//System.out.println(students);
		
		//how to access a value using its key
		//System.out.println(students.get("Pra"));
		
		//how to access only values of a map
//		System.out.println(students.values());
//		for(int value: students.values()) {
//			if(value>40)
//			System.out.println(value);
//		}
		
		//how to access only keys of a map
//		System.out.println(students.keySet());
//		for(String key: students.keySet()) {
//			System.out.println(key+ ":" + students.get(key));
//		}
		
//		boolean bool = students.isEmpty();
//		System.out.println(bool); 
//		
//		students.replace("h", 99);
//		System.out.println(students.get("h"));
//		System.out.println(students);
		
		
		
		//HashTable
		Map<String, Integer> students = new Hashtable<>();
				
		students.put("Pra", 23 );
		students.put("ty", 34);
		students.put("us", 45 );
		students.put("h", 56 );
		students.put("h",98);
		System.out.println(students);
	}
}
 