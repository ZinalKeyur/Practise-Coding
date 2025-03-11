
// Method 1  ->

var combinationSum = function(candidates, target) {
    const result = [];
    
    function combinations(arr=[], sum=0, idx=0) {
        if(sum > target) return;
        if(sum === target) result.push(arr);
		//{console.log (" Found " +arr); 
        //  result.push(arr);}
        
        for(let i = idx; i < candidates.length; i++) {
			console.log(" Now arr = " +([...arr, candidates[i]])+ " sum = " + (sum+candidates[i])+ " and idx = " +i);
            combinations([...arr, candidates[i]], sum+candidates[i], i);
        }
    }
    combinations();
    return result;
};

/*
 Now arr = 2 sum = 2 and idx = 0
 Now arr = 2,2 sum = 4 and idx = 0
 Now arr = 2,2,2 sum = 6 and idx = 0
 Now arr = 2,2,2,2 sum = 8 and idx = 0
 Now arr = 2,2,2,3 sum = 9 and idx = 1
 Now arr = 2,2,2,6 sum = 12 and idx = 2
 Now arr = 2,2,2,7 sum = 13 and idx = 3
 Now arr = 2,2,3 sum = 7 and idx = 1
 Found 2,2,3
 Now arr = 2,2,3,3 sum = 10 and idx = 1
 Now arr = 2,2,3,6 sum = 13 and idx = 2
 Now arr = 2,2,3,7 sum = 14 and idx = 3
 Now arr = 2,2,6 sum = 10 and idx = 2
 Now arr = 2,2,7 sum = 11 and idx = 3
 Now arr = 2,3 sum = 5 and idx = 1
 Now arr = 2,3,3 sum = 8 and idx = 1
 Now arr = 2,3,6 sum = 11 and idx = 2
 Now arr = 2,3,7 sum = 12 and idx = 3
 Now arr = 2,6 sum = 8 and idx = 2
 Now arr = 2,7 sum = 9 and idx = 3
 Now arr = 3 sum = 3 and idx = 1
 Now arr = 3,3 sum = 6 and idx = 1
 Now arr = 3,3,3 sum = 9 and idx = 1
 Now arr = 3,3,6 sum = 12 and idx = 2
 Now arr = 3,3,7 sum = 13 and idx = 3
 Now arr = 3,6 sum = 9 and idx = 2
 Now arr = 3,7 sum = 10 and idx = 3
 Now arr = 6 sum = 6 and idx = 2
 Now arr = 6,6 sum = 12 and idx = 2
 Now arr = 6,7 sum = 13 and idx = 3
 Now arr = 7 sum = 7 and idx = 3
 Found 7
 Now arr = 7,7 sum = 14 and idx = 3
 */
 

// Method 2 -> little lengthy


var combinationSum = function(candidates, target) {

    const res = [];

    function makeCombination(idx, comb, total) {
        if (total === target) {
            res.push([...comb]);
            console.log("Found Combination " + comb);
            return;
        }

        if (total > target || idx >= candidates.length) {
            console.log (" Total " +total+ " above " +target+ " or index above valid length " );
            return;
        }

        comb.push(candidates[idx]);
        console.log (" Pushing " +candidates[idx]+  " and total = " +(total + candidates[idx]));
        
        makeCombination(idx, comb, total + candidates[idx]);   // we do not increase idx because here repetation of number is allowed

        console.log ("Before poping " + comb + " and total = " + (total + candidates[idx]) );
        comb.pop();
        console.log ("After poping " + comb + " and total = " +total);

        makeCombination(idx + 1, comb, total);                 // possibility with repeation is over so increasing index
    }

    makeCombination(0, [], 0);
    return res;    
};



