package com.learnings.git;

import java.util.Scanner;

public class countSpecialChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch) == false && Character.isSpaceChar(ch)==false) {
                ++count;
            }

        }
        System.out.print("Total number of special characters are: " +count);

    }
}