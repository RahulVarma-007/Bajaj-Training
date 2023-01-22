package javatraining3;
import java.util.Scanner;


class InvalidAgeException extends Exception{
	
	InvalidAgeException(String s){
		super(s);
	}
}

public class Sum45 {

	public static void evaluateAge(int age) throws InvalidAgeException{
		if(age<19) {
			throw new InvalidAgeException("Not allowed");
		}else {
			System.out.println("Welcome");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			evaluateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e+", Come back after "+(18-age)+" years");
		}

	}

}
