/*
Guess a 5 digit secret code
Suppose secretCode = 87654

Suppose User guesses = 37678

Means second and third digits are correct

So program will output 2 values
1 - number of correct digits
2 - sum of correct digits

*/

import java.util.Scanner;

public class guessCode {
	
	public static void main (String[] args){
		
		String secretCode = "98765";
		String guess = "";                 // But note that user can input a string instead of a digit. And they can iput less or more number of digits. Than what ?
		
		boolean found = false;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("");
		System.out.println(" You will get 5 chances to guess a 5 digit secret code ");
		
		while (!found){
			for (int count = 1 ; count <= 5 ; count++ ){
				System.out.println(" Try " +count);
				
				int correctDigits = 0, correctDigitsSum = 0;
					for (int i = 0; i < 5; i++){
						
						guess = keyboard.next();
						
						while (guess.length() == 5){
							System.out.println(" Input atleast 5 digits ");
							guess = keyboard.next();
							System.out.println(guess.length());
							
						}
						if (secretCode.charAt(i) == guess.charAt(i)){
							correctDigits++;
							correctDigitsSum = correctDigitsSum + Integer.parseInt(guess.substring(i,i+1));   // Note that you cannot parse a character
						}
						
					}
				
				if (correctDigits == 5){
				System.out.println(" Superb!!. You got it all right.");
				found = true;
				break;
				}
				else{
				System.out.println(" You guessed " +correctDigits+ " right digits.");
				System.out.println(" Sum of " +correctDigits+ " correctDigits is " +correctDigitsSum);
				System.out.println(" Try Again. ");
				}
			}
		}
		
		
		
		
	}

}


/*
D:\Learning\java>java guessCode

 You will get 5 chances to guess a 5 digit secret code
 Try 1
hejllo
 You guessed 0 right digits.
 Sum of 0 correctDigits is 0
 Try Again.
 Try 2
987
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 3
        at java.lang.String.charAt(Unknown Source)
        at guessCode.main(guessCode.java:37)
		
		*/