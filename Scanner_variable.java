/*

scannerMethods

keyboard.next();
keyboard.nextLine();
keyboard.nextByte();
keyboard.nextShort();
keyboard.nextInt();
keyboard.nextLong();
keyboard.nextFloat();
keyboard.nextDouble();
keyboard.nextBoolean();
keyboard.useDelimeter();
*/

import java.util.Scanner;

public class scannerMethods{
	
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println(" Write a statement from which we will display word");
		System.out.println("  Write a statement from which we will display next line 1 ");
		System.out.println("  Write a statement from which we will display next line 2 ");
		System.out.println("  Write a statement from which we will display next line 3 ");
		System.out.println(" nextByte : ");
		System.out.println(" nextShort : ");
		System.out.println(" nextInt : ");
		System.out.println(" nextLong : ");
		System.out.println(" nextFloat : ");
		System.out.println(" nextDouble : ");
		System.out.println(" nextBoolean : ");
		System.out.println(" useDelimeter : ");
		
		String word = keyboard.next();
		String line = keyboard.nextLine();
		byte byteNum = keyboard.nextByte();
		short shortNum = keyboard.nextShort();
		int intNum = keyboard.nextInt();
		long longNum = keyboard.nextLong();
		float floatNum = keyboard.nextFloat();
		double doubleNum = keyboard.nextDouble();
		boolean boo = keyboard.nextBoolean();
		
		System.out.println(" next : " +word);
		System.out.println(" nextLine : " +line);
		System.out.println(" nextByte : " +byteNum);
		System.out.println(" nextShort : " +shortNum);
		System.out.println(" nextInt : " + intNum);
		System.out.println(" nextLong : " + longNum);
		System.out.println(" nextFloat : " + floatNum);
		System.out.println(" nextDouble : " + doubleNum);
		System.out.println(" nextBoolean : " + boo );
		
		
		keyboard.useDelimeter("#");
		String s1 = keyboard.next();
		String s2 = keyboard.next();
		
		System.out.println(" useDelimeter # first word is : " +s1+ " and " +s2);
	}
}