package com.practice.java.program;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,5,4,2};
		int mx=Integer.MIN_VALUE;
		int s_mx=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>mx) {
				s_mx=mx;
				mx=i;
			}if(i>s_mx && i !=mx) {
				s_mx=i;
			}
			
		}
		System.out.println("Second Largest element is: "+s_mx);
		System.out.println("Largest element is: "+mx);
		System.out.println("----------------------------");
		
		int min=Integer.MAX_VALUE;
		int s_min=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<min) {
				s_min=min;
				min=i;
			}if(i<s_min && i!=min) {
				s_min=i;
			}
		}
		System.out.println("Second smallest element is: "+s_min);
		System.out.println("smallest element is: "+min);
	}

}
