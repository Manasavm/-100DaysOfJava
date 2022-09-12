package com.learnings.git;

import java.util.Scanner;

public class PangramOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean[] letters = new boolean[26];
        int index = 0;
        int flag = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if (str.charAt(i)>= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            letters[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (letters[i] == false) {
                flag = 0;
            }
        }
            System.out.println("String: " + str);
            if (flag == 1) {
                System.out.println("The string is pangram");
            } else {
                System.out.println("The string is not pangram");
            }

        }
    }


