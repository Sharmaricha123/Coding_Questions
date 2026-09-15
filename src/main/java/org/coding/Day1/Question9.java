package org.coding.Day1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String args[]) {

//        9. Remove Duplicate Characters
        String str = "Java";

        String result = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(result);
    }

}
