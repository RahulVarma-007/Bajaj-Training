package javatraining4;

public class LambdaFunctionalInterface {

	public static void main(String[] args) {
		
		Functionalnterface f=(a,b) -> {
			int sum=a+b;
			System.out.println(sum);
			return sum;
		};
		
		f.addition(3, 7);

	}

}
