import java.util.Scanner;

public class TypeCast{

public static void main (String[] args){
float x;
int y;
byte z;

// byte->short->int->long->float->double     The left variables can be stored in right without any changes. But right to left need typecast.

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a Floating point number ");

x = keyboard.nextFloat();
y = (int)x;
z = (byte)x;

System.out.println("Floating point number x = " +x);
System.out.println("Respective int number y = " +y);
System.out.println("Respective byte number z = " +z);
}
}


/*
D:\java>java TypeCast
Enter a Floating point number
56.8976
Floating point number x = 56.8976
Respective int number y = 56
Respective byte number z = 56

D:\java>java TypeCast
Enter a Floating point number
-987.987
Floating point number x = -987.987
Respective int number y = -987
Respective byte number z = 37
*/