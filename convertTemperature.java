import java.util.Scanner;

public class convertTemperature{
	
	public static void main (String[] args){
	
	double celTemp, fereinTemp;	
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" Provide  a temperature followed by a space and than degree alphabet \n "
					 + " Eg.: \n" 
					 + " 78 C \n"
					 + " 45 F \n"
					 + " 65 c ");
	
	String inputTemp = keyboard.nextLine();
	
	int space = inputTemp.indexOf(" ");
	
		while (! inputTemp.toUpperCase().trim().equals("Q")  || ! inputTemp.toUpperCase().trim().equals("QUIT")){

			space = inputTemp.indexOf(" ");
			
			if (inputTemp.toUpperCase().trim().equals("Q")  || inputTemp.toUpperCase().trim().equals("QUIT"))
			{
				System.out.println(" Thankyou ");
				break;
			}
			else if (inputTemp.indexOf(" ") == -1){
				
				System.out.println(" Please provide a numeric value followed by a SPACE and the letter C or F.");
				
			}
			if ( ((inputTemp.substring(space + 1)).toUpperCase()).equals("C") ){
				try {
					celTemp = Integer.parseInt(inputTemp.substring(0,space));          // DONT FORGET
					fereinTemp = (9 * (celTemp / 5) + 32);
					System.out.println(" Input " +inputTemp+ " = " +fereinTemp+ " F." );
				}
				catch (Exception e){
					System.out.println(" Temperature should be a numberic value, followed by C for celcius.");
				}
				
			}
			else if ( ((inputTemp.substring(space + 1)).toUpperCase()).equals("F") ){
				try{
					fereinTemp = Integer.parseInt(inputTemp.substring(0,space));
					celTemp = (5 * (fereinTemp - 32) / 9);
					System.out.println(" Input " +inputTemp+ " = " +celTemp+ " C." );
				}
				catch(Exception e){
					System.out.println(" Temperature should be a numberic value, followed by F for fereinheit.");
				}
			}
			else {
				System.out.println(" Temperature must be in Celcius \" C \" or Fereinheit \" F \".");
			}
			
			System.out.println("");
			
			System.out.println(" Want to convert more temperatures ? \n"
							 + " If no - write 'Q' or 'q' for quit \n"
							 + " if yes - provide the numerical temperature value followed by leeter C for celcius or F for fereinheit. ");
							 
			System.out.println("");
							 
			inputTemp = keyboard.nextLine();
		
		}
		
	}
	
}

