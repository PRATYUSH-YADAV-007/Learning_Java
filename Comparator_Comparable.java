package learning_continues_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.Scanner;

//sorting is discussed
public class Comparator_Comparable {
	public static void main(String[] args) {
		//I used user input to generate my list.
//		Scanner obj = new Scanner(System.in);
//		List<Integer> num_list = new ArrayList<>();
//		System.out.println("enter the number of elements you want:");
//		int i = obj.nextInt();
//		while(i>0) {
//			System.out.println("enter one value u want");
//			num_list.add(obj.nextInt());
//			System.out.println("number added successfully.");
//			i--;
//		}
//		System.out.println(num_list);
//		obj.close();
		
		
		
		
		//Comparator
//		Comparator<Integer> com = new Comparator<Integer>() { //In Camparator, it is necessary to include data type on RHS also.
//			@Override
//			public int compare(Integer i, Integer j) {
//				if(i%10 > j%10) {
//					return 1;
//				}else {
//					return -1;
//				}
//			}
//		};
//		List<Integer> num_list = new ArrayList<>();
//		num_list.add(4);
//		num_list.add(5);
//		num_list.add(423);
//		num_list.add(2);
//		
//		Collections.sort(num_list);//Collections is a class and Collection is an interface.
//		Collections.sort(num_list,com);
//		
//		System.out.println(num_list);
		
		
		
		
		//sorting the string array with their lengths
		Comparator<String> comObj = new Comparator<String>() {
			 @Override
			 public int compare(String current, String next) {
				 if(current.length() > next.length()) {
					 return 1;
				 }else {
					 return -1;
				 }
			 }
		};
		List<String> len = new ArrayList<>();
//		
//		//static way of adding objects.
		len.add("zoya");
		len.add("akshay");
		len.add("laura");
		len.add("avi");
//		System.out.println("enter the number of words you want:");
//		int i = obj.nextInt();
//		while(i>0) {
//			System.out.println("enter one value u want");
//			len.add(obj.next());
//			System.out.println("word added successfully.");
//			i--;
//		}
		Collections.sort(len,comObj);
		System.out.print(len);
		
		
		
		
		
	}
}
