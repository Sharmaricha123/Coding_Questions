package org.coding.Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {

    public static void main(String args[])
    {
//        Find longest string

        List<String> words= Arrays.asList("richa","ritik","reenasharma");
        String result=words.stream()
                        .max(Comparator.comparing(String::length))
                                .orElse(null);
        System.out.println(result);
    }
}
