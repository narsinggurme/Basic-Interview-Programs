package com.practice.java.program;

import java.util.HashSet;

public class ReapitngAllNumber {

		public static void main(String[] args) {
	        Integer[] myArray = {1, 2, 3, 2, 4, 5, 3, 5};

	        HashSet<Integer> uniqueSet = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (Integer element : myArray) {
	            if (!uniqueSet.add(element)) {
	                // If the element is already present, it's a duplicate
		            System.out.println(element);

	               // duplicates.add(element);
	            }
	        }

	        // Displaying the duplicate elements
//	        System.out.println("Duplicate elements in the array:");
//	        for (Integer duplicate : duplicates) {
//	            System.out.println(duplicate);
//	        }
	    }
//		for(int i=0;  i<n-1;  i++) {
//			for(int j=i+1; j<n;  j++) {
//				if(arr[i]==arr[j] && i!=j) {
//					System.out.print(arr[j]+" ");
//				}
//			}
//		}
		
	}


