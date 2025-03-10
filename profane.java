/* 
Profane words = language or words that are offensive in general or irrespetful to any specific religion or caste or community and likewise.

Suppose our profane words = dog, cat, llama.
Write a program that read a statement and find if string contains 1 or more profane words.
1 - reject strings if it include cAt, doG or such words. hence not case sensitive.
2 - reject string if it include case sensitive words . like exact 3 above.

Do not reject substring words like "dogmatic weather"

*/


import java.util.Scanner;

public class profane{

public static void main (String[] args){

System.out.println(" Enter a Statement ");
Scanner keyboard = new Scanner(System.in);
String line = keyboard.nextLine();

//line = line.trim();                          //remove preceeding and post blank spaces
String lowerCaseLine = line.toLowerCase();   // to make sure we detect in any upper or lowercase word that is ask 1 & 2. 


//Sting[] words = line.split();   // this worked in javascript but not in Java. 
//System.out.println(words);
   

// below are 2 way of defing array. Always give capacity. 1 is using split and giving capacity hence array intitialized. 2 is is just declaring an array of some capacity.
String[] words = line.split(" ", 100);     // int[] integers = numbers.split(" delimeter " , capacity of an array)
int[] index = new int[words.length];   // if you dont define capacity, you will get outofboundexception later.

int n = 0;  // can be maximum line.length;
int i = 0;
index[i] = 0 ;


// Below is to make sure entire word in profane and not the substring.
for (String word : words) {      // for javascript we write word in words
	i = i + 1;
	n = n + word.length() + 1;
	if (n > line.length()){
		break;
	}
	else{
	index[i] = index[i-1] + word.length() + 1 ;  
	// This will work till last second word. But for last word it will go +1 which is outofbound for our array. 
	//Hence we break if n goes above allowed length.
	}
	
}
// Above is to make sure entire word in profane and not the substring.


for (int j=0; j<words.length;j++){     //// MOST IMP. UNlike all other declaration and intitialization stages, here we dont give () after length

	if ( (words[j].equals("dog") == true) || (words[j].equals("cat") == true) || (words[j].equals("llama") == true) ){
		
		System.out.println(" Found profane word : \" " +words[j]+ " \" at index : " +index[j]);
	}
	
}


}
}



//with .trim to remove blank spaces at start and end
/*
D:\java>java profane
 Enter a Statement
 cat had dog and dog has tiger                               // Note that we have a blank space before first word
 Found profane word : " cat " at index : 0
 Found profane word : " dog " at index : 8
 Found profane word : " dog " at index : 16
*/
// without .trim
/*
D:\java>java profane
 Enter a Statement
 cat had dog and dog has tiger                               // Note that we have a blank space before first word
 Found profane word : " cat " at index : 1
 Found profane word : " dog " at index : 9
 Found profane word : " dog " at index : 17
 
 D:\java>java profane
 Enter a Statement
dogmatic has cat
 Found profane word : " cat " at index : 13
 
 
 */