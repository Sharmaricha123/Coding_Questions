package org.coding.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String args[])
    {
//        Sort in ascending Order

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,100,1,2);

        List<Integer> result=numbers.stream()
                        .sorted()
                                .collect(Collectors.toList());
        System.out.println(result);

    }
}
