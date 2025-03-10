// Javascript worked

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


// ABove is my code and below is from solutions. For my code, large input is giving error time limit exceeded
// Where as below passes in 52 ms. I dont know why
// Both have same logic. Keep first pointer in position 1 and traverse second pointer in all values to the right.
/*
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
*/










/*   Lengthy and unnecessary confused steps

var maxProfit = function(prices) {
    
    var sortedPrices = [];
    var maximumProfit = 0;
    for (var i =0; i < prices.length; i++){
        sortedPrices.push(prices[i]);
    }

    sortedPrices.sort();

    console.log (" prices : " +prices);
    console.log (" sortedPrices : " +sortedPrices);
    

    for (var i = sortedPrices.length - 1; i>0; i-- ){
        var rightSellIndex = prices.indexOf(sortedPrices[i]);
        //console.log ("Now checking selling price " +prices[rightSellIndex]);   
        //Start best selling price from max value of sorted array

        for (var j = 0 ; j < i; j++){
            var rightBuyIndex = prices.indexOf(sortedPrices[j]);
            //console.log ("Now checking buying price " +prices[rightBuyIndex]);
            // Start best buying price from least value of sorted array


            //maxprofit changes if difference is more than last stored maxprofit
            //maxprofit changes if buying index is less than selling index. Means we buy first and than sell 
            if (rightSellIndex > rightBuyIndex && maximumProfit < prices[rightSellIndex] - prices[rightBuyIndex]){

                maximumProfit = prices[rightSellIndex] - prices[rightBuyIndex];
                console.log(prices[rightBuyIndex]+ " - " + prices[rightSellIndex]+ " = " + maximumProfit)
                }
        }
    }

return maximumProfit;
};




/*

Input
prices =
[2,1,2,0,1]
Stdout
 prices : 2,1,2,0,1
 sortedPrices : 0,1,1,2,2
Output
0
Expected
1

Failed for above testcase where values can repeat. And so indexOf always shows first occurence only.


/*
METHOD 1 -> 
// Exceeding time limit for larger data inputs.

public class maxProfit {
    public static void main(String[] args) {


    int maxProfit = 0;
	
	//int[] prices = {1,9,8,7,3,4,5,6};
	int[] prices = {7,1,5,3,6,4};
	
	for (int i = 0; i < prices.length; i++){
			for (int j = i+1; j < prices.length; j++){
				if (prices[j] - prices[i] > maxProfit) 
					maxProfit = prices[j] - prices[i];
			}	
	}
    
	
	System.out.println("Max Profit = "+maxProfit);
}
}
*/

/*
Method 2 -> index Of method finds always only  first occurence so incase values repeat in array, this solution dont working


import java.util.Arrays;

public class maxProfit {
	
	public static int indexOf(final int[] array, final int valueToFind, int startIndex) {
       if (array == null) {
			return -1;
       }
       if (startIndex < 0) {
		  startIndex = 0;
	   }
       for (int i = startIndex; i < array.length; i++) {
          if (valueToFind == array[i]) {
              return i;
           }
       }
        return -1;
    }
	
	
    public static void main(String[] args) {
        
   //int[] prices = {7,1,5,3,6,4};
   int[] prices = {2,1,2,0,1};   // int this case when trying to find index of 2, it only gives first occurence to 2 at third place never comes in condition.
	
	System.out.println("Actual Array ");
	for (int x : prices)System.out.println(x);
	
	int[] sortedArray = new int[prices.length];
	for (int i = 0; i < prices.length; i++)sortedArray[i] = prices[i];
	
	Arrays.sort(sortedArray);
	System.out.println("Sorted Array ");
	for (int x : sortedArray)System.out.println(x);
	
	int maxProfit = 0;
		
	for (int i = 0; i < sortedArray.length; i++){
		for (int j = sortedArray.length-1 ; j > i; j--){
	
		int minValue = sortedArray[i];
		int maxValue = sortedArray[j];		
		int minValueIndex = indexOf(prices,minValue,0);
		int maxValueIndex = indexOf(prices,maxValue,0);
		
		System.out.println(" Checking " +minValue+ "(" +minValueIndex+ ") With " +maxValue+ "(" +maxValueIndex+ ")");
		
		if(minValueIndex < maxValueIndex && (maxValue - minValue) > maxProfit){
			
			System.out.println("Condition matched with buy Price " + minValue + " at index " +minValueIndex+ " and sell Price " +maxValue+ " at index " +maxValueIndex);
			maxProfit = maxValue - minValue;
			break;
		}
		}
		
	}
	
	System.out.println("Max Profit = "+maxProfit);
}
}

*/

//Method 3 -> binary search is working sometimes and sometimes it is not working

/*

import java.util.Arrays;

public class maxProfit {
	
	public static int findIndex(int arr[], int t, 0) 
    {
        int index = Arrays.binarySearch(arr, t); 
        return (index < 0) ? -1 : index; 
    } 
	
	
    public static void main(String[] args) {
	
	int[] prices = {7,1,5,3,6,4};
	
	System.out.println("Actual Array ");
	for (int x : prices)System.out.println(x+ " at index " +findIndex(prices,x));
	
	int[] sortedArray = new int[prices.length];
	for (int i = 0; i < prices.length; i++)sortedArray[i] = prices[i];
	
	Arrays.sort(sortedArray);
	System.out.println("Sorted Array ");
	for (int x : sortedArray)System.out.println(x+ " at index " +findIndex(sortedArray,x));
	
	int maxProfit = 0;
		
	for (int i = 0; i < sortedArray.length; i++){
		for (int j = sortedArray.length-1 ; j > i; j--){
	
		int minValue = sortedArray[i];
		int maxValue = sortedArray[j];
		
		//System.out.println(Arrays.binarySearch(prices,minValue));
		
		int minValueIndex = findIndex(prices,minValue);
		int maxValueIndex = findIndex(prices,maxValue);
		
		//System.out.println(" Checking " +minValue+ " at position " +minValueIndex);
		//System.out.println (" With " +maxValue+ " at position " +maxValueIndex);
		
		if(minValueIndex < maxValueIndex && (minValue - maxValue) > maxProfit){ 	  
			maxProfit = maxValue - minValue;
			break;
		}
		}
		
	}
	
	System.out.println("Max Profit = "+maxProfit);
}
}
*/



////////////////////QUESTION //////////////////////////////////////

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





























