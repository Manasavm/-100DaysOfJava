package com.learnings.git;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please type any sentence: ");
        String str = in.nextLine();
        String s = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        String a[] = s.split(" ");
        String b = " ";
        for (int i = a.length - 1; i >= 0; i--) {
            b = b + a[i] +" ";

        }
        System.out.print(b);
    }
}



