public class sortAndMergeArray{

public static void main (String[] args){
	
	int[] intArray1 = {1,2,6,7,9,0,0};	
	int[] intArray2 = {3,4};	
	m = 5;
    n = 2;
	
	
	var intArray3 = intArray1;

	if (m+n = 0) Console.log (" Nothing to output");
	else if ( m > 0 && m+n = 1) intArray1 = intArray3;
	else if ( n > 0 && m+n = 1) intArray1 = intArray2;
	else  {	
	for (var i = 0, j=0 ; j < m+n; i++, j=j+2){
		if (intArray3[i] <= intArray2[i]) { 
			intArray1[j] = intArray3[i];
			intArray1[j+1] = intArray2[i];
		}
		else {
			intArray1[j] = intArray2[i];
			intArray1[j+1] = intArray3[i];
		}
	}
	}

	
	for (int x : intArray1){
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