package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    /**
     * map.
     * You can use it when the input value and the output
     * have the same type.
     */

    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java 8 "));
    }
}
