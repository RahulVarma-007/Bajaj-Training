package javatraining2;
import java.util.Scanner;

class checker extends Exception{
	
	checker(String s){
		super(s);
	}
}

public class UserDefinedException {
	
	public static void evaluateAge(int age) throws checker{
		if(age<18) {
			throw new checker("Not allowed");
		}else {
			System.out.println("Welcome");
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			evaluateAge(age);
		} catch (checker e) {
			System.out.println(e+", Come back after "+(18-age)+" years");
		}
		
		
		try(Scanner scr=new Scanner(System.in)){
			
		}catch(Exception e) {
			
		}
	}

}
