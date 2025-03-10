//option 3 GETTING i/o USING jooPTIONpANE

import javax.swing.JOptionPane;

public class Average{
	public static void main(String[] args){
		
		int n, sum = 0;
		double avg, count;
		String nStr = JOptionPane.showInputDialog(" We will be calculating Average of whole numbers of your choice \n " + 
												  " How many numbers do you want to find average of ? ");
		
		n = Integer.parseInt(nStr);
		count = Double.parseDouble(nStr);  			// I am forgetting this method of string to number transformation.
		System.out.println (" count = " +count);
		
		
		for (int i=0; i<n; i++){
			String number = JOptionPane.showInputDialog(" Enter a whole number");
			sum = sum + Integer.parseInt(number);
			}
		
		avg = sum/count;
		
		JOptionPane.showMessageDialog(null," Average = " +avg);    // I am fogetting null here coz use is still not explained in chapter 2
		
		System.exit(0);
	}
}


// should be able to store all inputs in array but i have not learnt that yet.

/* OPTion 2

import java.util.Scanner;

public class Average{
	public static void main (String[] args){
			
			int n, sum=0;
			double avg, count;
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println (" We will be calculating Average of whole numbers of your choice ");
			System.out.println (" How many numbers do you want to find average of ? ");
			
			n = keyboard.nextInt();
			count = (double)n;
			System.out.println(" count : " +count);
			System.out.println ("Enter whole numbers 1 at a time");
			
			for (int i=0; i<n; i++){
			System.out.println (" Enter number ");
			sum = sum + keyboard.nextInt();
			}
			
			avg = sum/count;
			
			System.out.println(" Average = " +avg); 

			}
	
}
*/







/* OPTION 1

import java.util.Scanner;

public class Average{
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println (" We will be calculating Average of 3 whole numbers of your choice ");
			System.out.println (" Enter first number ");
			int n1 = keyboard.nextInt();
			System.out.println (" Enter second number ");
			int n2 = keyboard.nextInt();
			System.out.println (" Enter third number ");
			int n3 = keyboard.nextInt();
			
			double avg = (n1+n2+n3)/3.0;    // if we divide by 3 it gives int number only 7. so use 3.0
			
			System.out.println(" Average = ( " +n1+ "+" +n2+ "+" +n3+ ")/3 = " +avg); 

			}
	
}

*/