package org.coding.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String args[])
    {
//        Find Minimum Numbers

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,100);

        Integer result=numbers.stream()
                        .min(Integer::compareTo)
                                .get();
        System.out.println(result);

    }
}
