package com.practice.java.program;
import java.util.*;

public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		int temp=Integer.MAX_VALUE;
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			
				if(al.get(i)<temp) {
				temp=al.get(i);
				
			}
		}
		System.out.println(temp);

	}

}
