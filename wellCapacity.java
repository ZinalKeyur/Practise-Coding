/*

NOT CORRECT SOMETHING IS WRONG



Situation
private well is producing 1 or 2 gallons of water per min = (1*60*24) or (2*60*24) gallons of water in a day.
Family of 4 needs  atleast 250 gallons per day.

input
Take well radius and height in input and calculate the water stored in it and if it is enough for a family ?
well = cylinder volume = pi r^2 h.
r = radius in inches
h = height/depth in feet

1 cubic foot = 7.48 gallon
1 foot = 12 inch

output
well capacity in gallons.
*/

import java.util.Scanner;
public class wellCapacity{
	
	public static final double pi = 3.14;
	public static void main (String[] args){
	
	double volume,capacity,radius;
	int depth;
	
	Scanner keyboard = new Scanner (System.in);
	System.out.println (" -----------------------------" );
	System.out.println (" Provide well radius in inches " );
	radius = keyboard.nextDouble();
	radius = radius / 12;								// radius in feet
	System.out.println (" Provide well depth in feets " );
	depth = keyboard.nextInt();
	
	volume = pi * radius * radius * depth;
	
	capacity = volume * 7.48;
	
	System.out.println (" -----------------------------" );
	System.out.println(" capacity per day = " +capacity);
	
	
	
	//Well produce 1 gallon per min -> 1*60*24 gallons per day
	
	int prod = 60 * 24;
	System.out.println(" produced per day = " + prod);
	System.out.println(" used per day = " + 250);
	
	if (prod > 250){
	
	System.out.println(" Remaining per day = " + (prod-250));
	}
	else{
	System.out.println(" Extra required per day = " + (250-prod));
	}
	System.out.println (" -----------------------------" );
	}
}