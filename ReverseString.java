package com.practice.java.program;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "narsing";
		String rev="";
		String vow="";
		char ch;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u' ) {
				vow=vow+str.charAt(i);
				
				
			}
			System.out.println(vow+" ");
			
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	
	}

}
