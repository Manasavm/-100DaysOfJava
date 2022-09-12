package com.learnings.git;

import java.util.Scanner;

class Count{
    public void vowcon(String str){
        int l = str.length();
        char[] ch = str.toCharArray();
        int vowelCount = 0;
        int consonantsCount = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'
                    ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                vowelCount++;

            }else{
                consonantsCount++;
            }
        }
        System.out.print("Total number of vowels are "+ vowelCount);
        System.out.println(" ");
        System.out.print("Total number of consonants are "+consonantsCount);
    }
    }

public class VowelsConsonants {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    Count c = new Count();
    c.vowcon(str);
    }
}
