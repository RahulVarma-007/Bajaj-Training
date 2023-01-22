package javatraining3;
import java.util.*;

import javatraining1.Employee;

public class CheckComparator {

	public static void main(String args[])
	{
		ArrayList<Employee> e=new ArrayList<>();
		
		e.add(new Employee(1,10000,"rahul"));
		e.add(new Employee(2,90000,"sameer"));
		e.add(new Employee(3,80000,"harateja"));
		e.add(new Employee(4,70000,"uttej"));
		e.add(new Employee(5,20000,"yasaswi"));
		

		Collections.sort(e,new CustomComparator());
		
		for(Employee emp:e) {
			System.out.println(emp);
		}
	}
}
