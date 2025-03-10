// Count blank charachters in a string

import java.util.Scanner;

public class blankChars{
	public static void main(String[] args){
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Provide a String ");
		
		String line = keyboard.nextLine();
		
		String[] words = line.split(" ");
		int length = words.length;          // MMMMIMP. in javascript we write .length(). here ()not needed. like it is not needed in for loops
		
		// If there is a blank space at the end of this STring, include that. So the indices araay length is 1 more .  So the for boolean expression changes
		if (line.lastIndexOf(" ") == line.length() - 1){
			System.out.println(" Add 1 more space at the end");
			int[] indices = new int[words.length]; 
		
			int startIndex = 0;
			for (int i = 0; i < words.length; i++){
				indices[i] = words[i].length() + startIndex ;   // note that array length is without () but a string length is with ()
				startIndex = indices[i] + 1;
			}
			
			System.out.println(" We have " +length+ " blank charachters in this string at indexes ");
			for (int index : indices){
				System.out.println(index);
			}
			
		}
		// If there is no blank space at the end of this STring, indices array length is 1 less. So the for boolean expression changes
		else {
			int[] indices = new int[words.length - 1]; 
		
			int startIndex = 0;
			for (int i = 0; i < words.length - 1; i++){
				indices[i] = words[i].length() + startIndex ;   // note that array length is without () but a string length is with ()
				startIndex = indices[i] + 1;
			}
			
			System.out.println(" We have " +(length - 1)+ " blank charachters in this string at indexes ");
			for (int index : indices){
				System.out.println(index);
			}
			
		}
		
	}

}