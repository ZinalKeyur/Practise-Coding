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
keyboard.nextBoolean();      // DOUBT
keyboard.useDelimiter();     // NOTE that it is spelled with i in miter and not meter.
*/

import java.util.Scanner;

public class scannerMethods{
	
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println(" Write a statement from which we will display word");
		String word = keyboard.next();
		
		System.out.println("  Write a statement from which we will display next line 1 ");
		String line1 = keyboard.nextLine();
		
		System.out.println("  Write a statement from which we will display next line 2 ");
		String line2 = keyboard.nextLine();
		
		System.out.println("  Write a statement from which we will display next line 3 ");
		String line3 = keyboard.nextLine();
		
		System.out.println(" nextByte : ");
		byte byteNum = keyboard.nextByte();
		
		System.out.println(" nextShort : ");
		short shortNum = keyboard.nextShort();
		
		System.out.println(" nextInt : ");
		int intNum = keyboard.nextInt();
		
		System.out.println(" nextLong : ");
		long longNum = keyboard.nextLong();
	
		System.out.println(" nextFloat : ");
		float floatNum = keyboard.nextFloat();
		
		System.out.println(" nextDouble : ");
		double doubleNum = keyboard.nextDouble();
		
		System.out.println(" nextBoolean : ");
		boolean boo = keyboard.nextBoolean();
		
		System.out.println(" next : " +word);
		System.out.println(" nextLine1 : " +line1);
		System.out.println(" nextLine2 : " +line2);
		System.out.println(" nextLine3 : " +line3);
		System.out.println(" nextByte : " +byteNum);
		System.out.println(" nextShort : " +shortNum);
		System.out.println(" nextInt : " + intNum);
		System.out.println(" nextLong : " + longNum);
		System.out.println(" nextFloat : " + floatNum);
		System.out.println(" nextDouble : " + doubleNum);
		System.out.println(" nextBoolean : " + boo );
		
		
		Scanner keyboard2 = new Scanner(System.in);
		keyboard2.useDelimiter("#");
		
		System.out.println("  Write a statement and we will give words delimited by # ");
		String s1 = keyboard2.next();
		String s2 = keyboard2.next();
		
		System.out.println(" # delimited s1 : " +s1 );
		System.out.println(" # delimited s2 : " +s2 );
	}
}
