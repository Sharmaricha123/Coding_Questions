package org.coding.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String args[]) {

//    Find duplicate Numbers
        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40);

        List<Integer> result=numbers.stream()
                .filter(num->numbers.indexOf(num)!=numbers.lastIndexOf(num))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }


}
