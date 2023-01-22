package javatraining2;

public class Rectangle extends Shape{
	
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		super("Rectangle");
		this.length=length;
		this.breadth=breadth;
	}
	
	public double calculateArea() {
		return length*breadth;
	}

}
