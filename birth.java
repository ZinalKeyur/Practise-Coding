import java.util.Scanner;

public class birth{
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

int y,n;
System.out.println("Birth year ? ");
y = keyboard.nextInt();
System.out.println("Input an age for which you want to calculate the year");
n = keyboard.nextInt();

int birth = y+n;
System.out.println("User will be " +n+ " in year " +birth);

}
}