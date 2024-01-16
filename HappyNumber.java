package com.practice.java.program;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			int temp=arr[i];
			sum=sum*10+temp;
		}
		int a = sum+1;
		String s= Integer.toString(a); 
		int array [] = new int[s.length()];
		for(int i=array.length-1; i>=0; i--) {
			int temp=a%10;
			a/=10;
			array[i]=temp;
		
			
		}
		for(int i=0; i<s.length(); i++) {
			System.out.print(array[i]+" ");
			
		}
		

	}

}
