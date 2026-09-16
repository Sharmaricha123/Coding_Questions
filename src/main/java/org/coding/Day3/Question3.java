package org.coding.Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {

    public static void main(String args[])
    {
//        Find Strings starting with r
        List<String> words= Arrays.asList("richa","ritik","reena","tina","Rich");
        List<String> result=words.stream()
                .filter(str->str.startsWith("r"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
