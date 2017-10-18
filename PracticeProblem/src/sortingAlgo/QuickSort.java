package sortingAlgo;

public class QuickSort {
	
	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int pivot = i;
		int lower = i;
		int higher = j;
		boolean forward = true;
		if (i >= j) {
			return;
		}
		while(lower <= higher) {
			if(forward) {
				if(arr[pivot] >= arr[higher]) {
					swap(arr, pivot, higher);
					pivot = higher;
					forward = false;
				}
				higher--;
			} else {
				if(arr[pivot] <= arr[lower]) {
					swap(arr, lower, pivot);
					pivot = lower;
					forward = true;
				}
				lower++;
			}
		}
		sort(arr, i, pivot - 1);
		sort(arr, pivot + 1, j);
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void sortCenterPivot(int[] arr) {
		if(arr == null || arr.length == 1) {
			return;
		}
		sortCenterPivot(arr, 0, arr.length - 1);
	}

	private static void sortCenterPivot(int[] arr, int low, int high) {
		int pivot = arr[low + (high - low)/2];
		int i = low, j = high;
		while(i <= j) {
			while(arr[i] < pivot) {
				i++;
			}
			
			while(arr[j] > pivot) {
				j--;
			}
			if(i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		if(low < j) {
			sortCenterPivot(arr, low, j);
		}
		if(i < high) {
			sortCenterPivot(arr, i, high);
		}
	}
}

