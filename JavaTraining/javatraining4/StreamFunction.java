package javatraining4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javatraining1.Employee;

public class StreamFunction {
	
	public static void main(String args[]) {
		
		EmpStream();
		
	}
	
	public static void Streamtry() {
		List<Integer> num=Arrays.asList(1,2,3,4);
		List<Integer> square=num.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(square);
	}
	
	public static void EmpStream() {
		Employee emp1=new Employee(101,90,"rahul");
		Employee emp2=new Employee(102,10,"sameer");
		Employee emp3=new Employee(103,50,"uttej");
		
		
		List<Employee> empl=Arrays.asList(emp1,emp2,emp3);
	
		List<Double> salList = empl.stream()
				.filter(emp->emp.getSalary()>20)
				.map(emp->emp.getSalary())
				.collect(Collectors.toList());
		
		System.out.println(salList);

	}

}


