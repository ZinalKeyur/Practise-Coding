// for statement to compute 1^2 + 2^2 + 3^2 + .... + n^2.    first n digit
// for statement to compute 1^2 + 3^2 + 5^2 + .... + n^2.    first n odd digits
// for statement to compute 2^2 + 4^2 + 6^2 + .... + n^2.    first n even digits

import java.util.Scanner;

public class sumNSquares{
	
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" n = ? (Provide an integer number)");
		int n = keyboard.nextInt();
		String formula1 = "", formula2 = "", formula3 = "";
		double sum1 = 0, sum2 = 0, sum3 = 0;
		
		if (n == 0){
			System.out.println(" 0^2 = 0");
		}
		else if (n >= 1){
			
			//First n digits
			for(int count = 1; count <= n; count ++){
				formula1 = formula1 + " + ";
				sum1 = sum1 + Math.pow(count,2);
				formula1 = formula1 + (count+ "^2");
			}
		
		System.out.println( formula1+ " = " +sum1);
		
		//First n odd digits
			int number1 = 1;
			for(int count = 1; count <= n; count ++){
				formula2 = formula2 + " + ";
				sum2 = sum2 + Math.pow(number1,2);
				formula2 = formula2 + (number1+ "^2");
				number1 = number1 + 2;
			}
		
		System.out.println( formula2+ " = " +sum2);
		
		//First n even digits
			int number2 = 2;
			for(int count = 1; count <= n; count ++){
				formula3 = formula3 + " + ";
				sum3 = sum3 + Math.pow(number2,2);
				formula3 = formula3 + (number2+ "^2");
				number2 = number2 + 2;
			}
		
		System.out.println( formula3+ " = " +sum3);
		
		}
		else{
			System.out.println(" Error !!");
		}
		
	}
	
}