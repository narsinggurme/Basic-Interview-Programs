package com.practice.java.program;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,6,4,10,-4};
		int mn=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<mn) {
				mn=i;
			}
		}
		System.out.println(mn);

	}

}
