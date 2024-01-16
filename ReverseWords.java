package com.practice.java.program;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="My name is Gurme narsing";
		String words[]=str.trim().split("\\s+");
		
		
		int l =0, r=words.length-1;
		while(l<r) {
			String temp=words[l];
			words[l]=words[r];
			words[r]=temp;
			l++;
			r--;
		}
		System.out.println(String.join(" ", words));
		
		
		

	}

}
