// Method 1

var numIslands = function(grid) {

var result = 0;                      // Initiate count of islands found

var explore = function(r,c,grid){

        var rows = grid.length;       
        var colunms = grid[0].length;

        // Lets just return if r or c are not in range or grid value is 0
        if (r < 0 || c < 0 || r > rows || c > colunms || grid[r][c] == "0") return;

        // otherwise lets explore in all 4 directions
        // first since this grid is already visited, make it as 0. SO when we come next time, we dont recount it.

        grid[r][c] = "0";
       
	    if (c-1 > 0) explore(r,c-1,grid);  //explore left
        if (c+1 < colunms) explore(r,c+1,grid);   //explore right
        if (r-1 > 0) explore(r-1,c,grid);   //explore top
        if (r+1 < rows) explore(r+1,c,grid); //explore bottom


}

for (var r = 0; r < grid.length; r++){
    for (var c = 0; c < grid[0].length; c++){
        if (grid [r][c] == "1"){               // Means this is a land. Start exploring land size
            explore(r,c,grid);                      
            result += 1;
        }

    }
}

return result;
};

// Method 2

var numIslands = function(grid) {

var rows = grid.length;
var colunms = grid[0].length;
var visited = [];
var result = 0;

console.log ("rows = " +rows+ " colunms = " +colunms);

var dfs = function (r,c){
 if ((r,c) in visited) return;

 visited.add((r,c));
 console.log (visited);

 directions = [[1,0],[-1,0],[0,1],[0,-1]]    // 4 directions from your point. let it be 0,0

 for (var d in directions){

    nr = d[0]+r;
    nc = d[1]+c;

    if ((0 <= nr <= rows) && ((0 <= nc <= colunms) && grid[nr][nc] == "1")){
    dfs (nr,nc);                             // Keep calling untill land continues in either direction.
    }
 }
}

for (var r in rows){
    for (var c in colunms){
        if (grid [r][c] == "1" && (r,c) not in visited){
            dfs(r,c);                      // Depth first search to see all continous island
            result += 1;
        }

    }
}
};



/*

Amazon Question Number of Islands

Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.


*/
