package org.example;

import java.util.HashSet;

public class FirStRepertingCharacter {

    public static void main(String[] str) {

        String str1 = "abbcggfcs";

        char[] ch = str1.toCharArray();

        HashSet<Character> set = new HashSet<Character>();

        for (char ch1 : ch) {

            if (set.contains(ch1)) {
                System.out.println(" first repeating character is " + ch1);
                return;
            } else {
                set.add(ch1);
            }
        }
        System.out.println("-1");
    }


    }

