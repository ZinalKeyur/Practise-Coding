/*
Draw a olympic symbol
*/

//JApplet is not working for me
//JFrame worked instead


import javax.swing.JFrame;
import java.awt.Graphics;

public class olympic extends JFrame{
	/*
	public void paint(Graphics canvas){
		
		// I am not getting number right but this is the method
		canvas.drawOval(50, 50, 100, 100);
		canvas.drawOval(175, 50, 100, 100);
		canvas.drawOval(300, 50, 100, 100);
		canvas.drawOval(200, 100, 100, 100);
		canvas.drawOval(275, 100, 100, 100);
	}
	*/

	
		
	// Either use above or define final values for each


	public static final int diameter = 100;
	public static final int X_circle1 = 50;
	public static final int Y_circle1 = 50;
	public static final int X_circle2 = 175;
	public static final int Y_circle2 = Y_circle1;
	public static final int X_circle3 = 300;
	public static final int Y_circle3 = Y_circle1;
	public static final int X_circle4 = 200;
	public static final int Y_circle4 = 100;
	public static final int X_circle5 = 275;
	public static final int Y_circle5 = Y_circle4;
	
	public void paint(Graphics canvas){
		canvas.drawOval(X_circle1, Y_circle1, diameter, diameter);
		canvas.drawOval(X_circle2, Y_circle3, diameter, diameter);
		canvas.drawOval(X_circle3, Y_circle3, diameter, diameter);
		canvas.drawOval(X_circle4, Y_circle4, diameter, diameter);
		canvas.drawOval(X_circle5, Y_circle5, diameter, diameter);
	}
	
	// Now define below the size of window which will open, i tried without it and can see in background tht something is open but not visible naked eye.
	
	public olympic(){
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main (String[] args){
		olympic guiWindow = new olympic();
		guiWindow.setVisible(true);
	}	
}
