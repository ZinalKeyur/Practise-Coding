/*
Draw a snowman
*/

//JApplet is not working for me
//JFrame worked instead


import javax.swing.JFrame;
import java.awt.Graphics;

public class snowMan extends JFrame{
	/*
	public void paint(Graphics canvas){
		canvas.drawOval(300, 50, 200, 200);
		canvas.fillOval(355, 100, 10, 20);
		canvas.fillOval(430, 100, 10, 20);
		canvas.drawArc(350, 160, 100, 50, 180, 180);
		canvas.drawOval(250, 250, 300, 300);
		canvas.drawOval(200, 550, 400, 400);
	}
	*/

	
		
	// Either use above or define final values for each
	
	

	public static final int X_Face = 300;
	public static final int Y_Face = 50;
	public static final int Face_Diameter = 200;
	
	public static final int X_leftEye = 355;
	public static final int Y_leftEye = 100;
	public static final int eyeWidth = 10;
	public static final int eyeHeight = 20;	
	public static final int X_rightEye = 430;
	public static final int Y_rightEye = Y_leftEye;
	
	public static final int X_smile = 350;
	public static final int Y_smile = 160;
	public static final int smileWidth = 100;
	public static final int smileHeight = 50;
	public static final int smileStartAngle = 180;
	public static final int smileExtentAngle = 180;
	
	public static final int X_upperBody = 250;
	public static final int Y_upperBody = 250;
	public static final int upperBody_Diameter = 300;
	public static final int X_lowerBody = 200;
	public static final int Y_lowerBody = 550;
	public static final int lowerBody_Diameter = 400;
	
	public void paint(Graphics canvas){
		canvas.drawOval(X_Face, Y_Face, Face_Diameter, Face_Diameter);
		canvas.fillOval(X_leftEye, Y_leftEye, eyeWidth, eyeHeight);
		canvas.fillOval(X_rightEye, Y_rightEye, eyeWidth, eyeHeight);
		canvas.drawArc(X_smile, Y_smile, smileWidth, smileHeight, smileStartAngle, smileExtentAngle);
		canvas.drawOval(X_upperBody, Y_upperBody, upperBody_Diameter, upperBody_Diameter);
		canvas.drawOval(X_lowerBody, Y_lowerBody, lowerBody_Diameter, lowerBody_Diameter);
		
	}
	
	
	// Now define below the size of window which will open, i tried without it and can see in background tht something is open but not visible naked eye.
	
	public snowMan(){
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main (String[] args){
		snowMan guiWindow = new snowMan();
		guiWindow.setVisible(true);
	}	
}
