/*

Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

You may return the answer in any order.

 

Example 1:

Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
Example 2:

Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.
 

Constraints:

1 <= n <= 20
1 <= k <= n


*/



var combine = function(n, k) {

    var range =  [];   // Array from 1 to n 
    var result = [];    // All unique combinations of k numbers
    
    for ( var i = 1; i <= n; i++){
        range.push(i);
    }

var combinations = function (array){
	var temp1 = [];
    for (var c = 0; c < k-1; c++){
        console.log ("array[c] : " +array[c]);
		temp1.push(array[c]);
        console.log (temp1);
	}
	for (var c = k-1; c < shortRange.length; c++ ){
		var temp2 = [...temp1,shortRange[c]]
		result.push(temp2);
	}
}


	for (var i = 0 ; i<= n-k; i++){
	
	shortRange = range.slice(i);
	combinations(shortRange);

    console.log ("now result " +result);
	}
	
	return result;

};


1,2,3,4,5,6,7,8,9

1234,1235,1236,1237,1238,1239
1345,1345,1347,1348,1349
1456,1457,1458,1459
1567,1568,1569,
1678,1679,
1789

2345,2346,2347,2348,2349
2456,2457,2458,2459
2567,2568,2569
2678,2679,
2789


3456,3457,3458,3459
3567,3568,2569
3678,3679,
3789

4567,4568,4569
4678,4679
4789

5678,5679
5789

6789
