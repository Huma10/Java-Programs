package org.example.streamconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Huma");
        stringList.add("Sheeba");
        stringList.add("Nanu");

      String word =  stringList.stream().collect(Collectors.joining(",","{","}"));
        System.out.println(word);
    }
}
