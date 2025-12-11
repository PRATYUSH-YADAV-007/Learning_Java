package learning_continues_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class HashSett {
	public static void main(String[] args) {
//		Set<Integer> set_array = new HashSet<Integer>();//Set does not support index value accessing.
//		set_array.add(12);
//		set_array.add(24);
//		set_array.add(1202);
//		set_array.add(24);
//		set_array.add(123);
//		System.out.println(set_array);
		
		Set<Integer> set_array = new TreeSet<>();//u write or not the data type on RHS, doesn't affect much. But on LHS, it should be written.
		set_array.add(12);
		set_array.add(24);
		set_array.add(1202);
		set_array.add(24);
		set_array.add(123);
		System.out.println(set_array);
		
		Iterator<Integer> values = set_array.iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		
	}
}
