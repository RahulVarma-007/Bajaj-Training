package javatraining1;

public class JavaBasics_day1 {

	public static void main(String[] args) {
		
		JavaBasics_day1 obj=new JavaBasics_day1();
		obj.display();
		System.out.println(obj.count(5, 4));

	}
	
	public void display() {
		System.out.println("display method");
	}
	
	public int count(int i,int j) {
		return i+j;
	}

}
