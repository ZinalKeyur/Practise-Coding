/*
// 4-bit Binary to Decimal = 1100 = 8(1) +4(1) +2(0) + 1(0);

import java.util.Scanner;
public class binToDec{
	
	public static void main (String[] args){
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Enter a 4 digit binary number on 0 and 1 " );
		String binary = keyboard.next();
		
		int n0 = Integer.parseInt(binary.substring(0,1));
		int n1 = Integer.parseInt(binary.substring(1,2));
		int n2 = Integer.parseInt(binary.substring(2,3));
		int n3 = Integer.parseInt(binary.substring(3));
		
		System.out.println( 8 * n0 + 4 * n1 + 2 * n2 + 1 * n3);
	}
}

*/

// n-bit Binary to Decimal = 1100 = (2^(n-1))(0) +(2^(n-2))(1) +(2^(n-3))(2) + ...... + (2^(1))(n-1))+ (2^(0))(n);

import java.util.Scanner;
public class binToDec{
	
	public static void main (String[] args){
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Enter a binary number on 0 and 1 " );
		String binary = keyboard.next();
		int n = binary.length();
		int sum = 0, digit, power;
		
		for (int i=0; i<n; i++){
		digit = Integer.parseInt(binary.substring(i,i+1));
		power = (int)((Math.pow(2,n-(i+1))));                // note that power result is double so convert it to int
		sum = sum + (digit * power);
		}
		
		System.out.println( " binary " +binary+ " = decimal " +sum);
	}
}