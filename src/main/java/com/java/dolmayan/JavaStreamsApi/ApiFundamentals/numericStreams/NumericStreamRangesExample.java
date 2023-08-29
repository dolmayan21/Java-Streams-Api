package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.numericStreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

      IntStream intStream = IntStream.range(1,50);
      IntStream intStream2 = IntStream.rangeClosed(1,50);
        System.out.println("Range Count : " + intStream.count());

        System.out.println("Range Count Closed: " + intStream2.count());


        IntStream.range(1,50).forEach(value -> System.out.println(value + ","));

        IntStream.range(1,50).asDoubleStream()
                .forEach(value -> System.out.println(value + ","));
    }
}
