package sortingAlgo;

public class HeapSort {
	
	public static int N;
	public static void sort(int[] arr){
		N = arr.length - 1;
		heapify(arr, N);
		for(int i = N; i > 0; i--) {
			swap(arr, 0, i);
			N--;
			maxHeap(arr, 0);
		}
	}
	private static void heapify(int[] arr, int N) {
		// TODO Auto-generated method stub
		for(int i = N/2; i >= 0; i--) {
			maxHeap(arr, i);
		}
	}
	private static void maxHeap(int[] arr, int i) {
		// TODO Auto-generated method stub
		int left = 2 * i;
		int right = left + 1;
		int max = i;
		if (left <= N && arr[left] > arr[max]) {
			max = left;
		}
		if (right <= N && arr[right] > arr[max]) {
			max = right;
		}
		if (max != i) {
			swap(arr, max, i);
			maxHeap(arr, max);
		}
	}
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
