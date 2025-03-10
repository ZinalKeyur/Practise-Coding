You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
/* Question

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 

Follow up: Can you come up with an algorithm that runs in O(m + n) time?
*/

public class sortAndMergeArray{


public static void main (String[] args){
	
	int[] intArray1 = {1,2,6,7,9,0,0};	
	int[] intArray2 = {3,4};	
	int m = 5 , n = 2;	
	
	// Merging both arrays first
	for (int i = m, j=0 ; i < m+n && j < n; i = i+1 , j = j+1){    // NOTE WHERE TO USE < AND WHERE TO USE &&
	intArray1[i] = intArray2[j];	
	}
	
	// Now sorting the Array
	
	for ( int x : intArray1)	System.out.println(x); // This is hopefully coming right
	
	int temp;
	
	for (int i=0; i< m+n; i++){
		
		
		System.out.println("Now i = " +i);
		for ( int x : intArray1)	System.out.println(x);
		
		
		for (int j=i+1; j< m+n; j++){
			if (intArray1[i] > intArray1[j]){
			temp = intArray1[i];
			intArray1[i] = intArray1[j];
			intArray1[j] = temp;
			}
		
		}
	
	}
	
	

/*
ABove example is 0(m+n) time
O(M+N) = max(O(M), O(N))

if M > N => O(M+N) = O(M)
if N > M => O(M+N) = O(N)

	int sum(int[] nArr, int[] mArr) {
    int sum = 0;
    for(int i : nArr) {
        sum += i;
    }
    for(int i : mArr) {
        sum += i;
    }
    return sum;
}
To compute the sum, you need to go through all elements in nArr (size n) 
and all elements in mArr (size m), so the overall complexity is O(m+n)

As an additional help, here is an example of O(n * m) algorithm:

for (i = 0; i < n; i++)
{
  for (j = 0; j < m; j++)
  {
    // do something but don't loop or invoke recursive functions
    // only constant O(c) complexity is allowed: a simple series of commands
  }
}
*/
	
	
	/*  
	
	Below is basic way of sorting in javascript.
	list = [4,5,13,6,7,12];
	list.sort()     // This is shortcut in javascript.
		
	Below is advanced way of sorting in javascript.   // WOW
	def quick_sort(arr);
		if len(arr) <= 1;
			return arr
			
		pivot = arr[0]
		left = [x for x in arr[1:] if x < pivot]
		right = [x for x in arr[1:] if x >= pivot]
		
		return quick_sort(left) + [pivot] + quick_sort[right]
	*/
	
}
}