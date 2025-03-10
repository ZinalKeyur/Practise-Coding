// Obtain average of double numbers

import java.util.Scanner;

public class averageLoops{
	
	public static void main (String[] args){
		
		int countNumbers = 0, maxNumbers = 5;   // You can take max 5 values from keyboard and provide their Average.
		double sum = 0.0;
		boolean moreNumbers = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (moreNumbers){
			for (int i = 0; i < maxNumbers; i++){
				
				countNumbers++;
				System.out.println(" Provide a double number");
				double number = keyboard.nextDouble();
				sum = sum + number;
				System.out.println(" Want to add more numbers ?. type yes or no");
				String more = keyboard.next();
				if (more.equalsIgnoreCase("no")){
					moreNumbers = false;
					break;   /// it was not going out if i did not write break. coz it is in for loop and not going out to check while condition
				}
				
			}
		
		}
		
		double average = sum / countNumbers;
		
		System.out.println(" Average = " +average);
	}
}