import java.util.Scanner;

public class whileAndDoWhile {
	
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("");
		
		System.out.println("");
		System.out.println(" Testing while loop now");
		System.out.println(" We will continue to compare the first and last charachter of your input word until ypu type \"done\".");
		System.out.println(" Type any word ");
		String word = keyboard.next();
		
		while (!(word.equals("done"))){
			
			System.out.println(" Character at first place = '" +word.charAt(0) );
			System.out.println(" Character at last place = '" +word.charAt(word.length() - 1) );
			
			if ( word.charAt(0) == word.charAt(word.length() - 1) ){
				System.out.println(" They are equal ");
			}
			else{
				System.out.println(" They are not equal ");
			}
			
			System.out.println(" Type any word ");
			word = keyboard.next();   // See if we type done, does loop exit or runs atleast once ?
		}
		
		System.out.println("");
		System.out.println(" Testing do-while loop now");
		System.out.println(" We will continue to compare the first and last charachter of your input word until ypu type \"done\".");
		System.out.println(" Type any word ");
		word = keyboard.next();
		
		while (!(word.equals("done"))){
			
			System.out.println(" Character at first place = '" +word.charAt(0) );
			System.out.println(" Character at last place = '" +word.charAt(word.length() - 1) );
			
			if ( word.charAt(0) == word.charAt(word.length() - 1) ){
				System.out.println(" They are equal ");
			}
			else{
				System.out.println(" They are not equal ");
			}
			
			System.out.println(" Type any word ");
			word = keyboard.next();   // See if we type done, does loop exit or runs atleast once ?
		}
		
		
	}

}
