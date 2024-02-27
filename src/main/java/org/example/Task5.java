package org.example;

import java.util.stream.Stream;

public class Task5 {
    public static Stream<Long> linealGenerator(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = linealGenerator(System.currentTimeMillis(), a, c, m)
                .limit(10);
        randomStream.forEach(System.out::println);
    }
}

