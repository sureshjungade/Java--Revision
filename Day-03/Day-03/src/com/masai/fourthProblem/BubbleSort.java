package com.masai.fourthProblem;

public class BubbleSort extends SortingAlgorithm{

	public int[] sort(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>=arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		return arr;
		
	}
	
	public void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
}
