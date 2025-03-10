// replace first hate occurence in a line


import java.util.Scanner;

public class replaceHate{
	
	public static void main (String[] args){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println (" Enter a line of text and try to include work hate ");
			
			String text = keyboard.nextLine();
			
			System.out.println(text.indexOf("hate"));
			System.out.println(" After first hate word replaced our line is : ");
			
			//String newLine = text.replace("hate","love");  // this replaces all occurence of hate. But i want to replace only first
			int hateIndex = text.indexOf("hate");
			String newText = text.substring(0,hateIndex) + "love" +text.substring(hateIndex + 4);
			System.out.println(newText);
			}
}
