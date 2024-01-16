package com.practice.java.program;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,3,5,2,3,6,7,1};
		HashSet<Integer> hs = new HashSet<>();
		for(int i:arr) {
			hs.add(i);
		}
		for(Integer i : hs) {
			arr[i]=i;
			System.out.print(arr[i]+" ");
		}

	}

}
