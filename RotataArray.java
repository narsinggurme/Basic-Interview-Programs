package com.practice.java.program;

public class RotataArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int a=4;
		int a1 []= new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			a1[i]=arr[(i+a) % arr.length];
			System.out.print(a1[i]+" ");
			
		}
		
		}

}
