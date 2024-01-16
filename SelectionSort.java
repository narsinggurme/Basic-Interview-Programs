package com.practice.java.program;

public class SelectionSort {
	static void selectionSort(int arr[]) {
		int n =arr.length;
		for(int i=0; i<n-1; i++) {
			int mid=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[mid]) {
					mid=j;
				}
			}
			int temp=arr[mid];
			arr[mid]= arr[i];
			arr[i]=temp;
		}
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,45,6,7,89,2};
		selectionSort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
		

	}

}
