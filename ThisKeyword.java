package learning;
/*
Not using the this keyword in Java, while often optional, can lead to problems in specific scenarios:
Ambiguity with Local Variables/Parameters: The most common problem arises when an instance variable has the same name as a local variable 
or a method parameter. Without this., Java will prioritize the local variable or parameter, leading to unintended behavior where the 
instance variable is not modified or accessed as intended.

 public void setName(String name) {
            // Without 'this.', 'name' refers to the parameter, not the instance variable.
            // The instance variable 'name' remains unchanged.
            name = name; 
        }
  
 Correct usage:
public void setCorrectName(String name) {
    this.name = name; // 'this.name' refers to the instance variable
    
    
    
*********************Passing the Current Instance as an Argument: If a method requires the current object as an argument, this must 
be explicitly passed.
}
*/
public class ThisKeyword {
	public static void main(String[] args) {
		
	}
}
