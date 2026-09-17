package org.coding.Day4;

public class Question6 {

    public static void main(String args[]) {

//    Find first repeated Character

        String words="swiss";
        Character result=words.chars()
                        .mapToObj(c->(char)c)
                                .filter(ch->words.indexOf(ch)!=words.lastIndexOf(ch))
                                        .distinct()
                                                .findFirst()
                                                        .orElse(null);

        System.out.println(result);
    }


}
