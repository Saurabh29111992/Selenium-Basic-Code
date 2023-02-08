package aadd;

public class ArithmeticOperator {

	
		
	    //Addition Operator Method
	    void add(int a, int b)  //Declaring parameters 
		{
			System.out.println("Additon is : "+(a+b));
			
		}
          
	    //Subtraction Operator Method
	    void sub(int a, int b)  //Declaring parameters 
		{
			System.out.println("Subtraction is : "+(a-b));
			
		}
		
	    //Multiplication Operator Method
	    void mul(int a, int b)  //Declaring parameters 
		{
			System.out.println("Multiplication is : "+(a*b));
			
		}
		
	    //Division Operator Method
	    void div(int a, int b)  //Declaring parameters 
		{
			System.out.println("Division is : "+(a/b));
			
		}
		
	    
	    public static void main(String[] args) 
	    {
			
	    	ArithmeticOperator a = new ArithmeticOperator();
	    	
	    	a.add(5, 5);
	    	a.sub(20, 10);
	    	a.mul(5, 2);
	    	a.div(20, 2);
		}

}
