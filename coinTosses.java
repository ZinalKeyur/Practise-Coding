/*
For 8 coin tosses, user will input either h for heads or t for tails.
Calculate number of heads
Calculate number of tails
Calculate percentage of heads
Calculate percentage of tails
*/

// We can use scanner keyboard but that increases chances of wrong inputs from user. SO lets use JOptionPane this time

import javax.swing.JOptionPane;
import java.util.Scanner;

 
public class coinTosses{
	
	public static void main(String[] args){
	int count = 0, heads = 0, tails = 0;
	
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println(" How many toss chances do you want ? ");
	int tosses = keyboard.nextInt();
	
	Object[] options = {"h","t"};
	
	for (count = 1; count <= tosses; count++){
	int choice = JOptionPane.showOptionDialog(null," Select either h for heads or t for tails from dialog box \n"
												 + " Toss " +count , " Select Heads or Tails ",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0] );
	
	if (choice == 0) heads = heads + 1;
	else if (choice == 1) tails = tails + 1;
	else System.out.println(" You cant choose one from 2 options ???");
	
	}
	
	System.out.println(" Heads selected = " +heads);
	System.out.println(" Tails selected = " +tails);
	System.out.println(" Heads Percentage = " + (heads * 100 / tosses));
	System.out.println(" Tails Percentage = " + (tails * 100 / tosses));
	
	}
}


