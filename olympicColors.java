// Draw an Olympic symbol with 5 rings in colour blue,yellow,black,green,red from left to right.

/*
Pred-defined colors for setColor mathod of JApplet Color
Color.BLACK
Color.BLUE
Color.CYAN
Color.DARK_GRAY
Color.GRAY
Color.GREEN
Color.LIGHT_GRAY
Color.MAGENTA
Color.ORANGE
Color.PINK
Color.RED
Color.WHITE
Color.YELLOW
*/



//Try with Applet and jFrame

/*
java.lang.Object
java.awt.Component
java.awt.Container
java.awt.Panel
java.applet.Applet
javax.swing.JApplet



With JAPPLET GETTING ERROR
 // Error: Main method not found in class olympicColors, please define the main method as: public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
 
*/
 

import javax.swing.JApplet; 
import java.awt.Graphics;
import java.awt.Color;

public class olympicColors extends JApplet{
		
	public static final int Ring_Diameter = 100;
	public static final int Ring_One_X = 50;
	public static final int Ring_One_Y = 50;
	public static final int Ring_Two_X = 170;   // 50 + 100 + 20 distance in between;
	public static final int Ring_Two_Y = Ring_One_Y;
	public static final int Ring_Three_X = 290;  // 170 + 100 + 20 distance in between;
	public static final int Ring_Three_Y = Ring_One_Y;
	public static final int Ring_Four_X = 110;
	public static final int Ring_Four_Y = 100;
	public static final int Ring_Five_X = 240;
	public static final int Ring_Five_Y = Ring_Four_Y;
	
	// above static values should be initialized inside class and outside main method.

	public void paint (Graphics canvas){             // Dont have main method ?
		
		//canvas.drawOval(Ring_One_X, Ring_One_Y,Ring_Diameter);

		canvas.fillOval(Ring_One_X, Ring_One_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.BLUE);
		canvas.fillOval(Ring_Two_X, Ring_Two_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.YELLOW);
		canvas.fillOval(Ring_Three_X, Ring_Three_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.BLACK);
		canvas.fillOval(Ring_Four_X, Ring_Four_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.GREEN);
		canvas.fillOval(Ring_Five_X, Ring_Five_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.RED);
		
	}
	
}




/*
// note : 
SetColor first and than drawOval to get right colours in right circles
*/


// Works good with JFrame. :)
/*

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class olympicColors extends JFrame{
		
	public static final int Ring_Diameter = 100;
	public static final int Ring_One_X = 50;
	public static final int Ring_One_Y = 50;
	public static final int Ring_Two_X = 170;   // 50 + 100 + 20 distance in between;
	public static final int Ring_Two_Y = Ring_One_Y;
	public static final int Ring_Three_X = 290;  // 170 + 100 + 20 distance in between;
	public static final int Ring_Three_Y = Ring_One_Y;
	public static final int Ring_Four_X = 110;
	public static final int Ring_Four_Y = 100;
	public static final int Ring_Five_X = 240;
	public static final int Ring_Five_Y = Ring_Four_Y;
	
	// above static values should be initialized inside class and outside main method.
	
	public void paint(Graphics canvas){
		
		canvas.setColor(Color.RED);
		canvas.fillOval(Ring_One_X, Ring_One_Y, Ring_Diameter, Ring_Diameter);
		canvas.drawOval(Ring_One_X, Ring_One_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.BLUE);
		canvas.fillOval(Ring_Two_X, Ring_Two_Y, Ring_Diameter, Ring_Diameter);
		canvas.drawOval(Ring_Two_X, Ring_Two_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.YELLOW);
		canvas.fillOval(Ring_Three_X, Ring_Three_Y, Ring_Diameter, Ring_Diameter);
		canvas.drawOval(Ring_Three_X, Ring_Three_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.BLACK);
		canvas.fillOval(Ring_Four_X, Ring_Four_Y, Ring_Diameter, Ring_Diameter);
		canvas.drawOval(Ring_Four_X, Ring_Four_Y, Ring_Diameter, Ring_Diameter);
		canvas.setColor(Color.GREEN);
		canvas.fillOval(Ring_Five_X, Ring_Five_Y, Ring_Diameter, Ring_Diameter);
		canvas.drawOval(Ring_Five_X, Ring_Five_Y, Ring_Diameter, Ring_Diameter);
		
	}
	
	public olympicColors(){                         // created a function() which will initiate a window in our computer instead of internet.
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		olympicColors guiWindow = new olympicColors();        // Calling the function to start the window.
		guiWindow.setVisible(true);
	}
	
}
*/