/*
You have a constant annual interest 7.49%  -> means monthly interest is 7.49/12=0.6242. or n =12 in below formula
Read 1 morgtgage paid each month and outstanding amount
Find 2 mortgage breakup = interest + principle you are paying each month
*/

//  Mortgage = [{r((1+r)^n)} / {((1+r)^n)-1}]

import java.util.Scanner;

public class Mortgage{
	public static final double r = 7.49/12;
	
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println (" Monthly Mortgage ?");
			double morg = keyboard.nextDouble();
			System.out.println (" Outstanding Amount ?");
			double debt = keyboard.nextDouble();
			
			double sInt = intRate * morg;
			double prin = morg - sInt;
			
			System.out.println(  " principle paid + Interest = " +prin+ " + " +sInt);
			
			}
	
}
