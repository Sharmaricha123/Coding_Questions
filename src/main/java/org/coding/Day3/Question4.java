package org.coding.Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {

    public static void main(String args[])
    {
//       Collect string having length greater than 5
        List<String> words= Arrays.asList("richa","ritik","reena","richasharma");
        List<String> result=words.stream()
                .filter(str->str.length()>5)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
