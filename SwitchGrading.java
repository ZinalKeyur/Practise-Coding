//NOTE: Usually switch controlling expression is a number (int,byte,long,etc). So use "" for a string control.

//OPTION1

/*import java.util.Scanner;

public class SwitchGrading{

		public static void main (String[] args){
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Provide your Grade letter followed by sign if any \n"
						 + " Eg.: A, A+, A-, B, ...., F ");
						 
		String gradeLetter = keyboard.next();
		double gradeValue;
		
		switch(gradeLetter){
			
			case "A" : 
				gradeValue = 4.0;
				break;
			case "A+" : 
				gradeValue = 4.25;
			break;
				case "A-" : 
				gradeValue = 3.75;
				break;
			case "B" : 
				gradeValue = 3.0;
				break;
			case "B+" : 
				gradeValue = 3.25;
				break;
			case "B-" : 
				gradeValue = 2.75;
				break;
			case "C" : 
				gradeValue = 2.0;
				break;
			case "C+" : 
				gradeValue = 2.25;
				break;
			case "C-" : 
				gradeValue = 1.75;
				break;
			case "D" : 
				gradeValue = 1.0;
				break;
			case "D+" : 
				gradeValue = 1.25;
				break;
			case "D-" : 
				gradeValue = 0.75;
				break;
			case "F" : 
				gradeValue = 0.0;
				break;
			default: 
				System.out.println("invalid input");
				gradeValue = 0.0;
				break;
			
		}
		
		System.out.println(" Grade " +gradeLetter+ " = " +gradeValue);
		}
	
}



//Option2

import java.util.Scanner;

public class SwitchGrading{

		public static void main (String[] args){
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Provide your Grade letter followed by sign if any \n"
						 + " Eg.: A, A+, A-, B, ...., F ");
						 
		String gradeLetter = keyboard.next();
		double gradeValue;
		
		if (gradeLetter.equals("A")) gradeValue = 4.0;
		else if (gradeLetter.equals("A+"))gradeValue = 4.25;
		else if (gradeLetter.equals("A-")) gradeValue = 3.75;
		else if (gradeLetter.equals("B")) gradeValue = 3.0;
		else if (gradeLetter.equals("B+")) gradeValue = 3.25;
		else if (gradeLetter.equals("B-")) gradeValue = 2.75;
		else if (gradeLetter.equals("C")) gradeValue = 2.0;
		else if (gradeLetter.equals("C+")) gradeValue = 2.25;
		else if (gradeLetter.equals("C-")) gradeValue = 1.75;
		else if (gradeLetter.equals("D")) gradeValue = 1.0;
		else if (gradeLetter.equals("D+")) gradeValue = 1.25;
		else if (gradeLetter.equals("D-")) gradeValue = 0.75;
		else if (gradeLetter.equals("F")) gradeValue = 0.0;
		else {
		System.out.println("invalid input");
		gradeValue = 0.0;
		}
		
		System.out.println(" Grade " +gradeLetter+ " = " +gradeValue);
		}
	
}

*/

// Option 3 


import java.util.Scanner;

public class SwitchGrading{

		public static void main (String[] args){
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Provide your Grade letter followed by a space and sign if any \n"
						 + " Eg.: A, A +, A -, B, ...., F ");
						 
		String gradeLetter = keyboard.next();
		String gradeSign = keyboard.next();
		double gradeValue;
		
		switch(gradeLetter){
			
			case "A" : 
				gradeValue = 4.0;
				switch(gradeSign){
					case "+" : 
					gradeValue = gradeValue + 0.25;
					break;
					case "-" : 
					gradeValue = gradeValue + 0.25;
					break;
					default : 
					gradeValue = gradeValue;
					break;}
				break;
			case "B" : 
				gradeValue = 3.0;
				switch(gradeSign){
					case "+" : 
					gradeValue = gradeValue + 0.25;
					break;
					case "-" : 
					gradeValue = gradeValue + 0.25;
					break;
					default : 
					gradeValue = gradeValue;
					break;}
				break;
			case "C" : 
				gradeValue = 2.0;
				switch(gradeSign){
					case "+" : 
					gradeValue = gradeValue + 0.25;
					break;
					case "-" : 
					gradeValue = gradeValue + 0.25;
					break;
					default : 
					gradeValue = gradeValue;
					break;}
				break;
			case "D" : 
				gradeValue = 1.0;
				switch(gradeSign){
					case "+" : 
					gradeValue = gradeValue + 0.25;
					break;
					case "-" : 
					gradeValue = gradeValue + 0.25;
					break;
					default : 
					gradeValue = gradeValue;
					break;}
				break;
			case "F" : 
				gradeValue = 0.0;
				break;
			default: 
				System.out.println("invalid input");
				gradeValue = 0.0;
				break;
			
		}
		
		System.out.println(" Grade " +gradeLetter+ " = " +gradeValue);
		}
	
}

