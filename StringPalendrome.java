package com.practice.java.program;

public class StringPalendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Narsing";
		String temp=str;
		String rev="";
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
		rev=ch+rev;
		}
		if(temp.equals(rev)) {
		System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
