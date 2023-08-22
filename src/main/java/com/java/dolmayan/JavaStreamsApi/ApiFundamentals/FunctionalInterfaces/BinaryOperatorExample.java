package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) ->a*b;

        System.out.println(binaryOperator.apply(8,8));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

        System.out.println("Result of MaxBy is : " + maxBy.apply(4,5));
        System.out.println("Result of MaxBy is : " + minBy.apply(4,5));

    }
}
