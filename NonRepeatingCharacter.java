package com.practice.java.program;
public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "narasing";
        int n = s.length();
        char r = ' ';

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                r = s.charAt(i);
                break;
            }
        }

        if (r != ' ') {
            System.out.println("The first non-repeating character is: " + r);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
        
    }
}
