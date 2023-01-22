package javatraining3;
import java.util.*;

import java.lang.ArithmeticException;
public class Sum41 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			int res=a/b;
			System.out.println("Division: "+ res);
		}catch(ArithmeticException  e) {
			System.out.println(e+" - Wrong input");
		}finally {
			System.out.println("Inside the finally");
		}

	}

}
