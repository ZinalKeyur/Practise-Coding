/*
Suppose you have some space on cloud ->
You want to compress a file and upload a copy on this cloud location.

Each file can be compressed to 80 %. (20 % reduced)
This compressed file is divided in clocks of 512 bytes each. 

Write an algprithm to read available space in blocks. Then in loop, read the uncompressed file and determine whether it can be fitted. If yes, compress and store, or exit and give error warning of full space.



Eg. Suppose CLoud can store 1000 blocks.
file 1 -> 1100 bytes can compress to 80 % means 880 bytes -> 880 / 512 = 2 blocks used -> Now available blocks = 1000 - 2 = 998.
file 2 -> 20000 bytes can compress to 80 % means 16000 bytes -> 16000 / 512 = 32 blocks used -> Now Available blocks = 998 - 32 = 966.
.
.
.
.
*/


import java.util.Scanner;

public class zip{
	
	public static final boolean DEBUG = false;
	
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Provide cloud space in blocks, where each bolck = 512 bytes ");
		
		try{
		
		double capacity = keyboard.nextDouble();   // This is storage capacity in blocks
			
		System.out.println(" Provide the size of files you want to upload, 1 at a time \n "
						+  " When completed, type \"done\" ");
						 
		String size = keyboard.next();      // This is file size in bytes. 1 block = 512 bytes
		
			while ( ! size.toUpperCase().trim().equals("DONE") && capacity > 0) {
				
				if ((size.toUpperCase()).trim().equals("DONE")){
					
					System.out.println(" Ok, looks like no more files to be uploaded " );
					System.out.println(" You final available capacity is = " + capacity) ;
					break;
				}
				
				else {		// You should have some try and catch mechanism to check this
				
					//So try to parseInt
					try {
					int fileSize = Integer.parseInt(size);    // Ideally i should add an exception if user by mistake adds something other than an integer.		
					double compressedSize = 0.80 * fileSize;
					double compressedBlocks = compressedSize / 512;
					
					if (DEBUG){												// If you dont want such tracing, make dbug boolean value true above.
					System.out.println(" fileSize = " +fileSize);
					System.out.println(" compressedSize = " +compressedSize);
					System.out.println(" compressedBlocks = " +compressedBlocks);
					}
					capacity = capacity - compressedBlocks;
					
					if (capacity > 0){
					System.out.println(" Yes this file will be added");
					}
					else{
					capacity = capacity + compressedBlocks;
					System.out.println(" No this file will not be added");
					System.out.println("We have " +capacity+ " blocks available and we need " +compressedBlocks);
					break;
					}
					
					if (DEBUG){
					
					System.out.println(" Now available capacity = " +capacity);
					
					System.out.println(" More files ? \n"
									 + " if Yes - provide file size in bytes \n"
									 + " if No - Write \"Done\" ");
					}
					
					} 
					
					catch (Exception e) {
					
					// if it is some other string and cannot be parsed, catch error. 
					
					System.out.println("This is wrong input. Please try again \n"
										 + " Either provide an integer size in bytes or say \"Done\" ");
					}
					
					/*
					finally {
						System.out.println(" Try Catch is finished");
					}
					*/
				}
				
			size = keyboard.next();      // This is file size in bytes. 1 block = 512 bytes
			}
			
		}
		catch (Exception e){
		
		System.out.println (" WRONG !!! \n"
						  + " Provide numerical value ");
		}		
		
	}
}