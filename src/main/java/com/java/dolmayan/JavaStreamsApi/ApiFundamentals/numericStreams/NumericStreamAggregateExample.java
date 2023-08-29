package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is  : "+sum);

        OptionalInt maxValue = IntStream.rangeClosed(1,50).max();

        System.out.println("Optional max int : "+ maxValue.getAsInt());


        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();
        System.out.println(optionalLong);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);

    }
}
