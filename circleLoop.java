// Note a new method called drawString used to write a text in the drawing

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;


public class circleLoop extends JFrame{
	

	public static final int FACE_DIAMETER = 100;
	public static final int FACE_X_AXIS = 50;
	public static final int FACE_Y_AXIS = 50;
	
	
	public static final int CHANGE_FACE_X_AXIS = 110;
	//public static final int CHANGE_FACE_Y_AXIS = 110;   // We want 7 identical circles on same line
	
	int circleCount = 7;
			
	public void paint(Graphics canvas){
		
		for (int i = 0; i < circleCount; i++){
			
			
			canvas.setColor(Color.GREEN);
			canvas.fillOval(FACE_X_AXIS + (i * CHANGE_FACE_X_AXIS),FACE_Y_AXIS,FACE_DIAMETER,FACE_DIAMETER);
			canvas.setColor(Color.BLACK);
			canvas.drawOval(FACE_X_AXIS + (i * CHANGE_FACE_X_AXIS),FACE_Y_AXIS,FACE_DIAMETER,FACE_DIAMETER);
			
		}
	}
	
	public circleLoop(){
		setSize(1000,1000);    // We ultimately want (7 faces *100) + 50+50 spaces in top bottom right and left = 800*800 window atleast.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args){
		circleLoop drawing = new circleLoop();
		drawing.setVisible(true);
	}
}
