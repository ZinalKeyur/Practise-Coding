// Read runs scored by both teams during each of nine innings. Display final  score afterwards.

import java.util.Scanner;

public class score{
	public static void main(String[] args){
	
	int teamA = 0,teamB = 0;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println (" Consider there are 2 Teams \"A\" and \"B\" \n"
					  + " They will play in total nine innings ");
					  
	
	for (int match = 1; match <= 9; match++){
	System.out.println(" Match " +match+ " results ");
	System.out.println (" Team A score ? ");
	teamA = teamA + keyboard.nextInt();
	System.out.println (" Team B score ? ");
	teamB = teamB + keyboard.nextInt();
	}
	
	System.out.println(" Thus Team A total scores = " +teamA);
	System.out.println(" Thus Team B total scores = " +teamB);
	
	}
}


