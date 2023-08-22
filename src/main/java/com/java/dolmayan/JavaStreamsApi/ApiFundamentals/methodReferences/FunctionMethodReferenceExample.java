package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.methodReferences;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionMethodReferenceExample {

   static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();

   static UnaryOperator<String> toUpperCaseLambda2 = (s) -> s.toUpperCase();

   static Function<String, String> toUpperMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperMethodReference.apply("java 8"));
    }
}
