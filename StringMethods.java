/*Learn string methods

String.charAt();
String.compareTo(anotherString);           // S < AS means -int, S = AS means 0, S > AS means +int  compares in lexiographic ordering. which means alphabetical ordering withh all string upper or lower case 
String.concat();
String.equals();
String.equalsIgnoreCase();
String.indexOf();
String.lastIndexOf();
String.length();
String.toLowerCase();
String.toUpperCase();
String.replace(oldChar,newChar);
String.substring(startingAt);             // note small s in string unlike all
String.substring(startingAt,endingat);    // note small s in string unlike all
String.trim();                            // removes leading and trailing white spaces

*/

public class StringMethods{
	public static void main (String[] args){
		
	String statement = "     ***Hello, we am trying to learn java and string methods***       ";
	
	System.out.println("charAT : " +statement.charAt(8));
	System	.out.println(" compareTo : " +statement.compareTo("     ***HELLO, we am trying to learn java and string methods***       "));
	System.out.println(" concat : "+statement.concat(" And we will Make it :)"));
	System.out.println(" equals : " +statement.equals("     ***HELLO, we am trying to learn java and string methods***       "));
	System.out.println(" equalsIgnoreCase : " +statement.equalsIgnoreCase("     ***HELLO, we am trying to learn java and string methods***       "));
	System.out.println(" indexOf : " +statement.indexOf("java"));
	System.out.println(" lastIndexOf : " +statement.lastIndexOf("*"));
	System.out.println(" length : " +statement.length());
	System.out.println(" toLowerCase : " +statement.toLowerCase());
	System.out.println(" toUpperCase : " +statement.toUpperCase());
	System.out.println(" replace : " +statement.replace("am", "are"));
	System.out.println(" substring starting at : " +statement.substring(7));             
	System.out.println(" substring starting and ending at : " +statement.substring(7,14));         
	System.out.println(" trim : " +statement.trim());                  
	}
}

/*

D:\java>java StringMethods
charAT : H
 compareTo : 32
 concat :      ***Hello, we am trying to learn java and string methods***        And we will Make it :)
 equals : false
 equalsIgnoreCase : true
 indexOf : 37
 lastIndexOf : 62
 length : 70
 toLowerCase :      ***hello, we am trying to learn java and string methods***
 toUpperCase :      ***HELLO, WE AM TRYING TO LEARN JAVA AND STRING METHODS***
 replace :      ***Hello, we are trying to learn java and string methods***
 substring starting at : *Hello, we am trying to learn java and string methods***
 substring starting and ending at : *Hello,
 trim : ***Hello, we am trying to learn java and string methods***
 
*/