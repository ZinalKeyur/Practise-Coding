import java.util.Scanner;

public class PercentOperator{

public static void main (String[] args){
float x;
double y; // Keeping y as float will give error when calculating x%2.0 with error, possibly lossy conversion from double to float. 
int z;

// byte->short->int->long->float->double     The left variables can be stored in right without any changes. But right to left need typecast.

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a Floating point number ");

x = keyboard.nextFloat();
y = x % 2.0;
z = (int)x;

System.out.println("Floating point number x = " +x);
System.out.println("x%2.0 = " +y);
System.out.println("int value z = " +z);
System.out.println("z%2 = " +z%2);
}
}


/*
D:\java>java PercentOperator
Enter a Floating point number
546.789
Floating point number x = 546.789
x%2.0 = 0.78900146484375
int value z = 546
z%2 = 0

D:\java>java PercentOperator
Enter a Floating point number
2335.797
Floating point number x = 2335.797
x%2.0 = 1.797119140625
int value z = 2335
z%2 = 1

D:\java>java PercentOperator
Enter a Floating point number
-976.876
Floating point number x = -976.876
x%2.0 = -0.8759765625
int value z = -976
z%2 = 0
*/