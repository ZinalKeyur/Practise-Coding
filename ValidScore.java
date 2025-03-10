//Option1
import java.util.Scanner;

public class ValidScore{
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give your score");
		int score = keyboard.nextInt();
		
		if (score >= 0 && score <= 100)
			System.out.println("This is a valid test score");
		else
			System.out.println("Invalid scores");
		
		// merging another question
		
		int x = score;
		if (x%2 == 0){
			System.out.println("This is an even number");
			x = x / 2;
		}
		else{
			System.out.println("This is an odd number");
			x = x * 3 -1;
		}
		
		System.out.println(" x = " +x);
		
		
	}
}