package org.coding.Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question6 {

    public static void main(String args[])
    {
//        Find shortest string
        
        List<String> words= Arrays.asList("richa","ritik","reena");
        String result=words.stream()
                        .min(Comparator.comparing(String::length))
                                .orElse(null);
        System.out.println(result);
    }
}
