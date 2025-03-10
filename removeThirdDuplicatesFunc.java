/*
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

*/

// NOTE : here we are allowing 3 repetations, if you want 2 or 1, just change value of "allow in line 13 and 38

public class removeThirdDuplicatesFunc{
public static void main (String[] args){
	
	int[] nums = {0,0,0,0,0,0,1,1,2,2,7,7,7,7,9,9,11,11,11};	
	
	// nums is already sorted increasingly
 
	// modifying to allow n occurences. 
	
	int k=0;
	int allow=3;
	
	int number = nums[0];
	
	for (int i=0, j=0; i<nums.length && j<nums.length; i++){
		
		// adding allowed number of repetations if any
		while(allow != 0 && i<nums.length && number == nums[i]){
		nums[j] = number;
		//System.out.println(" Added " +nums[j]+ " at j " +j+ " from i " +i);
		k++;
		i++;
		j++;
		allow--;
		}
		
		// Skipping othe occurences if any
		while (i<nums.length && number == nums[i]){
		//System.out.println(" Skipping " +nums[i]+ " at i " +i);
		nums[j] = number;
		i++;
		}
		
		//System.out.println(" i = " +i+ " allow = " +allow+ " j = " +j+ " k = " +k);
		
		allow = 3;
		
		if (i < nums.length) number = nums[i];
		i--; // it is because we increased and assigned ith value from nums to number. but in next for loop it will again increase i. so keeping it in original form.
		
		
	}
	
	for (int x : nums) {System.out.println(x);}
	System.out.println(" k = " +k);
}
}


/*
public class removeThirdDuplicatesFunc{
public static void main (String[] args){
	
	int[] nums = {0,1,2,2,7,7,7,7,9,9,11,11,11};	
	
	// nums is already sorted increasingly
 
	//int[] oldArray = nums;  // important we are asked to use a constant variable instead of a complete new array. use O(1)
	int k=0;
	
	for ( int i=0,j=0; i<nums.length; i++,j++){
		
		// Adding first occurence
		
		nums[j] = nums[i];
		k++;
		
		// Adding Second occurence if any
		if ( i+1 < nums.length && nums[i] == nums[i+1]){
		nums[j+1] = nums[i+1];
		i++;j++;k++;
		}
		
		//Ignoring all other occurences
		while ( i+1 < nums.length && nums[i] == nums[i+1] ){
		i++;
		}
	}
	
	for (int x : nums) {System.out.println(x);}
	System.out.println(" k = " +k);
}
}

*/

/*

public class removeThirdDuplicatesFunc{
public static void main (String[] args){
	
	int[] nums = {0,1,2,2,7,7,7,7,9,9,11,11,11};	
	
	// nums is already sorted increasingly
 
	int[] oldArray = nums;  // important we are asked to use a constant variable instead of a complete new array.
	int k=0;
	

// NOte that array is sorted in ascending order so no need to traverse i for entire array. increase i if you see third occurence and start from there.

	for (int i=0, j=0; i<oldArray.length; j++, i++){
		
		// Adding first occurence
		
		nums[j] = oldArray[i];
		System.out.println(" Adding " +oldArray[i]+ " at position " +j+ " in for loop ");
		k++;
		// Adding second occurence if any
		
		if ( oldArray.length < i+1 && oldArray[i] == oldArray[i+1]){
		nums[j+1] = oldArray[i+1];
		i++;j++;k++;
		}
		
		// ignoring all other occurences
		
		while ( i+2 < oldArray.length && oldArray[i+1] == oldArray[i+2] && oldArray [i] == oldArray[i+2] ){
			System.out.println("Came in while loop");
			i++;
		}
		
	}

	for (int x : nums) {System.out.println(x);}
	System.out.println(" k = " +k);
}
}

*/

/* incase when user gives inputs

class Solution {
    public int removeDuplicates(int[] nums) {
	
	// nums is already sorted increasingly
 
	int[] oldArray = nums;
	int k=0;
	
	for (int i=0, j=0; i<oldArray.length; j++, i++){
		
		// Adding first occurence
		
		nums[j] = oldArray[i];
		System.out.println(" Adding " +oldArray[i]+ " at position " +j+ " in for loop ");
		k++;

		// Adding second occurence if any
		
		if ( oldArray.length < i+1 && oldArray[i] == oldArray[i+1]){
		nums[j+1] = oldArray[i+1];
		i++;j++;k++;
		}
		
		// ignoring all other occurences
		
		while ( i+2 < oldArray.length && oldArray[i+1] == oldArray[i+2] && oldArray [i] == oldArray[i+2] ){
			System.out.println("Came in while loop");
			i++;
		}
		
	}
	
    return k;
    }
}

*/

/* in javascript

var removeDuplicates = function(nums) {
	
	// nums is already sorted increasingly
 
	var oldArray = nums;
	var k=0;
	
	for (var i=0, j=0; i<oldArray.length; j++, i++){
		
		// Adding first occurence
		
		nums[j] = oldArray[i];
		k++;
		// Adding second occurence if any
		
		if ( oldArray.length < i+1 && oldArray[i] == oldArray[i+1]){
		nums[j+1] = oldArray[i+1];
		i++;j++;k++;
		}
		
		// ignoring all other occurences
		
		while ( i+2 < oldArray.length && oldArray[i+1] == oldArray[i+2] && oldArray [i] == oldArray[i+2] ){

			i++;
		}
		
	}
    return k;
    
}

*/

/*
var removeDuplicates = function(nums) {

console.log (nums);

var limit = 2;
var count = 0;
var k = 0;

    if (nums.length <= limit) return nums.length;

    for (var i = 0,j=0; i< nums.length && j< nums.length; i++,j++){
    var current = nums[i];

    while (count < limit && current == nums[i] && i< nums.length && j < nums.length){   // Allow number to be in array for limit times
        nums[j] = nums[i];
        i++;j++
        count++;
        k++;
    }

  if (count >= limit) console.log (" current " + current+ " found " +limit+ " times. ");
  if (current != nums[i]) console.log (" current " +current+ " does not repeat anymore. ");

    while (current == nums[i] && i< nums.length){      // Disregard all other duplicate appearances
        console.log (" current " +current+ " still repeats further and will be neglected"); 
        i++;
    }

    nums[k] = nums[i];    
    i--;j--; count =0;
    }

return k;

}

*/