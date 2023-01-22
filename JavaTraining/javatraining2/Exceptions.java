package javatraining2;

public class Exceptions {
	
	public static void division(int a,int b) {
		int div=a/b;
		System.out.println("Division:"+ div);
	}
	
	public static void main(String args[]) {
		try{
			division(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
