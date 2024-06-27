package com.programming.exercises.check_anagrams;

import java.util.*;

class Main {

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> fmap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            int ofreq = fmap.getOrDefault(s1.charAt(i), 0);
            fmap.put(s1.charAt(i), ofreq + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!fmap.containsKey(s2.charAt(i)) || fmap.get(s2.charAt(i)) == 0) {
                return false;
            } else {
                int ofreq = fmap.get(s2.charAt(i));
                fmap.put(s2.charAt(i), ofreq - 1);
            }
        }

        return true;
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        if (isAnagram(str1, str2)) System.out.println(true);
        else System.out.println(false);
    }
}