/*
circleCount
firstDiameter
adjacentDiameterChange
firstXCenter   // Create cirscle horizontally
adjacentXCenter
firstYCenter   // This remains same throughout
*/

// They said applet but i am good in JFrame.

import javax.swing.JFrame;
import java.awt.Graphics;

public class loopGraphics extends JFrame{
	
	public static final int circleCount = 7;
	public static final  int firstDiameter = 50;
	public static final  int adjacentDiameterChange = 10;    // so diameters will be 50,60,70,80,90,100,110.
	public static final  int firstXCenter = 100;
	public static final  int adjacentCenter = 110;            // Adjacent circle centers should be evenly placed. 
	public static final  int firstYCenter = 500;   // This remains same throughout
	
	public static final boolean DEBUG = true;		
		
	public void paint(Graphics canvas){
	
		for (int i = 0; i<= 6; i++ ){
		canvas.drawOval(firstXCenter + (i * adjacentCenter) - (firstDiameter + i * adjacentDiameterChange) / 2, firstYCenter - firstDiameter/2, firstDiameter + i * adjacentDiameterChange, firstDiameter + i * adjacentDiameterChange);
		}
		
	}
	
	public loopGraphics(){
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args)	{
		
		
		loopGraphics guiWindow = new loopGraphics();
		guiWindow.setVisible(true);
		
			
		if(DEBUG){
		for (int i = 0; i<= circleCount - 1; i++ ){
		System.out.println("---------" +(i+1)+ "------------");
		System.out.println(firstXCenter + (i * adjacentCenter) - (firstDiameter + i * adjacentDiameterChange) / 2);  //x-axis staring point
		System.out.println(firstYCenter - firstDiameter/2);															 //y-axis starting point
		System.out.println(firstDiameter + i * adjacentDiameterChange);															
		System.out.println(firstDiameter + i * adjacentDiameterChange);
		}
		}
		
	}
	
}
