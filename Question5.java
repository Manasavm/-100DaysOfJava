package com.learnings.git;

public class Question5 {
    public static void main(String[] args) {
            int n = 15;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if(i==0||i==n-1||j==0||i+j<=(n)/2||i-j>=(n-1)/2){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }
    }


