import java.util.Scanner;

public class serviceCharge{
	
	public static void main (String[] args){
		 Scanner keyboard = new Scanner (System.in);
		 System.out.println("Enter the amount in numbers");
		 
		 double amount = keyboard.nextDouble();
		 double serviceCharge = 0;
		 
		 if (amount < 10) serviceCharge = 1;
		 else if (amount < 100) serviceCharge = amount * 0.01;
		 else if (amount < 1000) serviceCharge = 5 + amount * 0.05;
		 else if (amount >= 1000) serviceCharge = 40 + amount * 0.1;
		 else System.out.println ("We did not find right combination so service charge is 0");
		 
		 	System.out.println( " ServiceCharge = " +serviceCharge);
	}
	

}