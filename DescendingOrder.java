package com.practice.java.program;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,2,4,7,8};
		int n=arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		

	}

}
