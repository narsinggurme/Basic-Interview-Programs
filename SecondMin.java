package com.practice.java.program;

public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1};
		int min=Integer.MAX_VALUE;
		int s_min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				s_min=min;
				min=arr[i];
			}if(arr[i]<s_min && arr[i]!=min) {
				s_min=arr[i];
			}
		}
		System.out.println(s_min);
		System.out.println(min);
	}

}
