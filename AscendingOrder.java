package com.practice.java.program;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,2,4,7,8,0};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.print(arr[i]+" ");
		}

	}

}