/* Pushing 2 and total = 2
 Pushing 2 and total = 4
 Pushing 2 and total = 6
 Pushing 2 and total = 8
 Total 8 above 7 or index above valid length 
Before poping 2,2,2,2 and total = 8
After poping 2,2,2 and total = 6
 Pushing 3 and total = 9
 Total 9 above 7 or index above valid length 
Before poping 2,2,2,3 and total = 9
After poping 2,2,2 and total = 6
 Pushing 6 and total = 12
 Total 12 above 7 or index above valid length 
Before poping 2,2,2,6 and total = 12
After poping 2,2,2 and total = 6
 Pushing 7 and total = 13
 Total 13 above 7 or index above valid length 
Before poping 2,2,2,7 and total = 13
After poping 2,2,2 and total = 6
 Total 6 above 7 or index above valid length 
Before poping 2,2,2 and total = 6
After poping 2,2 and total = 4
 Pushing 3 and total = 7
Found Combination 2,2,3
Before poping 2,2,3 and total = 7
After poping 2,2 and total = 4
 Pushing 6 and total = 10
 Total 10 above 7 or index above valid length 
Before poping 2,2,6 and total = 10
After poping 2,2 and total = 4
 Pushing 7 and total = 11
 Total 11 above 7 or index above valid length 
Before poping 2,2,7 and total = 11
After poping 2,2 and total = 4
 Total 4 above 7 or index above valid length 
Before poping 2,2 and total = 4
After poping 2 and total = 2
 Pushing 3 and total = 5
 Pushing 3 and total = 8
 Total 8 above 7 or index above valid length 
Before poping 2,3,3 and total = 8
After poping 2,3 and total = 5
 Pushing 6 and total = 11
 Total 11 above 7 or index above valid length 
Before poping 2,3,6 and total = 11
After poping 2,3 and total = 5
 Pushing 7 and total = 12
 Total 12 above 7 or index above valid length 
Before poping 2,3,7 and total = 12
After poping 2,3 and total = 5
 Total 5 above 7 or index above valid length 
Before poping 2,3 and total = 5
After poping 2 and total = 2
 Pushing 6 and total = 8
 Total 8 above 7 or index above valid length 
Before poping 2,6 and total = 8
After poping 2 and total = 2
 Pushing 7 and total = 9
 Total 9 above 7 or index above valid length 
Before poping 2,7 and total = 9
After poping 2 and total = 2
 Total 2 above 7 or index above valid length 
Before poping 2 and total = 2
After poping  and total = 0
 Pushing 3 and total = 3
 Pushing 3 and total = 6
 Pushing 3 and total = 9
 Total 9 above 7 or index above valid length 
Before poping 3,3,3 and total = 9
After poping 3,3 and total = 6
 Pushing 6 and total = 12
 Total 12 above 7 or index above valid length 
Before poping 3,3,6 and total = 12
After poping 3,3 and total = 6
 Pushing 7 and total = 13
 Total 13 above 7 or index above valid length 
Before poping 3,3,7 and total = 13
After poping 3,3 and total = 6
 Total 6 above 7 or index above valid length 
Before poping 3,3 and total = 6
After poping 3 and total = 3
 Pushing 6 and total = 9
 Total 9 above 7 or index above valid length 
Before poping 3,6 and total = 9
After poping 3 and total = 3
 Pushing 7 and total = 10
 Total 10 above 7 or index above valid length 
Before poping 3,7 and total = 10
After poping 3 and total = 3
 Total 3 above 7 or index above valid length 
Before poping 3 and total = 3
After poping  and total = 0
 Pushing 6 and total = 6
 Pushing 6 and total = 12
 Total 12 above 7 or index above valid length 
Before poping 6,6 and total = 12
After poping 6 and total = 6
 Pushing 7 and total = 13
 Total 13 above 7 or index above valid length 
Before poping 6,7 and total = 13
After poping 6 and total = 6
 Total 6 above 7 or index above valid length 
Before poping 6 and total = 6
After poping  and total = 0
 Pushing 7 and total = 7
Found Combination 7
Before poping 7 and total = 7
After poping  and total = 0
 Total 0 above 7 or index above valid length 
*/

// METHOD 3 -> creates all uniwue combinations. But we are allowed to repeat numbers in a valid array. so it wont work for this question

// here we need all combinations of 1, 2, 3,4 ,   candidates.length arrays.
// Than for each of these, check if sum is equal to target
// MOST IMP, regular combinations are not enough. You can even repeat numbers in valid array as long as 1 number is different.

/*

var combinationSum = function(candidates, target) {
    
    var result = []; 
    var validResult = [];

    function generateCombinations(candidates,k,start,combination,result){
            if (combination.length == k){
                result.push([...combination]);
            }
            for (var i = start; i < candidates.length; i++){
                combination.push(candidates[i]);
                generateCombinations(candidates, k,i+1,combination,result);
                combination.pop();
            }
        }

    
    for (var k = 1; k < candidates.length; k++){
    generateCombinations(candidates,k,0,[],result);
    }

    // Now we have all possible combinations

    console.log (" we have " +result.length+ " combinations");
    console.log (result);

    for (var i = 0; i < result.length; i++){

        var sum = 0;
        for (var j = 0; j < result[i].length; j++){
            sum = sum + result[i][j];
        }
    
    if (sum == target) validResult.push(result[i]);

    }   

    return validResult;
};

*/


/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 

Constraints:

1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40

*/



