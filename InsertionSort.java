package com.practice.java.program;

public class InsertionSort {
	static void insertionSort(int arr[]) {
		int n =arr.length;
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,8,9,2,5};
		insertionSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
