package javatraining2;

public class Square extends Shape{
	int side;
	
	Square(int side){
		super("Square");
		this.side=side;
	}
	
	public double calculateArea() {
		return side*side;
	}

}
