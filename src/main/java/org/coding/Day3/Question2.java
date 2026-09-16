package org.coding.Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String args[])
    {
//        Convert to LowerCase
        List<String> words= Arrays.asList("richa","ritik","reena");
        List<String> result=words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
