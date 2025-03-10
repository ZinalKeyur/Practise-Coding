/*  JOPTIONPANE is interesting :)

https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html#showOptionDialog-java.awt.Component-java.lang.Object-java.lang.String-int-int-javax.swing.Icon-java.lang.Object:A-java.lang.Object-

 Eg : 
		int	showOptionDialog(Component parentComponent,
					   Object message,
					   String title,
					   int optionType,
					   int messageType,
					   Icon icon,
					   Object[] options,
					   Object initialValue)
					   
		int	showConfirmDialog(Component parentComponent,
                        Object message)
						
		int showConfirmDialog(Component parentComponent, 
						Object message, String title, int optionType)

		int	showConfirmDialog(Component parentComponent, 
						Object message, String title, int optionType, int messageType)
			
		void showMessageDialog(Component parentComponent,
                                     Object message)
		
THERE ARE MANY MORE INTERESTING METHODS OF JOPTIONPANE

where 
messageType - the type of message to be displayed: ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, or PLAIN_MESSAGE
optionType - the options to display in the pane: DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
		
*/

import javax.swing.JOptionPane;

public class JOptionPane_Yes_NO extends JOptionPane{
	
	public static void main(String[] args){
		
		int response1 = JOptionPane.showConfirmDialog(null,"You like icecream ? ","Icecream",JOptionPane.YES_NO_OPTION);  // Note that this is always mostly int response yes or no not a string.
		
		boolean accept = true;
		
		if (response1 == JOptionPane.YES_OPTION)  // So you are comparing string and int. not possible.
			accept = true;
		else
			accept = false;
		
		JOptionPane.showMessageDialog(null,"accept = " +accept); 
		
		// MOST IMP NOTE HOW WE CHANGE OUR BUTTONS, SIGNS, and FRAME type
		
		if (accept){
		
		Object[] options1 = { "NO", "YES" };
		int response2 = JOptionPane.showOptionDialog(null, " 1 scoop Icecream = 300 cal, shall we proceed ? ", "Warning",
             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
             null, options1, options1[0]);
		
		// response2 = 0 for first element and 1 for second
		
			 if (response2 == 1){
			
			Object[] options2 = { "Y", "N" };
			int response3 = JOptionPane.showOptionDialog(null, "Are you sure ?", "Assure Again",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, options2, options2[0]);								
				
				if(response3 == 0){
					JOptionPane.showMessageDialog(null,"Fine!! Have it your way");
					
			//Object[] options3 = { "YES", "NO", "CANCEL" };   // using default yes_NO_CANCEL option type
			int response4 = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Assure Again",
				JOptionPane.YES_NO_CANCEL_OPTION);
				
			JOptionPane.showMessageDialog(null,"response4 = " +response4);

			// response4 = 0 for YES, 1 for NO, 2 for CANCEL... :)
				
				}
			 }
		}
		
		System.exit(0);
		
	}
}