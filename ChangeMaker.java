/* Take an input from user between 1-500 cent.
Than display o/p in form of total dollar (100 cents), half(50 cents),quarters(25), dime(10), nickels(5), penny(1).
*/

import java.util.Scanner;

public class ChangeMaker{

public static void main (String[] args){

int originalAmount, amount,dollar,half,quarters,dime,nickel,penny;

System.out.println(" Write an amount in between 1-500 cents and we will calculate possible change coins for you");
Scanner keyboard = new Scanner(System.in);
amount = keyboard.nextInt();

if ( amount > 0 && amount < 501){

originalAmount = amount;
dollar = amount/100;
amount = amount%100;
half = amount/50;
amount = amount%50;
quarters = amount/25;
amount = amount%25;
dime = amount/10;
amount = amount%10;
nickel = amount/5;
amount = amount%5;
penny = amount;

System.out.println(" To pay " +originalAmount+ " you can put in below combination of coins");
System.out.println( dollar+ " dollar coins ");
System.out.println( half+ " half coins ");
System.out.println( quarters+ " quarters coins ");
System.out.println( dime+ " dime coins ");
System.out.println( nickel+ " nickel coins ");
System.out.println( penny+ " penny coins ");
}

else{
System.out.println("Input provided is not in correct range or correct format");}

}
}
