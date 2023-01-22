package javatraining3;
import java.util.Comparator;

import javatraining1.Employee;

public class CustomComparator implements Comparator<Employee> {
	
	public int compare(Employee a,Employee b) {
		
		if(a.getSalary()>b.getSalary())
			return 1;
		else if(a.getSalary()<b.getSalary())
			return -1;
		else
			return 0;
	}
	

}


