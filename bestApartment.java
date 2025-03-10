/*

There are 5 lanes/blocks and you want to get an apartment in one.
You  need to find apartment such that you have to travel least blocks away for required buildings.

Consider
Blocks = [
{
"gym" : false,        // 1 block below
"school" : true,      // 0 block away          // SO farthest you travel is 4 blocks
"store" : false		  // 4 block below
}
{
"gym" : true,          // 0 block away
"school" : false,        // 1 block up          // SO farthest you travel is 3 blocks
"store" : false        // 3 block down
}
{
"gym" : true,          // 0 block away
"school" : true,        // 0 block away          // SO farthest you travel is 2 blocks
"store" : false        // 2 block down
}
{
"gym" : false,         // 1 block up
"school" : true,        // 0 block away          // SO farthest you travel is 1 blocks    // This is the answer.
"store" : false        // 1 block down
}
{
"gym" : false,         // 2 block up
"school" : true,        // 0 block away          // SO farthest you travel is 2 blocks
"store" : true         // 0 block away
}
]

and 

Reqs = ["gym", "school", "store"]

*/


public class bestApartment{
	
	public static void main (String[] args){
	
	String[][] Blocks = {{"gym" : false,"school" : true,"store" : false}, {"gym" : true,"school" : false,"store" : false}, {"gym" : true,"school" : true,"store" : false}, {"gym" : false,"school" : true,"store" : false}, {"gym" : false,"school" : true,"store" : true}};

	String[] Reqs = {"gym", "school", "store"};
		
	}
}