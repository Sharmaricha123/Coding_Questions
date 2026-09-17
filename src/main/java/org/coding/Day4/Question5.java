package org.coding.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question5 {

    public static void main(String args[]) {

//    Find first non-repeated Character

        String words="swiss";
        Character result=words.chars()
                        .mapToObj(c->(char)c)
                                .filter(ch->words.indexOf(ch)==words.lastIndexOf(ch))
                                        .distinct()
                                                .findFirst()
                                                        .orElse(null);

        System.out.println(result);
    }


}
