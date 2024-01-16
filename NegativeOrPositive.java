package com.practice.java.program;

import java.util.Scanner;

public class NegativeOrPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter a number: ");
		int n = sc.nextInt();
		if(n>=0) {
			System.out.println("Number is positive...");
		}else {
			System.out.println("Number is negative...");
		}
		sc.close();

	}

}
