//

IMPORTANT ERROR Output limit exceeded -> comment all console log because output cannot display so many things to you.


/*

K Closest Points to Origin

Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

 

Example 1:


Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 

Constraints:

1 <= k <= points.length <= 104
-104 <= xi, yi <= 104



*/

//Javascript Option 1 -> 

// This script does not work for max constraints.
var kClosest = function(points, k) {
    
    // Points is a 2D Array. 
    //since we are calculation distance from origin, x2 and y2 is 0
    //so our distance = sqrt (x2 + y2) = sqrt((x*x)+(y*y))

    // IMP if k = 1, return 1 point, if 2 return 2 ppints. SO it will be array of an array
    var distances = [];
    var result = [];
    var point = [];
    
    for (var i = 0; i< points.length; i++){
        point = points[i];
        
        var distance = Math.sqrt(Math.pow(point[0],2) + Math.pow(point[1],2));

        console.log (" Point = " +point+ " distance = " +distance);
        distances.push(distance);
    }

    for (var x = 1; x <= k; x++){    // We need a point array of length k

    var shortestDistanceIndex = points.length;
    var shortestDistance = Math.sqrt(Math.pow((Math.pow(-10,4)),2) + Math.pow((Math.pow(10,4)),2));   
// According to constraints, the farthest point can be -10pow4 to topow4, so anything below it will modify this element going forward.
    
	shortestDistance = shortestDistance +1;
    for (var i = 0; i< distances.length; i++){
    //for (var i = 0; i<= distances.length; i++){ // This was giving time limit exceeded error for extreme case,  not sure why. SO used above 2 lines instead

        if(distances[i] < shortestDistance){

            //console.log (points[i]+ " has shorter distance " +distances[i]);
            shortestDistance = distances[i];
            shortestDistanceIndex = i;
        }
    }
    result.push(points[shortestDistanceIndex]);

// IMPORTANT note that now second loop should not have this point or it will give same output. SO remove or splice it from actual array.
    points.splice(shortestDistanceIndex,1);   // pop will remove last element. splice removes requested element.
    distances.splice(shortestDistanceIndex,1);   // pop will remove last element. splice removes requested element.
    }

    return result;
};



