package org.coding.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question3 {

    public static void main(String args[]) {

//    Find Frequency of Each Integer

        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5,6,5,4,3,2,1);

        Map<Integer,Long> result=numbers.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(result);
    }


}
