package org.example;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static String formatOddIndexNames (List<String> names) {
        return IntStream.range(0,names.size())
                .filter( i-> i % 2 == 0)
                .mapToObj(i ->(i+1)+"."+names.get(i))
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<String> input = List.of("Oksana","Vita", "Dani", "mika", "pedro", "Hugo", "Newnam") ;
       // String result = formatOddIndexNames(input);
        System.out.println(formatOddIndexNames(input));
    }
}