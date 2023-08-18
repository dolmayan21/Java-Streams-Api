package com.java.dolmayan.JavaStreamsApi.ApiFundamentals;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class FunctionalProgramming03 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        Predicate<Integer> isEvenPredicate = x -> x%2==0;  /// Evaluates this predicate on the given argument.


        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {   //Function descriptor
                return x%2==0;
            }

        };


        Function<Integer, Integer> squareFunction = x -> x * x;  // Applies this function to the given argument

        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {   //Function descriptor
                return x*x;
            }
        };

        Consumer<Integer> sysoutConsumer = System.out::println;   // Performs this operation on the given argument.

        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
            public void accept(Integer x) {   //Function descriptor
                System.out.println(x);
            }
        };

        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysoutConsumer);


        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {   //Function descriptor
                return a+b;
            }
        };

        int sum = numbers.stream().reduce(0, sumBinaryOperator);


    }




}
