package com.learnings.git;

import java.util.Scanner;

public class SortStringClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch = s.toCharArray();
        char temp;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }

        }
        System.out.println(new String(ch));
    }
}