
//METHOD 1

var suggestedProducts = function(products, searchWord) {
    
    products = products.sort();  // incase array is not already sorted
    var finalArrayOfEachArray = [searchWord.length];

    for (var i = 0; i< searchWord.length; i++){            // Itterating each letter of searchWord
        var eachletterSearch = [];                         
        finalArrayOfEachArray[i] = [];  // define that each element of this array is another array, to be able to apply push function later.
        var searchLetter = searchWord.split("")[i];
    
     for (var j = 0; j< products.length; j++){             // Iterating each word of Products to match with searchLetter

            if (products[j].split("")[i] == searchLetter && eachletterSearch.length < 3 ) {
                eachletterSearch.push(products[j]);
            }

        }
    
    finalArrayOfEachArray[i] = eachletterSearch;   // System does not know that finalArrayOfEachArray is an array of array. so it  thinks pushing array in a string is not possible and give error oush is not a function if you dont decalre as array in first for loop.
    }

    return finalArrayOfEachArray;
};




//METHOD 2 

var suggestedProducts = function(products, searchWord) {
    
    products = products.sort();  // incase array is not already sorted

    var finalArrayOfEachArray = [searchWord.length];
    var oldSearch = "";    // going further in charachters. You want to compare entire string till than. Like mou should all match, not only m or o u.

    for (var i = 0; i< searchWord.length; i++){            // Itterating each letter of searchWord
        var eachletterSearch = [];                         
        finalArrayOfEachArray[i] = [];  // define that each element of this array is another array, to be able to apply push function later.
        var searchLetter = searchWord.split("")[i];
        oldSearch = oldSearch.concat(searchLetter);   // Remember CONCAT function to merge 2 strings.

     for (var j = 0; j< products.length; j++){             // Iterating each word of Products to match with searchLetter

            //if (products[j].split("")[i] == searchLetter && eachletterSearch.length < 3 ) {   // This will only search 1 letter in 1 position which is not right.

			////////////////MMMMMMIMP///////////////////
            if (products[j].indexOf(oldSearch) == 0 && eachletterSearch.length < 3 ) {   // This will search group of strings till now. Like mou for mouse in starting index 0.
                eachletterSearch.push(products[j]);
            }
        }
    
    finalArrayOfEachArray[i] = eachletterSearch;   // System does not know that finalArrayOfEachArray is an array of array. so it  thinks pushing array in a string is not possible. SO make sure you have declared second level of array above in first for loop.
    }

    return finalArrayOfEachArray;
};





/*
Amazon Question
Search Suggestion Systems

You are given an array of strings products and a string searchWord.

Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return a list of lists of the suggested products after each character of searchWord is typed.

 

Example 1:

Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"].
After typing m and mo all products match and we show user ["mobile","moneypot","monitor"].
After typing mou, mous and mouse the system suggests ["mouse","mousepad"].
Example 2:

Input: products = ["havana"], searchWord = "havana"
Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
Explanation: The only word "havana" will be always suggested while typing the search word.
 

Constraints:

1 <= products.length <= 1000
1 <= products[i].length <= 3000
1 <= sum(products[i].length) <= 2 * 104
All the strings of products are unique.
products[i] consists of lowercase English letters.
1 <= searchWord.length <= 1000
searchWord consists of lowercase English letters.

*/

