public class loops{
	
	public static void main (String[] args){
		
		System.out.println("Startiing for loop iteration");
		for (int i = 1; i <= 4; i++){
			System.out.println("One more time");
		}
		
		int j = 1;
		System.out.println("Startiing while loop iteration");
		while (j <= 4){  // While loop may or may not execute 0 times also in some conditions

			System.out.println("One more time");
			j++;
		
		}
		
		int w = 1;
		System.out.println("Startiing do-while loop iteration");
		do{              // do while loop will execute atleast once
			System.out.println("One more time");
			w++;
		}while(w <= 4);  // note ;
		
		System.out.println("for loop iteration with ;. Lets see if it runs");
		for (int i = 1; i <= 4; i++);{      // basically it will not go to body and consider it empty because of ; , but when tested it ran once. But did not iterate.
			System.out.println("One more time");
		}
		
	}
}