package com.practice.java.program;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,8,3,5,6};
		int n=arr.length;
		int sum=0;
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println();
		System.out.println(sum);

	}

}
