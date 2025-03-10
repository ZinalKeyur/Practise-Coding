import java.util.Scanner;

public class Replace{
	
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println (" Enter your favourite colour ");
			String colour = keyboard.next();
			System.out.println (" Enter your favourite food ");
			String food = keyboard.next();
			System.out.println (" Enter your favourite animal ");
			String animal = keyboard.next();
			System.out.println (" Enter your favourite name ");
			String name = keyboard.next();
			
			System.out.print("I had a dream that " +name+ " ate a " +colour+ " " +animal+ " \n" +
							 "and said it tasted like " +food+ " !");
			
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