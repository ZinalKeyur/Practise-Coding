// Sort an array of numbers without using .sort method.


public class sortArray{

public static void main (String[] args){
	
	int[] intArray = {1,2,6,7,9,3,4,5};	
	
	int temp;
	for (int i=0; i<intArray.length; i++){
		for (int j=i+1; j<intArray.length; j++){
			if (intArray[j] < intArray[i]){
				
				temp = intArray[i];
				intArray[i] = intArray[j];
				intArray[j] = temp;
			}
			
		}
		
	}
	
	for (int x : intArray){
		System.out.println(x);
	}
	
	/*  
	
	Below is basic way of sorting in javascript.
	list = [4,5,13,6,7,12];
	list.sort()     // This is shortcut in javascript.
		
	Below is advanced way of sorting in javascript.   // WOW
	def quick_sort(arr);
		if len(arr) <= 1;
			return arr
			
		pivot = arr[0]
		left = [x for x in arr[1:] if x < pivot]
		right = [x for x in arr[1:] if x >= pivot]
		
		return quick_sort(left) + [pivot] + quick_sort[right]
	*/
	
}
}