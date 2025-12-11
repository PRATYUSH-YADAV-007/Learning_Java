package learning_continues_2;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
//		Collection<Integer> nums = new ArrayList<Integer>(); //collection interface works with objects not the primitive types.
//		nums.add(12);
//		nums.add(23);
//		nums.add(20000000);
//		System.out.println(nums);//like arrays we don't need to use for each loop to print.
//		
//		for(int element : nums) {
//			System.out.println(element);		
//		}
		
		
		//if u want to work with index values and other cool stuff ,we scan use List interface as it supports the index values.
		//ArrayList is a class which implements the List interface. 
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(12);
		nums.add(23);
		nums.add(20000000);
		//System.out.println(nums.get(2));
		nums.add(1, 4);
		System.out.println(nums.indexOf(23));
		System.out.println(nums);
	
	}
}
