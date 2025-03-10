/*
Calculate monhtly balance if you are allowed
	1 deposit/month
	1 withdrawal per month
	Also bank adds Interest amount in month starting. Interest = balance * (interest rate / 12);
	
*/

import java.util.Scanner;

public class bankBalance {
	
	public static void main (String[] args){
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "August", "November", "December"};
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("");
		System.out.println("What is your starting Bank Balance on 1st January");
		double originalBalance = keyboard.nextDouble();
		double balance = originalBalance;
		System.out.println(" What is your bank annual interest rate");
		double anuualInterestRate = keyboard.nextDouble();
		double monthlyInterestRate = anuualInterestRate / 12;
		
		
		for (String month : months){
			
			System.out.println(" How much did you withdraw in " +month+ ". Type 0 if you did not withdraw anything ");
			double withdrawn = keyboard.nextDouble();
			System.out.println(" How much did you deposit in " +month+ ". Type 0 if you did not deposit anything ");
			double deposit = keyboard.nextDouble();
			
			balance = balance - withdrawn + deposit + ( balance * monthlyInterestRate / 100 );
			System.out.println(" Balance in " +month+ " = " +balance);
		}
		
		
	}

}
