// Find cylinder height and cylinder cost. Given radius and volume.

// h = V / Pi * r * R;
// C = 2 * Pi * r (r + h);

import java.util.Scanner;
import javax.swing.JOptionPane;

public class cylinderVolume{
	
	public static final double Pi = 3.14;
	public static void main(String[] args){
	
	double height, cost;
	Scanner keyboard = new Scanner(System.in);
	
	int choice = JOptionPane.showConfirmDialog(null," Do you want to compute the volume cylinder, DO you have Radiua dn Volume details ?");
					  
	if (choice == 0){
		
		System.out.println(" Volume = ? ");
		double volume = keyboard.nextDouble();
		System.out.println(" Radius = ? ");
		double radius = keyboard.nextDouble();
		
		height = volume / (Pi * radius * radius);
		cost = 2 * Pi * radius * (radius + height);
		
		System.out.println(" Height = " +height);
		System.out.println(" Cost = " +cost);
	
	}
	
	else if (choice == 1){
	
		System.out.println(" You dont have the values handy. ok come back later");
	}
	else {
		System.out.println(" You dont want to calculate the cost and height. its ok.");
	}

	
	}
}


