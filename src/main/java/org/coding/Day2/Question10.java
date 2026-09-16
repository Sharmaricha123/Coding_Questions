package org.coding.Day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question10 {
    public static void main(String args[])
    {
//        Sort in descending Order

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,100);

        List<Integer> result=numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
