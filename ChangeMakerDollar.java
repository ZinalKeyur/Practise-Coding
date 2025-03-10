/* 

Vending machine accepts a single dollar bill
Has items from 25-100 cents in multiplication of 5. Like 25,30,35,....95,100.
*/


//Option 1 

import javax.swing.JOptionPane;

public class ChangeMakerDollar{
	
	public static void main (String[] args){
		
		int quarters, dime, nickel, penny;
		
		String originalAmount = JOptionPane.showInputDialog(" Enter a value between 25 - 100 cents, in multiple of 5's \n "
														 + " Eg.: \n"
														 + " 25,30,35,....85,90,95 ");
		
		int amount = Integer.parseInt(originalAmount);
		
		if ( amount > 24 && amount < 101 && amount%5 == 0){
			
		quarters = amount/25;
		amount = amount%25;
		dime = amount/10;
		amount = amount%10;
		nickel = amount/5;
		amount = amount%5;
		penny = amount;

		JOptionPane.showMessageDialog(null," To pay " +originalAmount+ " you can put in below combination of coins \n" 
										+quarters + " quarters \n" 
										+dime + " dime \n" 
										+nickel + " nickel \n" 
										+penny + " penny ");
		}

		else{
		JOptionPane.showMessageDialog(null,"Input provided is not in correct range or correct format");

		}
		
	System.exit(0);
		
	}
}

// Option 2 

/*
import java.util.Scanner;

public class ChangeMakerDollar{

public static void main (String[] args){

int originalAmount, amount,dollar,half,quarters,dime,nickel,penny;

System.out.println(" Enter a price of an item ");
System.out.println(" (from 25 cents to a dollar, in 5-cent increments)");
Scanner keyboard = new Scanner(System.in);
amount = keyboard.nextInt();

if ( amount > 24 && amount < 101 && amount%5 == 0){

originalAmount = amount;
//dollar = amount/100;
//amount = amount%100;
//half = amount/50;
//amount = amount%50;
quarters = amount/25;
amount = amount%25;
dime = amount/10;
amount = amount%10;
nickel = amount/5;
amount = amount%5;
penny = amount;

System.out.println(" To pay " +originalAmount+ " you can put in below combination of coins");
//System.out.println( dollar+ " dollar coins ");
//System.out.println( half+ " half coins ");
System.out.println( quarters+ " quarters coins ");
System.out.println( dime+ " dime coins ");
System.out.println( nickel+ " nickel coins ");
System.out.println( penny+ " penny coins ");
}

else{
System.out.println("Input provided is not in correct range or correct format");}

}
}

*/
/*
D:\java>java ChangeMakerDollar
 Enter a price of an item
 (from 25 cents to a dollar, in 5-cent increments)
23
Input provided is not in correct range or correct format

D:\java>java ChangeMakerDollar
 Enter a price of an item
 (from 25 cents to a dollar, in 5-cent increments)
27
Input provided is not in correct range or correct format

D:\java>java ChangeMakerDollar
 Enter a price of an item
 (from 25 cents to a dollar, in 5-cent increments)
65
 To pay 65 you can put in below combination of coins
0 dollar coins
1 half coins
0 quarters coins
1 dime coins
1 nickel coins
0 penny coins

D:\java>
*/