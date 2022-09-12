package com.learnings.git;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()==str2.length()) {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
               System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }else{
            System.out.println("The given word length is not matching ");
        }

        }

    }

