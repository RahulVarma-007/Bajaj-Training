package javatraining2;

public class Child extends Parent{

	int c;
	
	public Child() {
		
	}
	
	public Child(int c) {
		
		super(4,2);
		this.c=c;
	}
	public void display() {
		System.out.println("In Child Class");
	}
	
	public void add() {
		System.out.println(p+c);
	}
}
