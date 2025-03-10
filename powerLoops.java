// Obtain result = 2^5

public class powerLoops{
	
	public static void main (String[] args){
		
		double result = 1;
		double result2 = 1;
		
		for (int i = 1; i <= 5; i++){
			result = result * 2;
		}
		
		// OR
		
		result2 = Math.pow(2,5);
		
		System.out.println(" result : " +result);
		System.out.println(" result2 : " +result2);
	}
}