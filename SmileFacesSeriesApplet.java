// Note a new method called drawString used to write a text in the drawing

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;


public class SmileFacesSeriesApplet extends JFrame{
	

	public static final int FACE_DIAMETER = 100;
	public static final int FACE_X_AXIS = 50;
	public static final int FACE_Y_AXIS = 50;
	public static final int RIGHT_EYE_HEIGHT = 10;
	public static final int RIGHT_EYE_WIDTH = 10;
	public static final int RIGHT_EYE_X_AXIS = 83;
	public static final int RIGHT_EYE_Y_AXIS = 80;
	public static final int LEFT_EYE_HEIGHT = 10;
	public static final int LEFT_EYE_WIDTH = 10;
	public static final int LEFT_EYE_X_AXIS = 117;
	public static final int LEFT_EYE_Y_AXIS = 80;
	public static final int SMILE_X_AXIS = 83;
	public static final int SMILE_Y_AXIS = 110;
	public static final int SMILE_WIDTH = 35;
	public static final int SMILE_HEIGHT  = 0;
	public static final int SMILE_START_ANGLE = 180;
	public static final int SMILE_EXTEND_ANGLE = 180;
	
	public static final int CHANGE_FACE_X_AXIS = 110;   // Because first face wis 100 diameter and next 10 space between it.
	public static final int CHANGE_FACE_Y_AXIS = 110;   // Because first face wis 100 diameter and next 10 space between it.
	public static final int CHANGE_SMILE_HEIGHT = 5;
	
	int faceCount = 7;
			
	public void paint(Graphics canvas){
		
		for (int i = 0; i < faceCount; i++){
			
			if (i % 2 != 0){
			canvas.setColor(Color.GREEN);
			}
			else{
			canvas.setColor(Color.YELLOW);
			}
			canvas.fillOval(FACE_X_AXIS + (i * CHANGE_FACE_X_AXIS),FACE_Y_AXIS + (i * CHANGE_FACE_X_AXIS),FACE_DIAMETER,FACE_DIAMETER);
			canvas.setColor(Color.BLACK);
			canvas.fillOval(LEFT_EYE_X_AXIS + (i * CHANGE_FACE_X_AXIS),LEFT_EYE_Y_AXIS + (i * CHANGE_FACE_X_AXIS),LEFT_EYE_WIDTH,LEFT_EYE_HEIGHT);
			canvas.fillOval(RIGHT_EYE_X_AXIS + (i * CHANGE_FACE_X_AXIS),RIGHT_EYE_Y_AXIS + (i * CHANGE_FACE_X_AXIS),RIGHT_EYE_WIDTH,RIGHT_EYE_HEIGHT);
			
			if (i < 5){
			canvas.drawArc(SMILE_X_AXIS + (i * CHANGE_FACE_X_AXIS),SMILE_Y_AXIS + (i * CHANGE_FACE_Y_AXIS),SMILE_WIDTH,SMILE_HEIGHT + (i * CHANGE_SMILE_HEIGHT),SMILE_START_ANGLE,SMILE_EXTEND_ANGLE);
			}
			else if (i == 5){
			canvas.drawArc(SMILE_X_AXIS + (i * CHANGE_FACE_X_AXIS),SMILE_Y_AXIS + (i * CHANGE_FACE_Y_AXIS) - 5,SMILE_WIDTH,SMILE_HEIGHT + (i * CHANGE_SMILE_HEIGHT) - 5 ,270,180);
			canvas.drawArc(SMILE_X_AXIS + (i * CHANGE_FACE_X_AXIS),SMILE_Y_AXIS + (i * CHANGE_FACE_Y_AXIS) + 5,SMILE_WIDTH,SMILE_HEIGHT + (i * CHANGE_SMILE_HEIGHT) - 5 ,270,180);
			canvas.drawString("Sending Kisses",FACE_X_AXIS + (i * CHANGE_FACE_X_AXIS),FACE_Y_AXIS + (i * CHANGE_FACE_X_AXIS));
			
			}
			else{
			canvas.fillOval(SMILE_X_AXIS + (i * CHANGE_FACE_X_AXIS),SMILE_Y_AXIS + (i * CHANGE_FACE_Y_AXIS),SMILE_WIDTH,SMILE_HEIGHT + (i * CHANGE_SMILE_HEIGHT));
			canvas.drawString("You are Charming",FACE_X_AXIS + (i * CHANGE_FACE_X_AXIS),FACE_Y_AXIS + (i * CHANGE_FACE_X_AXIS));
				
			}
			
					
		}
	}
	
	public SmileFacesSeriesApplet(){
		setSize(1000,1000);    // We ultimately want (7 faces *100) + 50+50 spaces in top bottom right and left = 800*800 window atleast.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args){
		SmileFacesSeriesApplet drawing = new SmileFacesSeriesApplet();
		drawing.setVisible(true);
	}
}
