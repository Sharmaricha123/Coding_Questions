package org.coding.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String args[])
    {
//        Find Even Numbers

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10);

        List<Integer> result=numbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
