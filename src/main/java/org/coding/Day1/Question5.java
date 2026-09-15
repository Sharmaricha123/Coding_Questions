package org.coding.Day1;

import java.util.stream.IntStream;

public class Question5 {
    public static void main(String args[]) {

//        5. Count Consonants
        String str="madam";

        long count=str
                .toLowerCase()
                .chars()
                .filter(c-> c>='a' && c<='z')
                .filter(c-> c!='u' &&
                        c!='o' &&
                        c!='i' &&
                        c!='e' &&
                        c!='a')
                .count();
        System.out.println(count);
    }

}
