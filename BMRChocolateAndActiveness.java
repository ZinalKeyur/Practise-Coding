/*

Take an input of gender, weight height,age and level of activeness.


Calories required for maintainging weight. given age height and weight
Man   BMR = 66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)
Woman BMR = 655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)


ACtiveness ->
a - Sedentary -> BMR + 20percent of calculated BMR.
b - Somewhat Active(Exercise occasionally) -> BMR + 30percent of calculated BMR.
c - Active(Exercise 3-4 days per week) -> BMR + 40percent of calculated BMR.
d - Highly Active(Exercise every day) -> BMR + 50percent of calculated BMR.

1 chocolate = 230 calories. How many chocolates needed to maintain weight ?
*/

 


import javax.swing.JOptionPane;

public class BMRChocolateAndActiveness{
	
	public static void main (String[] args){
	
	double w,h,a,womanBmr, manBmr;
	
	String weight = JOptionPane.showInputDialog(" Weight in pounds ? ");
	String height = JOptionPane.showInputDialog(" Height in inches ? ");
	String age = JOptionPane.showInputDialog(" Age in years ? ");
	
	Object[] genderOption = {"F", "M","Not Sure"};
	int gender = JOptionPane.showOptionDialog(null," What is your gender ? ", "Gender",
													JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
													null,genderOption,genderOption[0]);
													
	Object[] activeOption = {"a", "b", "c", "d"};
	int Activeness = JOptionPane.showOptionDialog(null," How active are you from below options ? \n"
													 + " a - Sedentary \n"
													 + " b - Somewhat Active(Exercise occasionally) \n"
													 + " c - Active(Exercise 3-4 days per week) \n"
													 + " d - Highly Active(Exercise every day) ",
													 "Gender",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
													 null,activeOption,activeOption[0]);
	
	// need these strings in numbers. 
	
	w = Double.parseDouble(weight);
	h = Double.parseDouble(height);
	a = Double.parseDouble(age);
	
	womanBmr = 655 + (4.3 * w) + (4.7 * h) - (4.7 * a);
	manBmr = 66 + (6.3 * w) + (12.9 * h) - (6.8 * a);
	
	if (Activeness == 0){
		
		if (gender == 0)JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.2))/230)+ " chocolates.");
		else if (gender == 1)JOptionPane.showMessageDialog(null," Man need atleast " + (int)((manBmr + (manBmr * 0.2))/230)+ " chocolates");
		else JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.2))/230)+ " chocolates \n"
										  + " Man need atleast " + (int)((manBmr + (manBmr * 0.2))/230)+ " chocolates");
	}
	
	else if (Activeness == 1){
		
		if (gender == 0)JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.3))/230)+ " chocolates.");
		else if (gender == 1)JOptionPane.showMessageDialog(null," Man need atleast " + (int)((manBmr + (manBmr * 0.3))/230)+ " chocolates");
		else JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.3))/230)+ " chocolates \n"
										  + " Man need atleast " + (int)((manBmr + (manBmr * 0.3))/230)+ " chocolates");
	}
	
	else if (Activeness == 2){
		
		if (gender == 0)JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.4))/230)+ " chocolates.");
		else if (gender == 1)JOptionPane.showMessageDialog(null," Man need atleast " + (int)((manBmr + (manBmr * 0.4))/230)+ " chocolates");
		else JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.4))/230)+ " chocolates \n"
										  + " Man need atleast " + (int)((manBmr + (manBmr * 0.4))/230)+ " chocolates");
	}
	
	else{
		
		if (gender == 0)JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.5))/230)+ " chocolates.");
		else if (gender == 1)JOptionPane.showMessageDialog(null," Man need atleast " + (int)((manBmr + (manBmr * 0.5))/230)+ " chocolates");
		else JOptionPane.showMessageDialog(null," Woman need atleast " + (int)((womanBmr + (womanBmr * 0.5))/230)+ " chocolates \n"
										  + " Man need atleast " + (int)((manBmr + (manBmr * 0.5))/230)+ " chocolates");
	}
	
	System.exit(0);
	
	}
}
