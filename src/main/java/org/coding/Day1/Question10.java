package org.coding.Day1;

import java.util.stream.Collectors;

public class Question10 {
    public static void main(String args[]) {

//        10. First Non-Repeated Character
        String str="ricswisshar";
        Character result=str.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->str.indexOf(ch)==str.lastIndexOf(ch))
                .distinct()
                .findFirst()
                .orElse(null);
        System.out.println("Unique Characters: "+result);
    }

}
