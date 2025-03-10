// Geometric mean of a list of positive values. for 3 values, geometric mean is 3rd root of products of all
// 5 numbers mean is 5th root of products of all 5 numbers.

import java.util.Scanner;
import javax.swing.JOptionPane; 

public class geometricMean{
	
	
	public static void main(String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" We will find geometric mean of the positive numbers you provide");
	
	int count = 0;
	double product = 1.0;
	
	int choice = JOptionPane.showConfirmDialog(null, " More Numbers ? ", " Numbers", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
	
	while(choice == JOptionPane.YES_OPTION){
		
		System.out.println(" Provide a positive number " );
		double number = keyboard.nextDouble();
		product = product * number;
		count++;
		
		choice = JOptionPane.showConfirmDialog(null, " More Numbers ? ", " Numbers", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		
	}
	
	System.out.println(" Product = " +product);
	System.out.println(" count = " +count);
	
	double count2 = 1 / count;
	System.out.printf(" 1 / count = %6f6", count2);
	double mean = Math.pow(product, 1 / count);              //////  IMP to get root af anything, do math.pow of 1/root number.
	
	// 1 / count is always coming like 0.0000076**** . So numer power 0 is always coming to be 1.
	
	System.out.println(" Gemoetric mean = " +mean);
	}
}


