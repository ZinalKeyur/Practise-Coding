import java.util.Scanner;

public class Chp-2Ex-1{
public static void main( String[] args){

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a Floating point number")
float x = keyboard.nextFloat();
double y = 1.0/x;
System.out.println("x is : " +x+ " y is : " +y+ " and their product is : " +x*y);
//OR
System.out.println("x is : %1.2f y is : %1.2d and their product is : %1.2d ", x,y,x*y);
System.out.println(" (x*y)-1 : " +(x*y)-1);
}
}