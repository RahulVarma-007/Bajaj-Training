package javatraining4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javatraining1.Employee;

public class Maps {

	public static void main(String[] args) {

		//myHashMap1();
		myTreeMap1();
		//myHashMapEmp();
	}
	
	public static void myHashMap1() {
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "Pune");
		m.put(2, "Mumbai");
		m.put(3, "Chennai");
		
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		System.out.println(s);
		//
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey());
		}
		
		//
		for(Map.Entry map : m.entrySet()) 
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
	
	public static void myHashMapEmp() {
		Employee emp1=new Employee(101,90,"rahul");
		Employee emp2=new Employee(102,10,"sameer");
		Employee emp3=new Employee(103,50,"uttej");
		
		Map<Employee, String> map=new HashMap<>();
		map.put(emp1, "delhi");
		map.put(emp2, "pune");
		map.put(emp3, "hyd");
		
		System.out.println(map);
		
	}
	
	public static void myTreeMap1() {
		Map<Integer, String> map=new TreeMap<>();
		map.put(1, "Pune");
		map.put(3, "Mumbai");
		map.put(2, "Chennai");
		
		Set<Integer> set=map.keySet();
		
		for(Integer i:set) {
			System.out.println(i+" "+map.get(i));
		}
	}

}
