package org.coding.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question4 {

    public static void main(String args[]) {

//    Find Frequency of each Character

        String words="swiss";

        Map<Character,Long> result=words.chars()
                .mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                                ));

        System.out.println(result);
    }


}
