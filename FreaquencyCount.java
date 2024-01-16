package com.practice.java.program;

public class FreaquencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,3,4,5};
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		int freq[] = new int[max+1];
		
		for(int num:arr) {
			freq[num]++;
			
		}
		for(int i=0;  i<freq.length; i++) {
			if(freq[arr[i]]>0) {
				System.out.println(i +"--> "+ freq[i]);
			}
		}
		
		
	}

}
