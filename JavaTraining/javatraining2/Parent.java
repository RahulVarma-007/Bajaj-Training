package javatraining2;

public class Parent {
	
	int p=10;
	
	
	Parent(){
		System.out.println("Non para construction");
	}
	
	Parent(int a,int b){
		System.out.println("Para construction: "+(a-b));
	}
	
	public void display() {
		System.out.println("In Parent Class");
	}

}
