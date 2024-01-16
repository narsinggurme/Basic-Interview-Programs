package com.practice.java.program;

import java.util.TreeMap;
import java.util.Scanner;

public class IntegerToRoman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:-  ");
        int n = sc.nextInt();

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "I");
        tm.put(4, "IV");
        tm.put(5, "V");
        tm.put(9, "IX");
        tm.put(10, "X");
        tm.put(40, "XL");
        tm.put(50, "L");
        tm.put(90, "XC");
        tm.put(100, "C");
        tm.put(400, "CD");
        tm.put(500, "D");
        tm.put(900, "CM");
        tm.put(1000, "M");

        StringBuilder s = new StringBuilder();
        while (n > 0) {
            int key = tm.floorKey(n);
            s.append(tm.get(key));
            n -= key;
        }

        System.out.println("Roman numeral: " + s.toString());
        sc.close();
    }
}
