package learning_continues_2;

enum Status_1{
	Running, Failed, Pending, Succees;//all these are objects
}

public class Enum {
	public static void main(String[] args) {
		Status_1[] s = Status_1.values();
		
		for(Status_1 ss : s){
			System.out.println(ss+" : "+ss.ordinal()) ;
		}
	
	}
}
