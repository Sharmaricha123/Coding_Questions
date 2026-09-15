package org.coding.Day1;

import java.util.stream.Collectors;

public class Question7 {
    public static void main(String args[]) {

//        7. Find Unique Characters
        String str="richar";
        String repeatedCharacter=str
                .chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->str.indexOf(ch)==str.lastIndexOf(ch))
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.joining());
        System.out.println("Unique Characters: "+repeatedCharacter);
    }

}
