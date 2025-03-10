//Assign a binary code in some orderly manner to the 52 playing cards. Use the minimum number of bits. (4)

/*
//NOTWROKING


So we have heart, diamond, spades, clubs. Each have 13 cards (1=A, 2-10,11=J,12=Q,13=K.)
4-bit binary can have only 8 values. So lets use 8 bit binary with range of 255 values
*/

public class binaryCards{
	
	public static void main(String[] args){
	
	int dec=0;
	String[] signs = {hearts,diamonds,spades,clubs};  // Array declaration is not happening correctly. Need to come again once array is learnt.
	for (int j=0; j<signs.length(); j++){
	for (int i=0; i<13; i++){
	dec = dec+1;
	System.out.println(signs[j]+ " " +(i+1)+ " = " +dec);
	}
	}
	}
}