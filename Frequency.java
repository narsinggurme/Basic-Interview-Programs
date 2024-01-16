package com.practice.java.program;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,1,1,2,3,4,4,12};
//		int max=Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		int freq [] = new int[max+1];
//		
//		for(int i=0; i<arr.length; i++) {
//			freq[arr[i]]++;
//		}
//		for(int i=0; i<freq.length; i++) {
//			if(freq[i]>1) 
//				System.out.println(i+" -->"+freq[i]);
//			
//		}
		int arr[]= {2,4,5,2,3,4,5,6};
		int mx= Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>mx) {
				mx=i;
			}
		}
		int freq [] = new int[mx+1];
		
		for(int i:arr) {
			freq[i]++;
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i]>0) {
				System.out.println(i+" -->"+freq[i]);
			}
		}

	}

}
