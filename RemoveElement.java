package com.practice.java.program;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,3,6,4,5,7,8,5};
		int n=6;
		int g=0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i]!=n) {
				arr[g]=arr[i];
				g++;
			}
		}
		System.out.println(g);

	}

}
