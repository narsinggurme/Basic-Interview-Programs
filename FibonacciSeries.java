package com.practice.java.program;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int a=0;
		int b=1;
		System.out.print(a+ " ");
		for(int i=2; i<=15; i++) {
			int temp=a+b;
			b=a;
			a=temp;
			System.out.print(a+" ");
		}
		

	}

}
