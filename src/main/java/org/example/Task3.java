package org.example;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {


    public static String sortNumbers(String[] arrays) {
        String result = Arrays.stream(arrays)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return result;
    }

    public static void main(String[] args) {


         String[] inputArray = {"1, 2, 0", "4, 5"};
         String result = sortNumbers(inputArray);

        System.out.println(result);
    }

}
