package org.coding.Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question10 {

    public static void main(String args[])
    {
//        Sort String by length

        List<String> words= Arrays.asList("richa","ritik","reenasharma","richa");
        List<String> result=words.stream()
                .distinct()
                                .collect(Collectors.toList());
        System.out.println(result);
    }
}
