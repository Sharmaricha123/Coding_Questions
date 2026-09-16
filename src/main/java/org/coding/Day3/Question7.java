package org.coding.Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {

    public static void main(String args[])
    {
//        Sort strings alphabetically

        List<String> words= Arrays.asList("richa","ritik","reenasharma");
        List<String> result=words.stream()
                        .sorted()
                                .collect(Collectors.toList());
        System.out.println(result);
    }
}
