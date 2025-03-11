// METHOD 1

// Space complexity = O(K * 2powk)
// Time complexity = O(2 pow n)

 var combine = function(n, k) {
    const result = [];
    backtrack(n, k, 1, [], result);
    return result;
};

function backtrack(n, k, start, combination, result) {
    if (combination.length === k) {
        console.log("Found combination = " +combination);
        result.push([...combination]);
        return;
    }
    for (let i = start; i <= n; i++) {
        combination.push(i);
        //console.log(" pushing in combination = " +combination);
        backtrack(n, k, i + 1, combination, result);
        combination.pop();
        //console.log(" poping from combination = " +combination);
    }
}

/*


var combine = function(n, k) {

    var range =  [];   // Array from 1 to n 
    var result = [];    // All unique combinations of k numbers
    
    for ( var i = 1; i <= n; i++){				// Created our array first.
        range.push(i);
    }

var combinations = function (array){
	var temp1 = [];
    for (var c = 0; c < k-1; c++){							// if combination of 4, first 3 always remains same
		temp1.push(array[c]);
	}
	for (var c = k-1; c < array.length; c++ ){        // for 4th value, iterate through slice array.
		var temp2 = [...temp1,array[c]]
		result.push(temp2);
	}
}


    //if (n<k) return "Combinations not possible";    // Acc to constraint this is not possible but keeping track of all possibilities
    if (k == 1){
        result = range.map( w => [w]);
    }
    else{
        for (var i = 0 ; i<= n-k; i++){		//if 4 number combinations required last pairs 1st element can only be last fourth.
        
        shortRange = range.slice(i);
        combinations(shortRange);
		
        }
    }
	
return result;
}
*/


// Method 2 -> Faster but only for 2 pair combinations


var combine = function(n, k) {

   var range =  [];   // Array from 1 to n 
   var result = [];    // All unique combinations
   
   for ( var i = 1; i <= n; i++){
    range.push(i);
   }


//SO instead of using for loop, since for 10 combinations we can not create 10 for loops, right ?
//basically => 1D array to 2D Array -> my element i and my element i+1 =>  flatmap ?
//Also we need 1 to many => 1 with 2-n, 2 with 3-n => so we need some function => Map ?
// Also no repeat combinations, so 1 with 2-n, 2 with 3-n like wise. So for 2-n, 3-n lets use slice ?

//const newArr = myArr.flatMap((x) => x * 2);   [[x, x*2][]]....

  var result = range.flatMap( (v,i) => range.slice(i+1).map( w => [v,w]) );   // But this is only for combinations of 2.

   console.log (range);
   console.log (result);

   return result
};






//Method 3 -> Easy but lengthy as pairing number k increases for loops increases, space and time complexity increases.



var combine = function(n, k) {

   var range =  [];   // Array from 1 to n 
   var result = [];    // All unique combinations
   
   for ( var i = 1; i <= n; i++){
    range.push(i);
   }


// Suppose combination of 2 digits -> 2 for loop, 3 digits => 3 for loop

var count = 0; // Number of possible combinations = nCr -> nCk = n! / k!(n-k)!
   for ( var i = 0; i < n; i++){
        for (var j = i+1; j < n; j++ ){
            
            var temp = [range[i],range[j]];      // for each combination

            result[count] = temp;
            
            count++;

        }

   }
   console.log (range);
   console.log (result);

   return result
};



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


Eg.: of unique combinations


1,2,3,4,5,6,7,8,9


123,124,125,126,127,128,129     i first charcter can be 0 - n-k
134,135,136,137,138,139         j second charachter can be 1 - n-k-1
145,146,147,148,149				x third charachetr can be 2 - n-k-2 ..... 
156,157,158,159
167,168,169
178,179
189
234,235,236,237,238,239			So for 3 number combination, 3 for loops. This will be tedious for more number combinations.
245,246,247,248,249
256,257,258,259
267,268,269
278,279
289
345,346,347,348,349
356,357,358,359
367,368,369
378,379
389
456,457,458,459
467,468,469
478,479
489
567,568,569
578,579
589
678,679
689
789

1,2,3,4,5,6,7,8,9

1234,1235,1236,1237,1238,1239
2345,2346,2347,2348,2349
3456,3457,3458,3459
4567,4568,4569
5678,5679
6789
1345,1346,1347,1348,1349
1356,1357,1358,1359
1367,1368,1369
1378,1379
1389
1456,1457,1458,1459




*/