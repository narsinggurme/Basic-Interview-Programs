package com.practice.java.program;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,2,4,3};
		 if(nums.length==0){
	            System.out.println("0");
	        }
	        int a=1;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i]!=nums[i-1]){
	                nums[a]=nums[i];
	                a++;
	            }
	        }
	        System.out.println(a+" ");

	}

}
