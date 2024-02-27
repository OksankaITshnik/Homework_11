package org.example;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static String filterOddIndexedNames(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i += 2) {
            result.append(i+1).append(". " + names.get(i) + ", ");
        }
        return result.toString().replaceAll(", $", "");
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Oksana","Vita", "Dani", "mika", "pedro", "Hugo", "Newnam");
        System.out.println(Task1.filterOddIndexedNames(input));
    }
}