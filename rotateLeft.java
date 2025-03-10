// Rotate Array Left by k times

//METHOD - 1 ->  FASTER RESPONSE -> directly estimating the first and last element instead of roating entire series.

//11,22,33 -> 0
//33,11,22 -> 1
//22,33,11 -> 2
//11,22,33 -> 3
//33,11,22 -> 4
//22,33,11 -> 5

/*

when k > n -> kth rotation = k-n rotation
when k < n -> k = k;
 
IMPORTANT REMEMBER THIS LOGIC. confusion maybe because of position and index. index starts from 0.

For Right shift by k elements // Last k elements become first k elements
j = o to k-1 index will be assigned from i = k to n-1 index.
j = k to n-1 index will be assigned from i = 0 to k index.
*/

/*
For  left shift by k elements // First k elements become last k elements
j = o to k index will be assigned from i = k to n-1 index.
j = (n-k or k+1) to n-1 index will be assigned from i = 0 to k-1 index.
*/


public class rotateLeft{
public static void main(String[] args){

int[] nums = {11,22,33};
int k = 7;

// MOST MOST IMPORTANT TO GET K WITHIN ARRAY LENGTH
while (k > nums.length){
	System.out.println("Now k = " +k+ " > n = " +nums.length);
    k = k-nums.length;
}

System.out.println("Now k = " +k+ " < n = " +nums.length);
System.out.println("Original Array");
for (int x : nums)System.out.println(x);

int[] leftShift = new int[nums.length];


int j = 0;
for (int i = k; i<nums.length; i++){
	
	leftShift[j] = nums[i];
	j++;
}

for (int i = 0; i < k; i++ ){
	
	leftShift[j] = nums[i];
	j++;
}

System.out.println("Array after Left shift by " +k+ " positions");
for (int x : leftShift)System.out.println(x);

}
}


// METHOD 2 - SLOW -> Using O(1) complexity.


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
public class rotateLeft{
public static void main(String[] args){

int[] nums = {11,22,33};
int k = 2;

System.out.println("Original Array");
for (int x : nums)System.out.println(x);

int temp;
int count = 1;


while (count <= k){
	
	temp = nums[0];
	for (int i = 0; i < nums.length-1 ; i++){     // 0 to n-1    // O(n) time complexity k times.
		nums[i]	  = nums [i+1];
	}
	nums[nums.length-1] = temp;
	count++;
}

System.out.println("Left by " +k+ " times with O(1)");
for (int x : nums)System.out.println(x);


}
}
*/









/*

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104

*/