package javatraining2;

public class TestCustomerAccount {   //Relation between classes (Aggregation, Composition)

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		c1.setcId(101);
		c1.setName("Rahul");
		
		Account a=c1.getAccount();
		a.setEnumber(112233);
		a.setBalance(100000);
		
		c1.setAccount(a);
		
		System.out.println(c1.getcId()+" "+c1.getName()+" "+c1.getAccount().getBalance());
		

	}

}
