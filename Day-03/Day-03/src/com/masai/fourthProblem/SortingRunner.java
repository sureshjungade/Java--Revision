package com.masai.fourthProblem;

import java.util.Arrays;

public class SortingRunner {

	public static void main(String[] args) {
		
		SortingAlgorithm sr = new BubbleSort();
		
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionsort = new InsertionSort();
		
		int arr [] = {5,7,9,10,7,8};
		
		System.out.println("Bubble Sort");
		int ans [] = bubbleSort.sort(arr, arr.length);
		
		System.out.println(Arrays.toString(ans));
		
		
		System.out.println("Selection Sort");
		int ans1 [] = selectionSort.sort(arr, arr.length);
		
		System.out.println(Arrays.toString(ans1));
		
		System.out.println("Insertion Sort");
		int ans2 [] = insertionsort.sort(arr, arr.length);
		
		System.out.println(Arrays.toString(ans2));
		
	}

	
}
