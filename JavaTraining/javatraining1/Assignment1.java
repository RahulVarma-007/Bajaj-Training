package javatraining1;

import java.util.*;
import java.math.*;

class Emp{
	int empid,salary;
	String name,company;
	static int cntr;
	Emp(int empid, String name, int salary, String company){
		this.empid=empid;
		this.salary=salary;
		this.name=name;
		this.company=company;
		cntr++;
		
	}
	
	public void get() {
		System.out.println("Empid: "+empid+", Salary:"+salary+" name:"+name+" company:"+company);
	}
	
	public String toString() {
		return empid+" "+salary+" "+name+" "+company;
	}
		
}

public class Assignment1 {
	
	public static int Max(int a, int b, int c) {
		
		int max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		
		if(max<c) {
			max=c;
		}
		
		return max;
	}
	
	public static void swap(int a,int b) {
		int t=a;
		a=b;
		b=t;
		System.out.println("a:"+a+", "+"b:"+b);
	}
	
	public static void swapwithout(int a,int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+", "+"b:"+b);
	}
	
    public static void checknum(int a) {
		
		if(a>0) {
			System.out.println(a+ " is positive");
		}else if(a<0) {
			System.out.println(a+ " is negative");
		}else {
			System.out.println(a+ " is zero");
		}
	}
    
    public static void Isprime(int a) {
    	int cnt=0;
    	for(int i=1;i<=a/2;i++)
    	{
    		if(a%i==0) {
    			cnt++;
    		}
    	}
    	
    	if(cnt==1) {
    		System.out.println(a+" is prime");
    	}else {
    		System.out.println(a+" is not prime");
    	}
    }
    
    public static void Ispalindrome(int a) {
    	String s=a+"";
    	int l=s.length();
    	
    	for(int i=0,j=l-1;i<l;)
    	{
    		if(s.charAt(i)==s.charAt(j)) {
    			i++;
    			j--;
    			if(i==l)
    			{
    				System.out.println(a+ " is palindrome");
    				break;
    			}
    		}else {
    			System.out.println(a+ " is not a palindrome");
    			break;
    		}
    		
    	}   		
 
    }
    
    public static int cube(int a) {
    	return a*a*a;
    }

	public static void main(String args[]){
		
		System.out.println("Maximum of 3 numbers:"+Max(45,67,10));
		swap(2,3);
		swapwithout(5,9);
		checknum(56);
		Isprime(111);
		Ispalindrome(11223);
		
		ArrayList<Emp> e=new ArrayList<>();
		e.add(new Emp(1,"rahul",10000,"bajaj"));
		e.add(new Emp(2,"sameer",90000,"Google"));
		e.add(new Emp(3,"harateja",80000,"Microsoft"));
		e.add(new Emp(4,"uttej",70000,"American Express"));
		e.add(new Emp(5,"yasaswi",20000,"EY"));
		
		//salary >50k
		for(int i=0;i<e.size();i++)
		{
			if(e.get(i).salary>50000) {
				e.get(i).get();
			}
		}
		
		//Number of objects
		System.out.println("Number of objects: "+e.get(1).cntr);
		
		
		System.out.println("Cube: "+cube(3));
		
		//toString()
		System.out.println(e.get(0));
		
		
	}

}
