package org.coding.Day4;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question9 {

    public static void main(String args[]) {

        String name = null;

        String result = Optional.ofNullable(name)
                .orElse("Default");

        System.out.println(result);
    }


}
