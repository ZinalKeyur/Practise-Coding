/* 
Convert from fereinheit to celcius
Formula -> C = 5(F - 32)/9;
*/


import java.util.Scanner;

public class FereinheitToCelcius{
	
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println (" Enter a temperature in degree Fereinheit (must be a whole number) ");
			
			int fereinheit = keyboard.nextInt();
			double celcius = 5 * (fereinheit - 32) / 9.0;  //-> 9 is giving only 0 in decimal which is not correct calculation so using 9.0
			
			System.out.printf( fereinheit+ "F = %1.1fC", celcius);
			}
}
