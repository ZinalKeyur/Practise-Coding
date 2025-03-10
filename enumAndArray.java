public class enumAndArray{
	
	enum enumCards {Clubs,Spades,Diamonds,Hearts}   
	//enum enumNumbers {0.05,5,7,90,89,0}   // **** error identifier expected******
	//***** Note that it needs no "=" or ";" or "" to enclose String******
	
	public static void main (String[] args){
		
		System.out.println("Using for each loop in enum ");
		//enum enumCards {Clubs,Spades,Diamonds,Hearts}    //*******error: enum types must not be local******
		
		// for each statement in enum
		for (enumCards card : enumCards.values()){
		System.out.println(card+ " ");}
		
		System.out.println("Using for each loop in Array ");
		String[] arrayCards = {"Clubs","Spades","Diamonds","Hearts"};
		double[] arrayNumbers = {0.05,5,7,90,89,0};
		// Note the quotation mark, = sign, ; at the end, and {}.
		//**** with [] or () getting error: illegal start of expression*****
		
		//for-each statement tests
		for (String card : arrayCards){
		System.out.println(card+ " ");}
		for (double number : arrayNumbers){
		System.out.println(number+ " ");}
		
		
		/*
		in Javascriot we would write
		for each (number in arrayNumbers){
		System.out.println(number+ " ");
		}
	}
}a