package com.practice.java.program;

public class ReverseArray {
	static void reverseArray(int arr[]) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,8,7,6,5,4,3,2,1,0};
		reverseArray(arr);
		
		
	}

}
