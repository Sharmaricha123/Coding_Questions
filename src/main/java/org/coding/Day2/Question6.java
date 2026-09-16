package org.coding.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String args[])
    {
//        Find sum of numbers
//        numbers.stream() gives me a Stream<Integer>. mapToInt() converts the Integer objects into primitive int values and gives me an IntStream,
//        which provides operations like sum(), average(), min() and max()

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10,100);

        Integer result=numbers.stream()
                        .mapToInt(Integer::intValue)
                                .sum();
        System.out.println(result);

    }
}
