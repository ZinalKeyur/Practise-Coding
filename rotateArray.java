/////////// MOST IMPORTANT//////////////////////

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

4,5,6,7,1,2,3

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/

public class rotateArray{
public static void main(String[] args){
	
//int[] nums = {11,22,33,44,55,66,77};
int[] nums = {11,22};
int k = 3;

System.out.println("Original Array");
for (int x : nums)System.out.println(x);



//METHOD - 1 ->  directly estimating the first and last element instead of roating entire series.

/* IMPORTANT REMEMBER THIS LOGIC. confusion maybe because of position and index. index starts from 0.

For Right shift by k elements // Last k elements become first k elements
j = o to k-1 index will be assigned from i = k to n-1 index.
j = k to n-1 index will be assigned from i = 0 to k index.
*/

/*
For  left shift by k elements // First k elements become last k elements
j = o to k index will be assigned from i = k to n-1 index.
j = (n-k or k+1) to n-1 index will be assigned from i = 0 to k-1 index.
*/


////////////////////////////////////////////////////

/*
int[] rightShift = new int[nums.length];
int[] leftShift = new int[nums.length];

//RIGHT SHIFT
int j = 0;
for (int i = nums.length - k; i<nums.length; i++){
	
	rightShift[j] = nums[i];
	//System.out.println("Placing at rightShift[" +j+ "] = " +rightShift[j]+ " from  nums[" +i+ "] = " +nums[i]+ ".");
	j++;
}

for (int i = 0; i < nums.length - k; i++ ){
	
	rightShift[j] = nums[i];
    //System.out.println("Placing at rightShift[" +j+ "] = " +rightShift[j]+ " from  nums[" +i+ "] = " +nums[i]+ ".");
	j++;
}

System.out.println("Array after right shift by " +k+ " positions");
for (int x : rightShift)System.out.println(x);


//LEFT SHIFT
j = 0;
for (int i = k; i<nums.length; i++){
	
	leftShift[j] = nums[i];
	//System.out.println("Placing at leftShift[" +j+ "] = " +leftShift[j]+ " from  nums[" +i+ "] = " +nums[i]+ ".");
	j++;
}

for (int i = 0; i < k; i++ ){
	
	leftShift[j] = nums[i];
    //System.out.println("Placing at leftShift[" +j+ "] = " +leftShift[j]+ " from  nums[" +i+ "] = " +nums[i]+ ".");
	j++;
}

System.out.println("Array after right shift by " +k+ " positions");
for (int x : leftShift)System.out.println(x);

*/


////////////////////////////////////////////////////////
/*
System.out.println("Assigning nums = rightShift");
nums = rightShift;   // Works here but on loopnet this is not working.
for (int x : nums)System.out.println(x);
*/



// METHOD 2 - Using O(1) complexity.


int temp;
int count = 1;

    /* 
	RIGHTSHIFT  Remember to assign values from n-1 to 0
	temp = nums 6
	nums[6] = nums[5];
	nums[5] = nums[4];
	nums[4] = nums[3];
	nums[3] = nums[2];
	nums[2] = nums[1];
	nums[1] = nums[0];
	nums[0] = nums[6];
	nums 0 = temp;	
    
	LEFTSHIFT Remember to assign values from 0 to n-1
	temp = nums 0
	nums[0] = nums[1];
	nums[1] = nums[2];
	nums[2] = nums[3];
	nums[3] = nums[4];
	nums[4] = nums[5];
	nums[5] = nums[6];
	nums[6] = nums[0];
	nums 6 = temp;
	*/
	
	/*
	LEFTSHIFT Remember to assign values from 0 to n-1
	temp = nums 0
	nums[0] = nums[1];
	nums[1] = nums[2];
	nums[2] = nums[0];
	*/

// Below is for right shift by k steps

while (count <= k){
	
	temp = nums[nums.length-1];
	for (int i = nums.length -1 ; i > 0 ; i--){   // n-1 to 0
		nums[i] = nums[i-1];
	}
	nums[0] = temp;
	count++;
}


// Below is for right shift by k steps

while (count <= k){
	
	temp = nums[0];
	for (int i = 0; i < nums.length-1 ; i++){     // 0 to n-1
		nums[i]	  = nums [i+1];
	}
	nums[nums.length-1] = temp;
	count++;
}



System.out.println("Left with O(1)");
for (int x : nums)System.out.println(x);

}
}
