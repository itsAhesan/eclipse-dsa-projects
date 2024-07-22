package com.jony.array.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 13, 2, 5, 8, 21, 20, 32, 9 };
		
		int[] quickSort = quickSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(quickSort));
		
		
		

	}
	private static int[] quickSort(int[] arr, int start, int end) {
		if (end - start <= 1) {
			return arr;
		}
		int pivotIndex = findPositionAndArrange(arr, start, end);

		quickSort(arr, start, pivotIndex);
		quickSort(arr, pivotIndex+1, end);

		return arr;
	}

	private static int findPositionAndArrange(int[] arr, int start, int end) {
		int temp = start;// pivot index
		int pivot;
		for (int i = start + 1; i < end; i++) {
			pivot = arr[temp];
			if (pivot > arr[i]) {
				arr[temp] = arr[i];
				arr[i] = arr[temp+1];
				arr[++temp] = pivot;
				//temp++;
			}
		}
		return temp;
	}

}
