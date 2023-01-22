package javatraining1;



public class Encapsulation {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setEmpid(1);
		emp1.setEname("rahul");
		emp1.setSalary(10000);
		System.out.println(emp1.getEmpid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getSalary());
		
		Employee emp2=new Employee();
		emp2.setEmpid(2);
		emp2.setEname("ravi");
		emp2.setSalary(5000);
		System.out.println(emp2.getEmpid());
		System.out.println(emp2.getEname());
		System.out.println(emp2.getSalary());
		
		
	}

}
