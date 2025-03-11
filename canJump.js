
var canJump = function(nums) {

var jumpLength = nums[0];   //O(1) space complexity
var nowAtIndex = -1;        //O(1) space complexity

if (nums.length == 1) return true;

while (nowAtIndex < nums.length-1 && jumpLength < (nums.length-nowAtIndex) && jumpLength != 0){

    nowAtIndex = nowAtIndex + jumpLength;
    jumpLength = nums[nowAtIndex];

    console.log (" Now at index " +nowAtIndex+ " = " +jumpLength);
}

// Suppose dint reach end but all next elements are 0. Than it is like we reached, right ?

var count = 0;   // We will increase this count if the pending elements has non zero number.


for (var i = nowAtIndex + 1; i < nums.length; i++){
    console.log ("Checking index " +i+ " = " + nums[i]);
    if (nums[i] != 0){
        count = 1;
        break;
    }
}

// Above i did not consider first so IMP


    console.log (" Now at index " +nowAtIndex+ " = " +jumpLength);
    console.log (" count = " +count);

if (nowAtIndex = nums.length - 1 && count == 0) return true;
else return false;

}


/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
*/