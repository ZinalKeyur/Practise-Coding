	// Sorting using loop right now
	// check if number1 is divisible by number 2.    // so need to check for zeros in number2
	// sort number1, number2, number3.
	
	import java.util.Scanner;

public class divisible{
	
	public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" We will tell you if Number1 is divisible by Number 2 \n "
					 + " And if sort 3 numbers in ascending order for you ");
	
	System.out.println(" Provide a positive Integer number 1" );
	int number1 = keyboard.nextInt();
	
	System.out.println(" Provide a positive Integer number 2" );
	int number2 = keyboard.nextInt();
	
	System.out.println(" Provide a positive Integer number 3" );
	int number3 = keyboard.nextInt();
	
	int[] numbers = {number1,number2,number3};

	// See if they want only positive integers than put conditions likewise.
	if (number2 > 0){                        // if number1 is zero, divide = 0. But if number 2 is zero, syntax error so need this condition.
		if(number1%number2 == 0 ){
			System.out.println( number1+ " / " +number2+ " = " +(number1/number2));
		}
		else{
			System.out.println (number1+ " is not divisible by " +number2);
		}
			
			int temp = 0, i = 0, j = 0;
  
			for (i=0; i<numbers.length;i++){   // Java array.length;     Javascript Array.length();
			
				for (j=i+1;j<numbers.length;j++){
					
					if (numbers[j] < numbers[i]){
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
					
				}
			}
	}
	
	else{
		System.out.println(" Number cannot be divisible by zero. It would give Infinity");
	}


	//System.out.println(" Sorted numbers " + numbers); Array can be given like this in Javascript but not in java
	
	
	System.out.println("Sorted numbers are");
	for (int x=0; x<numbers.length; x++){
		System.out.print(numbers[x] + ", ");
	}
	
	}
}

