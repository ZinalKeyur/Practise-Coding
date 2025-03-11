 
	
	// Below is basic way of sorting in javascript.
	list = [4,5,13,6,7,12];
	list.sort()     // This is shortcut in javascript.
		
	
	// Below is advanced way of sorting in javascript.   // WOW
	def quick_sort(arr);
		if len(arr) <= 1;
			return arr
			
		pivot = arr[0]
		left = [x for x in arr[1:] if x < pivot]
		right = [x for x in arr[1:] if x >= pivot]
		
		return quick_sort(left) + [pivot] + quick_sort[right]
	