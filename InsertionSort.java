public class InsertionSort implements SortingAlgorithm{

	public void sort(int [] a){
		int n = a.length,key =0, j = 0;
		for(int i = 1; i< n; ++i){ //For every single thing here
			key = a[i];			
			j = i -1;

			while(j >= 0 && a[j] > key){ 
				a[j+1] = a[j];	// Everything greater than key will be moved +1 postion.
				j = j-1;
			}
			a[j+1] = key;
		}
	}
}
//I AM A GEEK NEEDING A GEEK
//https://www.geeksforgeeks.org/insertion-sort/