package learning;

class Student{
	int rollno;
	String name;
	int marks;
}

public class ObjectsArray {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollno = 1;    // if u print the s1 (which is an object) then it will print its address not value it holds.
		s1.name = "Avirel";
		s1.marks = 30;
		
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "vansh";
		s2.marks = 60;
		
		Student s3 = new Student();
		s3.rollno = 3;
		s3.name = "rajni";
		s3.marks = 98;
		
		Student students[] = new Student[3]; // creates an array of objects not creating 3 object itself
		
//		for(int i=0;i<3;i++) {
//			System.out.println(students[i]);
//		}
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name + " : " + students[i].marks  );
		}
		
	}
}
