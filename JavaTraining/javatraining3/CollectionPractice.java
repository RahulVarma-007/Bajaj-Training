package javatraining3;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import javatraining1.Employee;

public class CollectionPractice {
	
	public static void main(String args[]){
		
		//List
		List l=new ArrayList();	//non-generic
		
		l.add("Rahul");
		l.add(1);
		l.add('A');
		
		Iterator itr=l.iterator();
				
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator litr=l.listIterator();
		
		while(litr.hasNext()) {
			
			System.out.println(litr.next());
			
		}
		
        while(litr.hasPrevious()) {
			
        	System.out.println(litr.previous());
			
		}
        
        
        //Set
        Set<Employee> s=new HashSet<Employee>();
        Employee e1=new Employee(1,19000,"rahul");
        Employee e2=new Employee(2,11000,"ravi");
        Employee e3=new Employee(3,10500,"rachit");
        Employee e4=new Employee(3,10500,"rachit");
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		
		System.out.println(s);
		
		
	}

	

}
