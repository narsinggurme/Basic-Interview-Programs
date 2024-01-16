package com.practice.java.program;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,4};
		int mx=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>mx)
				mx=i;
		}
		System.out.println(mx);

	}

}
