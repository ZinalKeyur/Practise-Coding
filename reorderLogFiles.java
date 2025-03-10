/*
Amazon question Reorder Data in Log Files

You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.

There are two types of logs:

Letter-logs: All words (except the identifier) consist of lowercase English letters.
Digit-logs: All words (except the identifier) consist of digits.
Reorder these logs so that:

The letter-logs come before all digit-logs.
The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
The digit-logs maintain their relative ordering.
Return the final order of the logs.

 

Example 1:

Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
Explanation:
The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
Example 2:

Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 
Note that letters are sorted based on the body.
BUt digits are sorted based on identifiers.

Constraints:

1 <= logs.length <= 100
3 <= logs[i].length <= 100
All the tokens of logs[i] are separated by a single space.
logs[i] is guaranteed to have an identifier and at least one word after the identifier.

*/


var reorderLogFiles = function(logs) {

var indentifiers = [];
var statements = [];
var digits = [];
var letters = [];
var digitsIdentifiers = [];
var lettersIdentifiers = [];
var result = [];

  for (var i = 0; i< logs.length; i++){
    var space = logs[i].indexOf(" ");
    indentifiers.push(logs[i].substring(0,space));
    statements.push(logs[i].substring(space+1));
  }

    
  var unsortedStatements = [];

  for (var each in statements){
    unsortedStatements.push(statements[each]);
  }

    var unsortedIdentifiers = [];

  for (var each in indentifiers ){
    unsortedIdentifiers.push(indentifiers[each]);
  }

  statements.sort();
  indentifiers.sort();

 
  for (var i = 0; i < statements.length; i++){

    if (statements[i].split(" ")[0].substring(0,1) < '0' || statements[i].split(" ")[0].substring(0,1) > '9'){
        var rightIndex = unsortedStatements.indexOf(statements[i]);
        letters.push(unsortedStatements[rightIndex]);
        lettersIdentifiers.push(unsortedIdentifiers[rightIndex]); }
    else {
        var rightIndex = unsortedStatements.indexOf(statements[i]);
        digits.push(unsortedStatements[rightIndex]);
        digitsIdentifiers.push(unsortedIdentifiers[rightIndex]); }

  }
  
    
    console.log ("logs : " +logs);
    console.log ("unsortedIdentifiers : " +unsortedIdentifiers);
    console.log ("unsortedStatements : " +unsortedStatements);
    console.log ("indentifiers : " +indentifiers);
    console.log ("statements : " +statements);
    console.log ("letters : " +letters);                              // letters are expected to sort based on these letter bodies
    console.log ("lettersIdentifiers : " +lettersIdentifiers);
    console.log ("digits : " +digits);
    console.log ("digitsIdentifiers : " +digitsIdentifiers);          // digits are expected to sort based on these digit identifiers.
    digitsIdentifiers.sort();
    console.log ("sorted digitsIdentifiers : " +digitsIdentifiers);

    for (var i = 0; i< letters.length; i++){

        var rightIndex = unsortedStatements.indexOf(letters[i]);
        result.push(unsortedIdentifiers[rightIndex]+ " " + unsortedStatements[rightIndex]);
    }

    /*
    for (var i = 0; i< digits.length; i++){

        var rightIndex = unsortedStatements.indexOf(digits[i]);
        result.push(indentifiers[rightIndex]+ " " + digits[i]);
    }
    */



// BUT looks like here, letters are expected to sort without identifiers and digits with identifiers


    for (var i = 0; i< digitsIdentifiers.length; i++){

        var rightIndex = unsortedIdentifiers.indexOf(digitsIdentifiers[i]);
        result.push(unsortedIdentifiers[rightIndex]+ " " + unsortedStatements[rightIndex]);
    }



return result;
};






/// DId not work for many use cases like one below

logs =
["1 n u", "r 527", "j 893", "6 14", "6 82"]
Stdout
logs : 1 n u,r 527,j 893,6 14,6 82
unsortedIdentifiers : 1,r,j,6,6
unsortedStatements : n u,527,893,14,82
indentifiers : 1,6,6,j,r
statements : 14,527,82,893,n u
letters : n u
lettersIdentifiers : 1
digits : 14,527,82,893
digitsIdentifiers : 6,r,6,j
sorted digitsIdentifiers : 6,6,j,r
View less
Output
["1 n u","6 14","6 14","j 893","r 527"]
Expected
["1 n u","r 527","j 893","6 14","6 82"]

where 6 is the identifier coming twice.
