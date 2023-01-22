package javatraining3;
import java.util.Scanner;
import java.io.*;

 
public class Sum42 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
	
		try {
			FileReader fileReader = new FileReader("Test.txt");  
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

		Scanner sc=new Scanner(System.in);
		
		try {
			int n=sc.nextInt();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	

}
