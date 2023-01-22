package javatraining3;

import java.io.FileInputStream;
import java.io.IOException;

public class Sum46 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("Test1.txt"))
		{
			byte[] b = new byte[fis.available()];
			fis.read(b);
			String s = new String(b);
			System.out.println(s);
		}
		catch(IOException e)
		{
			System.out.println("Caught IO Exception");
		}
	}
}
