package org.coding.Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {

    public static void main(String args[])
    {
//        Sort String by length in descending Order

        List<String> words= Arrays.asList("richa","ritik","reenasharma");
        List<String> result=words.stream()
                        .sorted(Comparator.comparing(String::length).reversed())
                                .collect(Collectors.toList());
        System.out.println(result);
    }
}
