// Using enumeration still have doubt, complete after chp -6-

/*
import java.util.Scanner;

public class menuChoices{
	
	public static void main (String[] args){
	
	enum MenuOptions {a,b,c,d,e};
	Options = MenuOptions.a;
	Enum is actually a class written inside a class and outside method definition
	//We are defining a class type enum and giving named constants for menuoptions
	// Ideally no semicolon, even if you add it is okay
	// MenuOptions Options;    // if you want to assign a variable Options = MenuOptions.a
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" Please select your order by giving a letter betwwen a-e \n "
					  + " a - Tea \n "
					  + " b - Coffee \n "
					  + " c - Beer \n " 
					  + " d - Orange Juice \n " 
					  + " e - Water " );
					  
	char choice = keyboard.nextChar();

												  
	switch (choice){
		
		case a :
		System.out.println(" You chose Tea ");
		break;
		
		case b :
		System.out.println(" You chose Coffee ");
		break;
		
		case c :
		System.out.println(" You chose Beer ");
		break;
		
		case d :
		System.out.println(" You chose Orange Juice ");
		break;
		
		case e :
		System.out.println(" You chose Water ");
		break;
		
		default :
		System.out.println(" invalid choice " );
		break;
		
	}
	
	}
}
*/


// Using JOptionPane showOptionDialog

/*

import javax.swing.JOptionPane;

public class menuChoices{
	
	public static void main (String[] args){
	
	Object[] Options = {'a','b','c','d','e'};
	
	int choice = JOptionPane.showOptionDialog(null, " Please select you order \n "
												  + " a - Tea \n "
												  + " b - Coffee \n "
												  + " c - Beer \n " 
												  + " d - Orange Juice \n " 
												  + " e - Water " , " Menu ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Options,Options[0]);
											  
												  
	switch (choice){
		
		case 0 :
		System.out.println(" You chose Tea ");
		break;
		
		case 1 :
		System.out.println(" You chose Coffee ");
		break;
		
		case 2 :
		System.out.println(" You chose Beer ");
		break;
		
		case 3 :
		System.out.println(" You chose Orange Juice ");
		break;
		
		case 4 :
		System.out.println(" You chose Water ");
		break;
		
		default :
		System.out.println(" invalid choice " );
		break;
		
	}
	
	}
}
*/



import java.util.Scanner;

public class menuChoices{
	
	public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" Please select your order by giving a letter between a-e \n "
					  + " a - Tea \n "
					  + " b - Coffee \n "
					  + " c - Beer \n " 
					  + " d - Orange Juice \n " 
					  + " e - Water " );
					  
	//String choice = keyboard.next();  than if statement is choice.equals("a")
	char choice = keyboard.next().charAt(0);

	if (choice == 'a') System.out.println(" You chose Tea ");
    else if (choice == 'b') System.out.println(" You chose Coffee ");
	else if (choice == 'c') System.out.println(" You chose Beer ");
	else if (choice == 'd') System.out.println(" You chose Orange Juice ");
	else if (choice == 'e') System.out.println(" You chose Water ");
	else System.out.println(" invalid choice " );
	
	}
}

