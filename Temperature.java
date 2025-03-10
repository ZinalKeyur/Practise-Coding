import java.util.Scanner;

public class Temperature{
	
	public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" Provide an Integer number to indicate temperature" );
					  
	int temp = keyboard.nextInt();
	String label = "degree";

	//if (temp == 0 || temp == 1)
	if (temp >= 0 && temp < 1 ) System.out.println(" Now Temperature is " +temp+ " " +label+ ".");
    else if (temp > 1 ) System.out.println(" Now Temperature is " +temp+ " " +label+ "s.");
	else System.out.println(" Temperature input cannot be negative." );
	
	}
}

