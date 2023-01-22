package javatraining2;

public class Circle extends Shape{
	
	int radius;
	
	Circle(int radius){
		super("Circle");
		this.radius=radius;
	}
	
	public double calculateArea() {
		return 3.14*radius*radius;
	}

}
