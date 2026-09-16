package org.coding.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
    public static void main(String args[])
    {
//        Count Elements

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,100);

        long result=numbers.stream()
                        .count();
        System.out.println(result);

    }
}
