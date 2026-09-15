package org.coding.Day1;

import java.util.stream.IntStream;

public class Question2 {
    public static void main(String args[]) {
//        2. Check Palindrome

        String str="madam";

        boolean result= IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        System.out.println(result);
    }

}
