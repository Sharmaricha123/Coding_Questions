package org.coding.Day1;

import java.util.stream.IntStream;

public class Question4 {
    public static void main(String args[]) {

//        4. Count Vowels
        String str="madam";

        long count=str
                .toLowerCase()
                .chars()
                .filter(c->c=='i'||
                        c=='e'||
                        c=='a'||
                        c=='o'||
                        c=='u')
                .count();
        System.out.println(count);

    }

}
