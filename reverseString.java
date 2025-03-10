// Reverse given String

import java.util.Scanner;

public class reverseString{
	public static void main(String[] args){
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Provide a String ");
		
		String line = keyboard.nextLine();
		String reverseString = "";
		
		for (int i = line.length() - 1 ; i >= 0 ; i--){
			reverseString = reverseString + line.charAt(i);
		}
		
		System.out.println(reverseString);
		
	}

}