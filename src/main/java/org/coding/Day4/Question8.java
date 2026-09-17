package org.coding.Day4;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question8 {

    public static void main(String args[]) {

//    Find frequency of String

        String str = "java spring java kafka spring java";

        Map<String,Long> result= Arrays.stream(str.split(" "))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(result);
    }


}
