package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.FunctionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;

import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");
    public static void main(String[] args) {

        System.out.println("Result is : "+ function.apply("java 8"));

        System.out.println("Result of andthen is : "+ function.andThen(addSomeString).apply("java 8 "));

    }
}
