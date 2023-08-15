package com.java.dolmayan.JavaStreamsApi;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FunctionalPrograming {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        //printAllNumbersInListStructured(numbers);
        printEvenNumbers(numbers);
    }

    private static boolean isEven(int number){
        return number%2 == 0;
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        numbers.forEach(System.out::println); // Method Reference
    }

    private static void printEvenNumbers(List<Integer> numbers){
        numbers.stream()   //Stream is a sequence of elements
                //.filter(FunctionalPrograming::isEven)
                .filter(number -> number%2 ==0)
                .forEach(System.out::println);
    }

}