package com.practice.java.program;

public class MaxRepeatingElement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,2,1,2,2};
		int max=arr[0];
		int count=1;
		for(int i=0;  i<arr.length; i++) {
			if(arr[i]==max) {
				count++;
			}else if(count>0) {
				count--;
			}else {
				max=arr[i];
				count=1;
			}
		}
		System.out.println(max);

	}

}
