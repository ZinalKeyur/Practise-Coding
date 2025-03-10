
import java.util.Scanner;

public class scannerDelimiter{
	
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("y");
		System.out.println("Enter a string");
		String a = keyboard.next();
		String b = keyboard.next();      // delimited by y
		String c = keyboard.nextLine();  // not delimited by y, this displays entire line
		System.out.println("a is : " +a);
		System.out.println("b is : " +b);
		System.out.println("c is : " +c);
	}
}


/*
D:\java>java scannerDelimiter
Enter a string
By theprickingof my thumbs
a is : B
b is :  theprickingof m
c is : y thumbs
*/