import java.util.Arrays;  // IMPORTANT


public class Sort {
    public static void main(String[] args) {
	
	int[] prices = {1,9,8,7,3,4,5,6};
	Arrays.sort(prices);
	System.out.println(" Sort array " );
	for (int x : prices)System.out.println(x);
						   
    }
}