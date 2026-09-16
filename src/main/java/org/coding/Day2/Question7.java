package org.coding.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String args[])
    {
//        Find average Of Numbers

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,100);

        double result=numbers.stream()
                        .mapToInt(Integer::intValue)
                                .average()
                                        .orElse(0);
        System.out.println(result);

    }
}
