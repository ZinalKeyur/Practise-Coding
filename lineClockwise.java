/* 
Take a line input and move first word to line end. Clockwise rotation. 
Assume the first word ends with blank and no punctuation
Also first letter of first word of new Line must be Caps
*/


import java.util.Scanner;

public class lineClockwise{
	
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println (" Enter a line of text");
			
			String text = keyboard.nextLine();
			int spaceIndex = text.indexOf(" ");
			
			String newText = text.substring(spaceIndex+1)+ " " + text.substring(0,spaceIndex);   // +1 because there is blank space after first word so that also needs to cut before startong another line
			String newTextCaps = newText.toUpperCase();
			
			System.out.println (newText);
			System.out.println (newTextCaps);  // This is to get first leete caps but not the best way
			String newLine = newTextCaps.substring(0,1) + newText.substring(1);
			System.out.println(newLine);
			}
}

/*
D:\java>javac lineClockwise.java

D:\java>java lineClockwise
 Enter a line of text
Rotate me clockwise
me clockwise Rotate
ME CLOCKWISE ROTATE
Me clockwise Rotate

D:\java>
*/