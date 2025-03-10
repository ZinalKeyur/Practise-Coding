/*

Calories required for maintainging weight. given age height and weight
Man   BMR = 66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)
Woman BMR = 655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)

1 chocolate = 230 calories. How many chocolates needed to maintain weight ?
*/

// OPTION 1 
/*
import java.util.Scanner;
public class BMR{
	
	public static void main (String[] args){
	
	double weight, age, height, womanBmr, manBmr;
	
	Scanner keyboard = new Scanner (System.in);
	System.out.println (" -----------------------------" );
	System.out.println (" Weight in pounds ? " );
	weight = keyboard.nextDouble();
	System.out.println (" Age in Years ? " );
	age = keyboard.nextDouble();
	System.out.println (" Height in inches ? " );
	height = keyboard.nextDouble();
	
	womanBmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
	manBmr = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
	
	System.out.println(" Woman need atleast " + (int)(womanBmr/230)+ " chocolates.");
	System.out.println(" Man need atleast " + (int)(manBmr/230)+ " chocolates.");
	
	
	//System.out.print(" Woman of height = " +height+ ", weight = " +weight+ ", age " +age+ " \n"
	//			   + " will have BMR = " +womanBmr+ " \n"
	//			   + " and need chocolates = " + (womanBmr / 230)+ " \n"
	//			   + " Man of height = " +height+ ", weight = " +weight+ ", age " +age+ " \n"
	//			   + " will have BMR = " +manBmr+ " \n"
	//			   + " and need chocolates = " + (manBmr / 230));
	}
}
*/



//option 2 

import javax.swing.JOptionPane;

public class BMR{
	
	public static void main (String[] args){
	
	double w,h,a,womanBmr, manBmr;
	
	String weight = JOptionPane.showInputDialog(" Weight in pounds ? ");
	String height = JOptionPane.showInputDialog(" Height in inches ? ");
	String age = JOptionPane.showInputDialog(" Age in years ? ");
	
	// need these strings in numbers. 
	
	w = Double.parseDouble(weight);
	h = Double.parseDouble(height);
	a = Double.parseDouble(age);
	
	womanBmr = 655 + (4.3 * w) + (4.7 * h) - (4.7 * a);
	manBmr = 66 + (6.3 * w) + (12.9 * h) - (6.8 * a);
	
	JOptionPane.showMessageDialog(null," Woman need atleast " + (int)(womanBmr/230)+ " chocolates \n"
									  + " Man need atleast " + (int)(manBmr/230)+ " chocolates");
	
	System.exit(0);
	
	}
}

