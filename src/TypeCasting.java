public class TypeCasting {

	public static void main(String[] args) {
 
 	   byte a = 125 ;
	   short b =10;
	   
	   int c;
	   long d;
	   float e;
	   double f;
	   
	   System.out.println("The byte variable is: "+ a);
	   System.out.println("The short variable is: "+ b);
	  
	   System.out.println("\nExplicit Widening Typecasting\n ");
	    
	   //Explicit Type Casting
	   c= (int)a + (int)b; // Type casting to integer
	   d = (long)b + (long)c; // Type casting to long
	   e = (float)c +(float)d; // Type casting to float
	   f = (double)d + (double)e; // Type casting to double
	    
	   //Printing the output
	   System.out.println("byte: " + a);
	   System.out.println("short: " + b);
	   System.out.println("int: " + c);
	   System.out.println("long: " + d);
	   System.out.println("float: " + e);
	   System.out.println("double: " + e);
	    
	   System.out.println("\n\nImplicit Widening Typecasting\n ");

	   //Implicit Type Casting
	   c= a + b; // Type casting to integer
	   d = b + c; // Type casting to long
	   e = c +d; // Type casting to float
	   f = d + e; // Type casting to double
	    
	   //Printing the output
	   System.out.println("byte: " + a);
	   System.out.println("short: " + b);
	   System.out.println("int: " + c);
	   System.out.println("long: " + d);
	   System.out.println("float: " + e);
	   System.out.println("double: " + e);
	}

}
