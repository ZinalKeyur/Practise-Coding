import java.util.Scanner;

public class validDate{

public static void main (String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.println (" Provide a date in format mm/dd/yyyy ");

String inputDate = keyboard.next();

String[] date = inputDate.split("/",3);
int mm = Integer.parseInt(date[0]);
int dd = Integer.parseInt(date[1]);
int yy = Integer.parseInt(date[2]);

boolean leapYear = false, valid = true;

if (yy % 4 == 0 && (yy % 100 != 0 || yy % 400 == 0)){
	
	System.out.println(yy+ " is a leap year.");
	leapYear = true;
}


if ( mm <=0 || mm > 12){
	System.out.println(" Month has to be between 1-12. " +mm+ " is an invalid value.");
	valid = false;}
else if (dd <=0){
	System.out.println(" Date cannot be below 0." +dd+ " is an invalid value");
	valid = false;}
else if (leapYear && mm == 2 && dd >= 29){
	System.out.println(" February in a LeapYear can have only 28 days. " +dd+ " is an invalid value.");
	valid=false;}
else if (mm % 2 != 0 && dd > 31){
	System.out.println(" Month " +mm+ " can have only 31 days. " +dd+ " is an invalid value.");
	valid=false;}
else if (mm % 2 == 0 && dd > 30){
	System.out.println(" Month " +mm+ " can have only 30 days. " +dd+ " is an invalid value.");
	valid=false;}
else {
	System.out.println(" Date should be good ");
}
	
if (valid){
	System.out.println(" Date " +mm+"/"+dd+"/"+yy+ " is valid. ");
}


}
}