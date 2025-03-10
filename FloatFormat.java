//WORKING

import java.util.Scanner;

public class FloatFormat{
public static void main( String[] args){

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a Floating point number");
float x = keyboard.nextFloat();
double y = 1.0/x;
System.out.println("x is : " +x+ " y is : " +y+ " and their product is : " +x*y); // worked
System.out.printf("%.2f = x ",x); // Trying a short format first. This worked
System.out.printf("%.2f = y",y); // Trying a short format first. This worked if we keep as .2f instead of .2d ???????
System.out.printf("x = %1.2f , y = %1.2f and their product is :%1.2f ", x,y,x*y);  // Again works for 2f and not 2d
double result = x*y-1;
System.out.println(" (x*y)-1 : " +result);
}
}


/*

D:\java>java FloatFormat
Enter a Floating point number
5.6
x is : 5.6 y is : 0.17857143161248193 and their product is : 1.0
5.60 = x 0.18 = yx = 5.60 , y = 0.18 and their product is :1.00  (x*y)-1 : 0.0
*/

/*
D:\java>java FloatFormat
Enter a Floating point number
567.456
x is : 567.456 y is : 0.001762251189847609 and their product is : 1.0
567.46 = x 0.00 = yx = 567.46 , y = 0.00 and their product is :1.00  (x*y)-1 : 0.0
*/