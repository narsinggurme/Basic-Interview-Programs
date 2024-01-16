package com.practice.java.program;

public class PalendromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1234321;
		int temp=a;
		int rev = 0;
			while(a>0){
			int b = a%10;
			rev= rev*10+b;
			a/=10;
		}
		if(temp==rev) {
			System.out.println(temp+" Number ia palendrome");
		}else {
			System.out.println("Not palendrome");
		}

	}

}
