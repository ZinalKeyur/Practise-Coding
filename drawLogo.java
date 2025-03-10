import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class drawLogo extends JFrame{
	
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
		
		//canvas.drawOval(Ring_One_X, Ring_One_Y,Ring_Diameter);

		canvas.drawOval(Ring1_X, Ring1_Y, Ring1_Diameter, Ring1_Diameter);
		canvas.fillOval(Ring2_X, Ring2_Y, Ring2_Diameter, Ring2_Diameter);
		canvas.drawArc(Arc_Up_X, Arc_Up_Y, Arc_Diameter, Arc_Diameter,180,180);
		canvas.drawArc(Arc_Down_X, Arc_Down_Y, Arc_Diameter, Arc_Diameter,0,180);
		canvas.drawArc(Arc_Left_X, Arc_Left_Y, Arc_Diameter, Arc_Diameter,270,180);
		canvas.drawArc(Arc_Right_X, Arc_Right_Y, Arc_Diameter, Arc_Diameter,90,180);
		
	}
	
	public drawLogo(){
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args){
		drawLogo guiWindow = new drawLogo();
		guiWindow.setVisible(true);
	}
}