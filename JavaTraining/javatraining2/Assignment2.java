package javatraining2;
import java.util.*;

public class Assignment2 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Select an option: ");
		System.out.println("1.Square ");
		System.out.println("2.Rectangle ");
		System.out.println("3.Circle ");
		
		System.out.println(" ");
		System.out.print("Enter your choice: ");
		System.out.println(" ");
		
		int get=sc.nextInt();
		
		
		
		int l,b;
		
		System.out.println(" ");
		Shape s;
		
		switch(get) {
		
		    case 1:
		    	
		    	System.out.println("Enter side");
		    	l=sc.nextInt();
		    	s=new Square(l);
		    	System.out.println(" ");
		    	System.out.println("Area of Square is: "+s.calculateArea());
		    	break;
		    	
		    case 2:
		    	
		    	System.out.println("Enter l and b");
		    	l=sc.nextInt();
		    	b=sc.nextInt();
		    	s=new Rectangle(l,b);
		    	System.out.println(" ");
		    	System.out.println("Area of Rectangle is: "+s.calculateArea());
		    	break;
		    	
		    case 3:
		    	
		    	System.out.println("Enter radius");
		    	l=sc.nextInt();
		    	s=new Circle(l);
		    	System.out.println(" ");
		    	System.out.println("Area of Circle is: "+s.calculateArea());
		    	break;
		    	
		}
		sc.close();
		
	}

}