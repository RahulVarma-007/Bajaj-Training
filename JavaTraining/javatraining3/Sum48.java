package javatraining3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class CartEmptyException extends Exception
{
	public CartEmptyException(String message){
		super(message);
	}
}




public class Sum48 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number  = sc.nextInt();
		
		try{
			if(number==0) throw new CartEmptyException("Your cart is Empty");
		}catch(CartEmptyException e){
			System.out.println(e.getMessage());
		}
		
		List<Item> list = new ArrayList<Item>();
		Item[] records = new Item[number];
		
		for(int i=0;i<number;i++)
		{
			records[i] = new Item(sc.nextInt(),sc.next(),sc.nextInt());
			list.add(records[i]);
		}
		
		for(Item x:list)
		{
			System.out.println(x.itemId+" "+x.name+" "+x.price);
		}
	}

}

