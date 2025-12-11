package learning_continues_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	//default constructor
	public Student(int age, String name) {
		this.age = age;
		this.name= name;
	}
	//getters and setters
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}	
}

public class Comparator_ComparableContinue {
	public static void main(String[] args) {
		
//		Comparator<Student> com = new Comparator<Student>() {// We write data type of of object in <>, here the object is of Student type.
//			public int compare(Student thiss, Student thatt ) {
//				if(thiss.age > thatt.age) return 1;
//				else return -1;
//			}
//		};
		/////using lambda expressions
		Comparator<Student> com = (Student thiss, Student thatt ) -> {
			return thiss.age > thatt.age? 1 : -1 ;
		};
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(20,"Pratyush")); // we are adding the object of Student class so we need the object not the string passed here.
		stud.add(new Student(26,"abhay"));
		stud.add(new Student(19,"wasim"));
		stud.add(new Student(33,"Chad"));
		
		Collections.sort(stud,com);//Integer class by default implements the comparable class but my Student class does not so i.e. if I 
		//write just Collections.sort(stud)  , it will give an error.
		System.out.println(stud);
	}
}
