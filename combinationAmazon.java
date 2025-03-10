/*
AMazon COmbination interview Question
New Year's Day is around the corner, and Amazon is having a sale. They have a list of items they are considering, but they may need to remove some of them. Determine the minimum number of items to remove from an array of prices so that the sum of prices of any k items does not exceed a threshold. Note: If the number of items in the list is less than k, then there is no need to remove any more items. Example: Prices = [3, 2, 1, 4, 6, 5] k = 3 threshold = 14
New Year's Day is around the corner, and Amazon is having a sale. They have a list of items they are considering, but they may need to remove some of them. Determine the minimum number of items to remove from an array of prices so that the sum of prices of any k items does not exceed a threshold. Note: If the number of items in the list is less than k, then there is no need to remove any more items.

Example:
Prices = [3, 2, 1, 4, 6, 5]
k = 3
threshold = 14
*/


//The for loops  = k to get the right output. 







// Below is right for 2 groupings because i used 2 for loops.
var combine = function(n, k) {
    
    var range = [],temp1=[],temp2=[],temp3=[], result = [];
    var c = 0;

    for (var i = 1; i<= n; i++){
         range.push(i);
    }


//consider example below at last. n = 9, k = 4

    if (k == n){
        result.push([...range]);
    }

    else if (k == 1){

        for (var i = 0; i<=n-k; i++){
            result.push([range[i]]);
        }
    }

    else{
        for (var i = 0; i<=n-k; i++){

            temp1.push(range[i]);           //c = 1 added in first combination
            c++;
            
            //for (var s = 0; s< n-k+1; s++) {        // This loop is for short ranges with first letter always as i

            shortRange = range.slice(i+c);        //2-n
            temp2 = temp1;                        
            while (c < k-1){    
                console.log("now c = " +c+ " and our shortRange = " +shortRange);
                temp2 = [...temp2,shortRange[c-1]];    //c = 2,3 added in first combination
                c++;
            }
            for (var j = c-1; j< shortRange.length; j++){
                temp3 = [...temp2, shortRange[j]];          // c=4 added to make each combination.
                result.push(temp3);
        
            }

            c = 0;
            temp1=[],temp2=[],temp3=[];
        }
    }

return result;
};



// Below is right for 3 groupings beacuse i used 3 for loops. 
/**
 * @param {number} n
 * @param {number} k
 * @return {number[][]}
 */
var combine = function(n, k) {
    
    var range = [],temp1=[],temp2=[],temp3=[], result = [];
    var c = 0;

    for (var i = 1; i<= n; i++){
         range.push(i);
    }


//consider example below at last. n = 9, k = 4

    if (k == n){
        result.push([...range]);
    }

    else if (k == 1){

        for (var i = 0; i<=n-k; i++){
            result.push([range[i]]);
        }
    }

    else{
        for (var i = 0; i<=n-k; i++){

            temp1.push(range[i]);           //c = 1 added in first combination
            console.log ("Now temp1 " +temp1);

            for (var s = i; s< n-k+1; s++) {        // This loop is for short ranges with first letter always as i
            
                c = 1;              // because first value is already added in temp1
                shortRange = range.slice(s+1);        //2-n
                temp2 = temp1;                        
                while (c < k-1){    
                    console.log("now c = " +c+ " and our shortRange = " +shortRange);
                    temp2 = [...temp2,shortRange[c-1]];    //c = 2,3 added in first combination
                    c++;
                    console.log ("Now temp2 " +temp2);
                }
                for (var j = c-1; j< shortRange.length; j++){
                    temp3 = [...temp2, shortRange[j]];          // c=4 added to make each combination.
                    result.push(temp3);
                    console.log ("Pushing temp3 " +temp3);
                }
            }

            c = 0;
            temp1=[];
            temp2=[],temp3=[];
            
        }
    }

return result;
};



/*


1,2,3,4,5,6,7,8,9

1234,1235,1236,1237,1238,1239
1345,1346,1347,1348,1349
1456,1457,1458,1459
1567,1568,1569,
1678,1679,
1789

2345,2346,2347,2348,2349
2456,2457,2458,2459
2567,2568,2569
2678,2679,2789

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


*/


