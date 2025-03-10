import java.util.Scanner;

public class mergeLines{
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println (" We will calculate length of statements you give as input ");
			System.out.println (" Provide first statement ");
			String line1 = keyboard.nextLine();
			System.out.println (" Provide second statement ");
			String line2 = keyboard.nextLine();
			
			String line3 = line1+ " " +line2;
			
			System.out.println ("Length is : ");
			System.out.println ( line1+ " = " +line1.length());
			System.out.println ( line2+ " = " +line2.length());
			System.out.println ( line3+ " = " +line3.length());	
			
			
			}
	
}
