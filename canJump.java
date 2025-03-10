// IN Javascript


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


// This did not consider all possiblilities hence above method
/*
var canJump = function(nums) {

var jumpLength = nums[0];   //O(1) space complexity
var nowAtIndex = -1;        //O(1) space complexity

while (nowAtIndex < nums.length && jumpLength < (nums.length - nowAtIndex) && jumpLength != 0 ){	
    nowAtIndex = nowAtIndex + jumpLength;
    jumpLength = nums[nowAtIndex];
    console.log ("Now at index " +nowAtIndex+ " = " +jumpLength);
    //if (nowAtIndex < nums.length) jumpLength = nums[nowAtIndex];
}

if (nowAtIndex < nums.length - 1 && nums.length > 1){return false;}
else{return true;}

}
*/





/* In Java

public class canJump {
    public static void main(String[] args) {

//int[] nums = {3,2,1,4,9,4,5,6,2,2,2,2,2,2,2,2,1,1,1,1,0,5};
//int[] nums = {2,3,1,1,4};
int[] nums = {2,0,0};
int jumpLength = nums[0];
int nowAtIndex = -1;   // instead of 0 use -1 to count the first element during first jump. Example 1 in question below.

// MOST IMPORTANT -> [2,0,0]  -> in this case they expect us to check like index 0 + jumplength 2 = it reaches index 2 and returns true but than nowAtIndex = 0
//				  -> [2,0] -> in this case they expect us to check like index -1 + jumplength 2 = it reaches index 1 and returns true
//				  -> [2,3,1,1,4]  -> in this case they expect us to check like index -1 + jumplength 2 = it reaches index 1 value 3, whick hops 3 more spaces and reach 4.thus returns true.

// It is a question that whether first is to be considered as a hop or not.

System.out.println(" Now at index = " +nowAtIndex+ " and jumpLength = " +jumpLength);
while (nowAtIndex < nums.length - 1  && jumpLength <= (nums.length - nowAtIndex) && jumpLength != 0 ){
	
nowAtIndex = nowAtIndex + jumpLength;
if (nowAtIndex < nums.length) jumpLength = nums[nowAtIndex];

System.out.println(" Now at index = " +nowAtIndex+ " and jumpLength = " +jumpLength);
	
}

if (nowAtIndex <= nums.length - 1 && nums.length > 1){   // IMPORTANT suppose {0} than we are already at the end so does not matter if nowAtIndex = -1 but we are already at the end.
    System.out.println (" Cannot reach end of an array");}

else{
System.out.println (" Reached end of an array");}

}
}

*/

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