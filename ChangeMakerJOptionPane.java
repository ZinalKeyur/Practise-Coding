/* Take an input from user between 1-500 cent using windowing interface. let user click ok or cancel.
Than display o/p in form of total dollar (100 cents), half(50 cents),quarters(25), dime(10), nickels(5), penny(1). Than user clicks ok to close this window.
*/

import javax.swing.JOptionPane;    // THIS IS WINDOWING CLASS. JOptionPane for I/O; JFrame is only for O/P like using an O/P window for snowman or likewise.

public class ChangeMakerJOptionPane{

public static void main (String[] args){

int originalAmount, amount,dollar,half,quarters,dime,nickel,penny;

//String cents = JOptionPane.showInputDialog(" Write an amount in between 1-500 cents and we will calculate possible change coins for you");
String cents = JOptionPane.showInputDialog(" Write an amount in between 1-500 cents \n "
											+ "and we will calculate possible change coins for you");


amount = Integer.parseInt(cents);

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

// Syntax for below is JOptionPane.showMessageDialog(Component, Object).  // not explained what is component null here for.
JOptionPane.showMessageDialog(null, " To pay " +originalAmount+ " you can put in below combination of coins \n"
								+dollar+ " dollar \n"
								+half+ " half \n"
								+quarters+ " quarters \n"
								+dime+ " dime \n"
								+nickel+ " nickel \n"
								+penny+ " penny \n");
								
System.exit(0);  // MOST IMPORTANT -> since we invoke a window, we must also exit it or it will take backend memory. 
}

else{
System.out.println("Input provided is not in correct range or correct format");}

}
}
