import java.util.Scanner;

public class Subtract
{

public static void main(String[] args)
{

System.out.println("I am going to find sum of 2 integers of your choice");

Scanner keyboard = new Scanner(System.in);
int n1,n2;

System.out.println("Type first number");
n1=keyboard.nextInt();
System.out.println("Type second number");
n2=keyboard.nextInt();

System.out.println("The anshwer is ");
System.out.println(n1-n2);


}

}
