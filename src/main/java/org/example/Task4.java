package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Task4 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> builder = Stream.builder();
        while (true) {

            Optional<T> optionalFirst = first.findFirst();
            Optional<T> optionalSecond = second.findFirst();
            if (!optionalFirst.isPresent() || !optionalSecond.isPresent()) {
                break;
            }
            builder.accept(optionalFirst.get());
            builder.accept(optionalSecond.get());
        }

        return builder.build();
    }
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 20, 30, 40, 50, 60);

        Stream<Integer> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}




