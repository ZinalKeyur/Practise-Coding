//Find second largest element in a stream of array

import java.util.Arrays;
import java.util.List;

public class Streamsortarray{
	public static void main (String[] argg){
		
		List<Integer> nums = Arrays.asList(1,17,98,89,0,4,-7);
		
		
		//find second largest element in List
		
		
		final Integer secondLargest = nums.stream()
			.distinct()
			//.sorted()			// Sorts in ascending order
			.sorted((a,b)->Integer.compare(b,a))	// sort in descending order
			.skip(n: 1)
			.findFirst() Optional<Integer>
			.orElse(other: null);
	
		
		System.out.println(secondLargest);
	}		

}