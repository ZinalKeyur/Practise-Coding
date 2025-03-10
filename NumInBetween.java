// This is to read 2 numbers and find total count of number between these both, including both of them

import java.util.Scanner;
import java.lang.Math;

public class NumInBetween{
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
int a, b, c;

System.out.println("This program will count total numbers between any 2 numbers you decide");
a = keyboard.nextInt();
b = keyboard.nextInt();

c = Math.abs(a-b);
c=c+1;
System.out.println(" There are " +c+ " numbers between " +a+ " & " +b);
//return(c);
// Not sure why my return is not working;
}
}