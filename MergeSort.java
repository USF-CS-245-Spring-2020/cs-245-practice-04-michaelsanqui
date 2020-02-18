public class MergeSort implements SortingAlgorithm{

//Recursive
	public void sort (int [] a){
		sort(a, 0,(a.length -1)); //Index, Left, Right
	}

	public void sort(int [] arr, int left, int right){
		if(left < right){
			int mid = (left+right) / 2;

			sort(arr, left, mid);
			sort(arr, mid+1, right);//Mid +1 for left side priority
			merge(arr, left, mid, right);
		}	
	}

	public void merge(int [] arr, int left, int mid, int right){
		//Two subarray sizes to be merged
		int num1 = mid - left +1;
		int num2 = right - mid;

		/* Create temp arrays 
		& copy data into them */
		int leftA [] = new int [num1];
		int rightA [] = new int [num2];

		//Left array gets priority in size, if array is odd.
		for(int i = 0; i< num1; ++i)
			leftA[i] = arr[left + i];
		for(int j = 0; j< num2; ++j)
			rightA[j]= arr[mid+ 1 + j];

		/* Merge Temp Arrays*/
		int index1 = 0, index2 = 0, indexSub = left;
		while (index1 < num1 && index2 < num2){
			if(leftA[index1] <= rightA[index2])
				arr[indexSub++] = leftA[index1++];
			else
				arr[indexSub++] = rightA[index2++];
		} 
		//Copy remianing elements of left/right arrays
		while(index1 < num1)
			arr[indexSub++] = leftA[index1++];
		while(index2 < num2)
			arr[indexSub++] = rightA[index2++];
	}

}
//https://www.geeksforgeeks.org/merge-sort/
//Even though i copy, 
//I manually type it; I don't copy and paste so I can digest what's given