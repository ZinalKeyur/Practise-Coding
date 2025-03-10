// Option 1 

/*
import java.util.Scanner;

public class EachDigit{
	
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println (" Provide a 4 digit number . Eg.: 1998 ");
			
			int originalNumber = keyboard.nextInt();
			int number = originalNumber;
			int n1 = number/1000;
			number = originalNumber%1000;
			int n2 = number/100;
			number = originalNumber%100;
			int n3 = number/10;
			number = originalNumber%10;
			int n4 = number;
			
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);	
			}
}
*/

//Option 2 

 import java.util.Scanner;

public class EachDigit{
	
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println (" Provide a 4 digit number . Eg.: 1998 ");
			
			String number = keyboard.nextLine();
			
			System.out.println(number.charAt(0));
			System.out.println(number.charAt(1));
			System.out.println(number.charAt(2));
			System.out.println(number.charAt(3));	
			}
}
