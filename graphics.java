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
import javax.awt.Graphics;

public class loopGraphics extends JFrame{
	
	public static final int circleCount = 7;
	public static final  int firstDiameter = 50;
	public static final  int adjacentDiameterChange = 10;    // so diameters will be 50,60,70,80,90,100,110.
	public static final  int firstXCenter = 100;
	public static final  int adjacentCenter = 80;            // Adjacent circle centers should be evenly placed. 
	public static final  int firstYCenter = 100;   // This remains same throughout
	
	public static final boolean DEBUG = true;

	
	public void paint(Graphics canvas)
		
		if(DEBUG){
		for (int i = 0; i<= 6; i++ ){
		System.out.println("---------" +i+ "------------")
		System.out.println(firstXCenter + (i * adjacentCenter) - (firstDiameter + i * adjacentDiameterChange) / 2);
		System.out.println(firstYCenter - firstDiameter/2);
		System.out.println(firstDiameter + i * adjacentDiameterChange);
		System.out.println(firstDiameter + i * adjacentDiameterChange);
		}
		}
		
		for (int i = 0; i<= 6; i++ ){
		canvas.drawOval(firstXCenter + (i * adjacentCenter) - (firstDiameter + i * adjacentDiameterChange) / 2, firstYCenter - firstDiameter/2, firstDiameter + i * adjacentDiameterChange, firstDiameter + i * adjacentDiameterChange);
		}
		
	}
	
	public loopGraphics(){
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args)	{
		
		loopGraphics circles = new loopGraphics();
		circles.isVisible(true);
	}
	
}
