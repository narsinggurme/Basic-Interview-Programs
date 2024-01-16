package com.practice.java.program;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		if (n < 0) {
			System.out.println("factorial is not defined for nogative number");
		} else if (n == 0 || n == 1) {
			System.out.println("1");
		} else {
			int fact=1;
			for (int i = 1; i <=n; i++) {
				fact *= i;
			}
			System.out.println(fact);
		}
		

	}

}
