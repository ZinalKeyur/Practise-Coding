// Draw samw logo as in drawLogo but ask user belowquestions and take y/n answers.

// Change color of solid center circle from black to red ?
// change color of outer circle from black to blue ?
// Change color of arcs from black to green ?


import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Scanner;

public class drawLogoColored extends JFrame{
	
	public static final int Ring1_Diameter = 100;
	public static final int Ring2_Diameter = 60;
	public static final int Ring1_X = 200;
	public static final int Ring1_Y = 200;
	public static final int Ring2_X = 220;
	public static final int Ring2_Y = 220;
	public static final int Arc_Up_X = 150;
	public static final int Arc_Up_Y = 0;
	public static final int Arc_Down_X = 150;
	public static final int Arc_Down_Y = 300;
	public static final int Arc_Left_X = 0;
	public static final int Arc_Left_Y = 150;
	public static final int Arc_Right_X = 300;
	public static final int Arc_Right_Y = 150;
	public static final int Arc_Diameter = 200;
	
	// above static values should be initialized inside class and outside main method.

	public void paint (Graphics canvas){             // Dont have main method ?
		

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println (" Change color of solid center circle from black to red ? Type Yes or No " );
		String outCircle = keyboard.next();
		System.out.println (" Change color of outer circle from black to blue ? Type Yes or No " );
		String inCircle = keyboard.next();
		System.out.println (" Change color of arcs from black to green ? Type Yes or No ");
		String arc = keyboard.next();

		if ((outCircle.toUpperCase()).charAt(0) == 'Y') canvas.setColor(Color.RED);
		else canvas.setColor(Color.BLACK);
		canvas.fillOval(Ring1_X, Ring1_Y, Ring1_Diameter, Ring1_Diameter);
		
		if ((inCircle.toUpperCase()).charAt(0) == 'Y') canvas.setColor(Color.BLUE);
		else canvas.setColor(Color.BLACK);
		canvas.fillOval(Ring2_X, Ring2_Y, Ring2_Diameter, Ring2_Diameter);
	
		if ((arc.toUpperCase()).charAt(0) == 'Y') canvas.setColor(Color.GREEN);
		else canvas.setColor(Color.BLACK);
		canvas.fillArc(Arc_Up_X, Arc_Up_Y, Arc_Diameter, Arc_Diameter,180,180);
		canvas.fillArc(Arc_Down_X, Arc_Down_Y, Arc_Diameter, Arc_Diameter,0,180);
		canvas.fillArc(Arc_Left_X, Arc_Left_Y, Arc_Diameter, Arc_Diameter,270,180);
		canvas.fillArc(Arc_Right_X, Arc_Right_Y, Arc_Diameter, Arc_Diameter,90,180);
		
		// it is asking inputs 3 times i am not sure why
	}
	
	public drawLogoColored(){
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args){
		drawLogoColored guiWindow = new drawLogoColored();
		guiWindow.setVisible(true);
	}
}