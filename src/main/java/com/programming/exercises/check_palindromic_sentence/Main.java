package com.programming.exercises.check_palindromic_sentence;

import java.util.*;

class Main {

    public static boolean isStrPalindrome(String str) {

        int lo = 0;
        int hi = str.length() - 1;

        while (lo < hi) {
            char ch1 = str.charAt(lo);
            char ch2 = str.charAt(hi);

            if (ch1 != ch2) return false;
            lo++;
            hi--;
        }

        return true;
    }

    public static boolean isSentencePalindrome(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if((ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >='0' && ch<='9')) {
            if (ch >= 'A' && ch <= 'Z') res += (char) (ch + 32);
            else res += ch;
        } else continue;
    }
        
       if(

    isStrPalindrome(res))return true;
        return false;
}

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();

        if (isSentencePalindrome(sentence)) System.out.println(true);
        else System.out.println(false);
    }
} 
