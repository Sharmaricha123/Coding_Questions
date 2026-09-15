package org.coding.Day1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question1 {
    public static void main(String args[])
    {
//        1. Reverse a String
        String str="Java";
        String result=new StringBuilder(str)
                .reverse()
                .toString();
        System.out.println(result);

        String result1= IntStream.range(0,str.length())
                .mapToObj(i->String.valueOf(str.charAt(str.length()-i-1)))
                .collect(Collectors.joining());

        System.out.println(result1);
    }
}
