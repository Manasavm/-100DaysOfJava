package com.learnings.git;

import java.util.Scanner;

public class RepeatedCharClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] a = str.toCharArray();
        for(int i = 0;i<str.length();i++){
            for(int j = i+1;j<str.length();j++){
                if((a[i]==a[j])){
                    System.out.println("Repeated character is: " +a[j]);
                    break;
                }
            }
         }
    }
}


