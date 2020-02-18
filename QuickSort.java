public class QuickSort implements SortingAlgorithm{

	public void sort(int [] a){
		sort(a, 0,a.length-1); //Array , Low , High
	}


	public void sort(int[] arr, int low, int high){
		if (low < high){
			int partIndex = partition (arr, low, high); // partition the index 
			sort(arr, low, partIndex-1);				// so we can recusively call the two halves
			sort(arr, partIndex+1, high);
		}
	}

	public int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = (low - 1);		//Index of smaller element

		for(int j = low; j< high; j++){
			if(arr[j] < pivot){
				i++;
				//Swap if current element is smaller than pivot [pivot starts from end]
				int temp = arr[i];
				arr[i]   = arr[j];
				arr[j]   = temp;
			}
		}
		//Swap with arr [high]
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high]= temp;

		return i+1;

	}
}
//https://www.geeksforgeeks.org/quick-sort/