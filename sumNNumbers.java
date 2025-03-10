/*
Find sum of n positive odd numbers
*/

import java.util.Scanner;

public class sumNNumbers {
	
	public static void main (String[] args){
		
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("");
		System.out.println(" We will find sum of first n positive odd numbers ");
		System.out.println(" Provide n in integer ");
		
		int n = keyboard.nextInt();
		int sum = 0;
		
		if (n == 0){
			System.out.println(" Sum of first " +n+ " odd digits is " +sum);
		}
		else if (n == 1){
			sum = 1;
			System.out.println(" Sum of first " +n+ " odd digits is " +sum);
		}
		else{
			int number = 1;
			for (int count = 1; count <= n; count++){
				sum = sum + number;
				System.out.println(" Sum after adding number " +number+ " which " +count+ " digit = " +sum);
				number = number + 2;
			}
		System.out.println(" Sum after " +n+ " digit = " +sum);
		}
		
	
	}

}
