package com.practice.java.program;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "Naarsigrsing";
		str=str.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c:str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		int first = -1;
		
		for(char c : str.toCharArray()) {
			if(hm.get(c)==1) {
				first=c;
				break;
			}
		}
		if(first != -1) {
			System.out.println((char)first);
		}else {
			System.out.println("Not present repeat character in string");
		}
		
//		String str="Tudip Technologies";
//		str=str.toLowerCase();
//		Map<Character, Integer> hm =  new HashMap<>();
//		for(char c:str.toCharArray()) {
//			hm.put(c, hm.getOrDefault(c, 0)+1);
//		} 
//		char a = ' ';
//		for(char c:str.toCharArray()) {
//			if(hm.get(c)==1) {
//				a=c;
//				break;
//			}
//		}
//		if(a != ' ') {
//			System.out.println(a);
//		}else {
//			System.out.println("repeat char is not prsent");
//		}

	}

}
