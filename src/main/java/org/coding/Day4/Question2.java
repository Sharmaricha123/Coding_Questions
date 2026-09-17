package org.coding.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String args[]) {

//    Find duplicate String
        List<String> words =
                Arrays.asList("richa","ram","ram","ritik","Richa");

        List<String> result=words.stream()

                .filter(word->words.indexOf(word)!=words.lastIndexOf(word))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }


}
