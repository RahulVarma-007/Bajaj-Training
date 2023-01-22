package javatraining2;

 public class TestParentChild extends next implements page,page2{ //Inheritance
	
	public static void main(String args[]) {
		
		Parent p;
		
		p=new Parent();
		show(p);
		
		p=new Child();
		show(p);
		
		/*Child c1=new Child();
		c1.showParent();
		c1.showChild();
		c1.add();*/
		
		TestParentChild t=new TestParentChild();
		t.slice();
		
		t.apple();
		t.mango();
	
	}
	
	public static void show(Parent p) {
		p.display();
	}
	
	public void slice(){
		System.out.println("Abstraction");
	}
	
	public void apple() {
		System.out.println("Interface");
	}
	
	public void mango() {
		System.out.println("Interface2");
	}
		
}

 //interface
interface page{
	int x=9;
	void apple();
}

interface page2{
	
	void mango();
}

//abstract class
abstract class next{
	
	abstract public void slice();
	
}