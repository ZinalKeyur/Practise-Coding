/*

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?

*/

public class majorityElement{
public static void main(String[] args){

//int[] nums = {2,2,1,1,1,2,2,3,4,5,3,4,5,7,2,2,2,2,2,2,2,2};
int [] nums = {3,2,3};

// Sorting the array first


int temp;
for (int i=0; i<nums.length; i++){
	for (int j=i+1; j<nums.length; j++){
		if (nums[i]>nums[j]){
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
	
}

// nums.sort()   this should work in javascript.

int max = 0, count = 0, element = nums[0];

for (int i=0; i<nums.length; i++){
	
	int number = nums[i];
	
	while ( i < nums.length && number == nums[i]){
	
	System.out.println("Added " +nums[i]+ " from position " +i+ " and now count = " + (count+1));
	count++;i++;
	}
	
	if (max < count){
		max = count;
		element = number;
	}
	
	count = 0;
	i--;
	
}


System.out.println(" number " +element+ " repeats " +max+ " times");

}
}