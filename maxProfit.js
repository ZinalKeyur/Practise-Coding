// Method 1
var maxProfit = function(prices) {
    var maximumProfit = 0;
    
    for (var i = 0; i< prices.length - 1; i++){
        for (var j = i+1; j< prices.length; j++){
            if (prices[j] - prices[i] > maximumProfit){
                maximumProfit = prices[j] - prices[i];
                console.log (prices[j]+ " - " +prices[i]+ " = " +maximumProfit);
            }
        }
    }
return maximumProfit;
};


// Method 2 

const maxProfit = (prices) => {
  let left = 0; // Buy
  let right = 1; // sell
  let max_profit = 0;
  while (right < prices.length) {                               // This While is my first for loop
    if (prices[left] < prices[right]) {							// This if else is my second for loop
      let profit = prices[right] - prices[left]; 				// our current profit	

      max_profit = Math.max(max_profit, profit);
    } else {
      left = right;
    }
    right++;
  }
  return max_profit;
};


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


{7,1,5,3,6,4}

7	1   NA
	5	NA
	3	NA
	6   NA
	4	NA
	
1   5   4
	3	2
	6	5
	4	3
	
5   3	NA
	6	1
	4	NA
	
3	6	3
	4	1
	
6	4	NA


*/





























