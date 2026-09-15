package org.coding.Day1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question8 {
    public static void main(String args[]) {

//        8. Find Frequency of Each Character
        String strs = "programming";

        Map<Character,Long> countEachCharacter=strs
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println("Frequency Of Each Character: "+countEachCharacter);
    }

}
