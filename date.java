// Take string date input mm/dd/yy and output in format dd.mm.yy

import javax.swing.JOptionPane;

public class date{
	
	public static void main (String[] args){
	
	String date1 = JOptionPane.showInputDialog(" Give any date in format mm/dd/yy ");
	
	String date2 = date1.substring(3,5)+ "." +date1.substring(0,2)+ "." +date1.substring(6);
	
	JOptionPane.showMessageDialog(null, date2);
	
	System.exit(0);
	
	// but what if user gives month above 12, day above 31 ? we are not calculating the errors here this is just string reframing activity.
	}
}

