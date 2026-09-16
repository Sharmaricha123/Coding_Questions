package org.coding.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String args[])
    {
//        Find Maximum Numbers

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,100,100);

        Integer result=numbers.stream()
                        .max(Integer::compareTo)
                                .get();
        System.out.println(result);

    }
}
