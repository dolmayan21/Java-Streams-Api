package com.java.dolmayan.JavaStreamsApi.apifundamentals;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FunctionalPrograming01 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

        // courses.stream().forEach(System.out::println);

        // courses.stream().filter(x -> x.contains("Spring")).forEach(System.out::println);

        //  courses.stream().filter(x -> x.length()>=4).forEach(System.out::println);

        courses.stream().map(x-> x + "  "+ x.length()).forEach(System.out::println);

        //printAllNumbersInListStructured(numbers);
        // printEvenNumbers(numbers);
        //printOddNumbers(numbers);
        //printSquaresOfEvenNumbers(numbers);
        //printSquaresOfOddsNumbers(numbers);


    }

    private static void printSquaresOfOddsNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x%2 !=0)
                .map(x-> x*x)
                .forEach(System.out::println);
    }

    private static void printCubesOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x%2 ==0)
                .map(x-> x*x*x)
                .forEach(System.out::println);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 !=0)
                .forEach(System.out::println);
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