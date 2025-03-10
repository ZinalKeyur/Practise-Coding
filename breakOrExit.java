// Obtain average of double numbers

import java.util.Scanner;

public class breakOrExit{
	
	public static void main (String[] args){
		
		for (int n = 1; n <= 3; n++){
			
			switch(n)
			{
				case 1:
				System.out.println("One");
				break;
				
				case 2:
				System.out.println("Two");
				break;
				
				case 3:
				System.out.println("Three");
				break;
				
				case 4:
				System.out.println("Four");
				break;
				
				default:
				System.out.println("Default Case");
				break;
				
			}
		}
		System.out.println("See where it breaks.");
		
		
		for (int n = 1; n <= 5; n++){
			
			if (n == 3)
			break;
			System.out.println("Hello " +n);
			
		}
		System.out.println("See where it breaks.");
		
		for (int n = 1; n <= 5; n++){
			
			if (n == 3)
			System.exit(0);                          // Works same as break
			System.out.println("Hello " +n);
			
		}
		System.out.println("See where it exits.");
	}
}