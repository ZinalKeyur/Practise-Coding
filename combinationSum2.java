/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30

*/

// COmbination sum 2    Passing 172/176 solutions

var combinationSum2 = function(candidates, target) {
 
 var result = [], temp = [];
 var sum = 0, start = 0;
 //candidates.sort();    //This sort is lexiographic so works good for alphabets. Use below for numeric sort
 candidates.sort(function(a,b) {return a-b;});            // This is not mentioned but without sorting it is not accepting answers. like 1,6,1 instead of 1,1,6 is rejected. You will know this by seeing first example in question.

 generateCombinations(candidates,target,start,sum,temp,result);
 return result;
};


function generateCombinations(candidates, target, start, sum, temp, result){
    if (sum > target) return;
    if (sum === target){
        console.log (" Found Combination " +temp);
        if ((result.join(",")).indexOf(temp.join(",")) == -1){       // MMIMP. Since we have 1 two times in array. We are getting duplicate entries. 1,2,5 with first 1 and 1,2,5 with second 1. So add new temp in final result only if it is not already present there. Now we cannot check indexOf array within array. SO checking indexOf string within string using join to make array a string.
            result.push(temp);
            console.log (" Pushing Combination " +temp);
            return;}
    }

    
    for (var i = start; i < candidates.length; i++){
        console.log (" Pushing " + candidates[i]);
        generateCombinations(candidates, target, i + 1, sum + candidates[i], [...temp, candidates[i]], result); // here [...temp,candidates[i]] is like pushing the new element in array.
        console.log (" After poping " +temp);
    }


}


/*
ABove is failing for extreme condition with TIME LIMIT EXCEED LIKE BELOW
candidates =
[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
target =
30
*/

/*

candidates =
[10,1,2,7,6,1,5]
target =
8
Stdout
[
  1, 1, 10, 2,
  5, 6,  7
]
0
 Pushing 1
 Pushing 1
 Pushing 10
 After poping 1,1
 Pushing 2
 Pushing 5
 After poping 1,1,2
 Pushing 6
 After poping 1,1,2
 Pushing 7
 After poping 1,1,2
 After poping 1,1
 Pushing 5
 Pushing 6
 After poping 1,1,5
 Pushing 7
 After poping 1,1,5
 After poping 1,1
 Pushing 6
 Found Combination 1,1,6
 Pushing Combination 1,1,6
 After poping 1,1
 Pushing 7
 After poping 1,1
 After poping 1
 Pushing 10
 After poping 1
 Pushing 2
 Pushing 5
 Found Combination 1,2,5
 Pushing Combination 1,2,5
 After poping 1,2
 Pushing 6
 After poping 1,2
 Pushing 7
 After poping 1,2
 After poping 1
 Pushing 5
 Pushing 6
 After poping 1,5
 Pushing 7
 After poping 1,5
 After poping 1
 Pushing 6
 Pushing 7
 After poping 1,6
 After poping 1
 Pushing 7
 Found Combination 1,7
 Pushing Combination 1,7
 After poping 1
 After poping 
 Pushing 1
 Pushing 10
 After poping 1
 Pushing 2
 Pushing 5
 Found Combination 1,2,5
 Pushing 6
 After poping 1,2,5
 Pushing 7
 After poping 1,2,5
 After poping 1,2
 Pushing 6
 After poping 1,2
 Pushing 7
 After poping 1,2
 After poping 1
 Pushing 5
 Pushing 6
 After poping 1,5
 Pushing 7
 After poping 1,5
 After poping 1
 Pushing 6
 Pushing 7
 After poping 1,6
 After poping 1
 Pushing 7
 Found Combination 1,7
 After poping 1
 After poping 
 Pushing 10
 After poping 
 Pushing 2
 Pushing 5
 Pushing 6
 After poping 2,5
 Pushing 7
 After poping 2,5
 After poping 2
 Pushing 6
 Found Combination 2,6
 Pushing Combination 2,6
 After poping 2
 Pushing 7
 After poping 2
 After poping 
 Pushing 5
 Pushing 6
 After poping 5
 Pushing 7
 After poping 5
 After poping 
 Pushing 6
 Pushing 7
 After poping 6
 After poping 
 Pushing 7
 After poping 
 
Output
[[1,1,6],[1,2,5],[1,7],[2,6]]
Expected
[[1,1,6],[1,2,5],[1,7],[2,6]]
Contribute a testcase
1234
[10,1,2,7,6,1,5]
8
[2,5,2,1,2]
5

*
/