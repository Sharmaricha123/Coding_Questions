package org.coding.Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String args[])
    {
//        Convert to UpperCase
        List<String> words= Arrays.asList("richa","ritik","reena");
        List<String> result=words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
