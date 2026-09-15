package org.coding.Day1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question6 {
    public static void main(String args[]) {

//        6. Find Duplicate Characters
        String str="richar";
        String repeatedCharacter=str.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->str.indexOf(ch)!=str.lastIndexOf(ch))
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.joining());
        System.out.println("Repeated Characters: "+repeatedCharacter);
    }

}
