/* 
get weight in pounds
get height in feet space inch

inch = 12 * feet;
meters = 0.0254 * inches;
kg = pounds / 2.2;

Calculate BMI = mass in kg / height^2 in meters.
underweight < 18.5
normal weight >= 18.5 && <25
overweight >= 25 && < 30
obese >=30

*/

import java.util.Scanner;

public class BMI{
	public static void main(String[] args){
		
		int pounds, feet, inch;
		double massKg,heightMeters,BMI;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Give your weight in pounds");
		pounds = keyboard.nextInt();
		
		System.out.println(" Give your height in feet \n"
						 + " followed by a space \n"
						 + "then additional inches.");
		feet = keyboard.nextInt();
		inch = keyboard.nextInt();
		
		massKg = pounds / 2.2;
		heightMeters = ((feet * 12) + inch) * 0.0254;
		
		BMI = massKg / (heightMeters * heightMeters);
		
		if (BMI < 18.5)
			System.out.println("UnderWeight");
		else if (BMI < 25)
			System.out.println("Normal Weight");
		else if (BMI < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
	
}