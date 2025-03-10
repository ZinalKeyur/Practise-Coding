/*
Suppose there are x people in party
First person enters and shakes hand with those x people.
For loop to calculate total number of handshakes
*/

// We can use scanner keyboard but that increases chances of wrong inputs from user. SO lets use JOptionPane this time

import java.util.Scanner;

 
public class handShakes{
	
	public static void main(String[] args){
	
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println(" How many people are already in the party ? ");
	int initialCount = keyboard.nextInt();
	
	System.out.println(" How many people arrived later ? ");
	int newCount = keyboard.nextInt();
	
	int handshakes = 0;
	
	for (int count = 1; count <= newCount; count++){
		handshakes = handshakes + initialCount;
		initialCount = initialCount + 1;
		System.out.println(" Handshake after person " +count+ " = " +handshakes);
	}
	
	System.out.println(" Total number of handshakes = " +handshakes);
	
	}
}


