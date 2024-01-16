package com.practice.java.program;

public class AverageOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		int sum=0;
		double avg=0;
		for(int i:arr) {
			sum=sum+i;
		}
		avg=(double)sum/n;
		System.out.println(avg);

	}

}
