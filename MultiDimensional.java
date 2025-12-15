package learning;
//import java.util.Scanner; 
public class MultiDimensional 
{
	public static void main(String[] args) 
	{
//	  int nums[][] = new int[3][4];
//      for(int i=0;i<3;i++)
//      {
//        for(int j=0;j<4;j++)
//        {
//          nums[i][j] = (int) (Math.random() * 100) + 1; //Math is a class which has this random method which o/p numbers b/w 0 and 1
//        } 
//      }
//      
//      //normal way of using for loop
//      for(int i=0;i<3;i++)
//      {
//        for(int j=0;j<4;j++)
//        {
//          System.out.print(nums[i][j] + " ");
//        }
//        System.out.println(); 
//        //initial value is assigned as zero by default. 
//      }
//      System.out.println();
//      //enhanced for loop
//      for( int n[] : nums) 
//      {
//    	  for(int ii : n)
//    	  {
//    		  System.out.print( ii + " ");
//    	  }
//    	  System.out.println();
//      }
      
      //Java program to demonstrate how to create Two Dimensional Array with User input.
//      Scanner sc = new Scanner(System.in);
//      
//      System.out.println("Enter the number of rows");
//      int row = sc.nextInt();
//      
//      System.out.println("Enter the number of columns");
//      int cols = sc.nextInt();
//      
//      int num[][] = new int[row][cols];
//      System.out.println("Enter elements of array ");
//      
//      for(int i=0;i<row;i++)
//      {
//    	  for(int j=0;j<cols;j++) 
//    	  {
//    		  num[i][j] = sc.nextInt();
//    	  }
//      }
//      
//      for( int nn[] : num) 
//      {
//    	  for(int iii : nn)
//    	  {
//    		  System.out.print( iii + " ");
//    	  }
//    	  System.out.println();
//      }
//      sc.close();
		
		int nums[][] = new int[3][]; //jagged array 
		
		nums[0] = new int[3];  // means that 0th element of nums array is an array of integers and has size 3.
		nums[1] = new int[4];  // means that 1st element of nums array is an array of integers and has size 4.
		nums[2] = new int[2];  // means that 2nd element of nums array is an array of integers and has size 2.
		
		for(int i=0;i<nums.length;i++)
	      {
	        for(int j=0;j<nums[i].length;j++)
	        {
	        	nums[i][j] = (int) (Math.random() * 100) + 1; 
	        }
	      }
		
		for( int n[] : nums) 
	      {
	    	  for(int ii : n) //automatically take the size of the inner array
	    	  {
	    		  System.out.print( ii + " ");
	    	  }
	    	  System.out.println();
	      }
		
	}  
}
