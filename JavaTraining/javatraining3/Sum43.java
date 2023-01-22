package javatraining3;

public class Sum43 {
	
	public static void main(String args []) {
		try{    
            int arrayt[]=new int[9];    
            arrayt[10]=12;
              
           }    
           catch(ArithmeticException e)  
              { 
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              } 
		   finally{  
		        System.out.println("finally block is always executed");  
		      } 
		
		try {
        	String s=null;  
            System.out.println(s.length());
        }catch(NullPointerException e) { 
            System.out.println("Null pointer Exception occurs");  
        }   
		
	}

}
