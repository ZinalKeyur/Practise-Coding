/*
An Applet runs a web interface
JFrame runs a window locally that we define.

Draw a happyface
*/


/* ideally below code should work with JApplet but gives error
error: Class names, 'HappyFace', are only accepted if annotation processing is explicitly requested
1 error


import javax.swing.JApplet;
import java.awt.Graphics;
public class HappyFace extends JApplet{
	
	public void paint(Graphics canvas){
		canvas.drawOval(100, 50, 200, 200);
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.drawArc(150, 160, 100, 50, 180, 180);
	}
}
*/

//JFrame worked instead


import javax.swing.JFrame;
import java.awt.Graphics;

public class HappyFace extends JFrame{
	/*
	public void paint(Graphics canvas){
		canvas.drawOval(100, 50, 200, 200);
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.drawArc(150, 160, 100, 50, 180, 180);
	*/
		
	// Either use above or define final values for each
	

	public static final int X_Face = 100;
	public static final int Y_Face = 50;
	public static final int Face_Diameter = 200;
	
	public static final int X_leftEye = 155;
	public static final int Y_leftEye = 100;
	public static final int eyeWidth = 10;
	public static final int eyeHeight = 20;	
	public static final int X_rightEye = 230;
	public static final int Y_rightEye = Y_leftEye;
	
	public static final int X_smile = 150;
	public static final int Y_smile = 160;
	public static final int smileWidth = 100;
	public static final int smileHeight = 50;
	public static final int smileStartAngle = 180;
	public static final int smileExtentAngle = 180;
	
	public void paint(Graphics canvas){
		canvas.drawOval(X_Face, Y_Face, Face_Diameter, Face_Diameter);
		canvas.fillOval(X_leftEye, Y_leftEye, eyeWidth, eyeHeight);
		canvas.fillOval(X_rightEye, Y_rightEye, eyeWidth, eyeHeight);
		canvas.drawArc(X_smile, Y_smile, smileWidth, smileHeight, smileStartAngle, smileExtentAngle);
	
	}
	
	// Now define below the size of window which will open, i tried without it and can see in background tht something is open but not visible naked eye.
	
	public HappyFace(){
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main (String[] args){
		HappyFace guiWindow = new HappyFace();
		guiWindow.setVisible(true);
	}
	
}