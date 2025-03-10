	/*
	Sort strings lexiographically
	Alphabetic means sorting strings which are both all uppercase or all lowercase
	But lexiographically, Uppercase comes first and than comes lowercase. So Z comes before a
	*/
	
	IMPORTANT. Traditionally java do not have array push method. 
	It has different classes with push or add methods like 
	stack.push(), LinkedList.push(), ArrayList.add(), a User-Defined push(), for Arrays, ArrayDeque.push() 
	
	// Option1
	
	
	/*
	import java.util.Scanner;

public class lexiographicSort{
	
	public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" We will sort statements for you lexiographically \n"
					 + " Provide first statement" );
	
	String line1 = keyboard.nextLine();
	
	System.out.println(" Provide second statement" );
	String line2 = keyboard.nextLine();
	
	System.out.println(" Provide third statement" );
	String line3 = keyboard.nextLine();
	
	String	lines = {line1,line2,line3};
	
	int i = 0, j = 0;
	String temp;

	for (i=0; i<lines.length;i++){   // Java array.length;     Javascript Array.length();
	
		for (j=i+1;j<lines.length;j++){
			
			if (lines[i].compareTo(lines[j]) > 0){
				temp = lines[i];
				lines[i] = lines[j];
				lines[j] = temp;
			}
			
		}
	}

	System.out.println("Sorted lines are");
	
	for (int x=0; x<lines.length; x++){
		System.out.print(lines[x] + ", ");
	}
	System.out.println(" Second line is : " +lines[1]);
	}
}

*/



//Option 2 
DOUBT ABOUT push methods

import java.util.Scanner;
import java.util.ArrayList;

public class lexiographicSort{
	
	public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	ArrayList<String> lines = new ArrayList<String>();
	List<Integer> temp = new ArrayList<Integer>();
	
	 // Adding elements to the ArrayList
	 
	System.out.println(" We will sort statements for you lexiographically \n"
					 + " Provide first statement" );
	
	String line1 = keyboard.nextLine();
	
    lines.add(keyboard.nextLine());
	
	System.out.println(" Provide second statement" );
	lines.add(keyboard.nextLine());
	
	System.out.println(" Provide third statement" );
	lines.add(keyboard.nextLine());
	
	int i = 0, j = 0;
	String temp;

	for (i=0; i<lines.length;i++){   // Java array.length;     Javascript Array.length();
	
		for (j=i+1;j<lines.length();j++){
			
			if (lines[i].compareTo(lines[j]) > 0){
				temp = lines[i];
				lines[i] = lines[j];
				lines[j] = temp;
			}
			
		}
	}

	System.out.println("Sorted lines are");
	
	for (int x=0; x<lines.length; x++){
		System.out.print(lines[x] + ", ");
	}
	System.out.println(" Second line is : " +lines[1]);
	
	 System.out.println("ArrayList: " + lines);
	}
}


