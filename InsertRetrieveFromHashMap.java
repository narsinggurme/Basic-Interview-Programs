package com.practice.java.program;
import java.util.*;
public class InsertRetrieveFromHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm =  new HashMap<>();
		hm.put(0, "Narsing");
		hm.put(2, "Aditya");
		hm.put(3, "Nishant");
		hm.put(1, "Vedant");
		System.out.println("key  |"+ "  value");
		System.out.println("---------------");
		
		for(int i=0; i<hm.size();  i++) {
			System.out.println(i+ "    |  "+hm.get(i));
			
		}

	}

}
