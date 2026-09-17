package org.coding.Day4;

import java.util.List;
import java.util.stream.Collectors;

public class Question7 {

    public static void main(String args[]) {

//    Find repeated Character

        String words="swissw";
        String result=words.chars()
                        .mapToObj(c->(char)c)
                        .filter(ch->words.indexOf(ch)!=words.lastIndexOf(ch))
                        .distinct()
                        .map(String::valueOf)
                        .collect(Collectors.joining(","));

        System.out.println(result);
    }


}
