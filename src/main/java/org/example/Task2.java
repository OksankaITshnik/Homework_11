package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Task2{

        public static List<String> sortNames(List<String> strings) {
            return strings.stream()
                    .map(String::toUpperCase)
                    .sorted((s1, s2) -> s2.compareTo(s1))
                    .collect(Collectors.toList());
        }

        public static void main(String[] args) {

            List<String> inputStrings = Arrays.asList("Mika","Oxi","Dani","Vita","Nada");
            List<String> result = sortNames(inputStrings);

            result.forEach(System.out::println);
        }
    }