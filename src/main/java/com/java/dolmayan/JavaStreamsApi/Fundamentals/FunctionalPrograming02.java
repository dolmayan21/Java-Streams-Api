package com.java.dolmayan.JavaStreamsApi.Fundamentals;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;

public class FunctionalPrograming02 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Zwagger","Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes", "API" );

        int sum = addListFunctional(numbers);

        //System.out.println(sum);
        int number = 0;

        /*

          number = numbers.stream().reduce(Integer.MIN_VALUE, (x,y) -> x>y ? x:y);
          number = numbers.stream().reduce(Integer.MIN_VALUE, (x,y) -> x>y ? y:x); //   numbers.stream().reduce(0, (x,y) -> x>y ? x:y);
          number = numbers.stream().reduce(Integer.MAX_VALUE, (x,y) -> x>y ? y:x);
          number = numbers.stream().map(x -> x*x).reduce(0, Integer::sum);

          numbers.stream().sorted().forEach(System.out::println);
          courses.stream().sorted().forEach(System.out::println);

          courses.stream().distinct().forEach(System.out::println);

          courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);   // abdef

          courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);   //  zyxw

          courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
         */












       // System.out.println(number);

    }

    private static int sum(int aggregate, int nextNumber){
        System.out.println(aggregate + "  "+ nextNumber);
        return  aggregate + nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                //.reduce(0,FunctionalPrograming02::sum);
                //.reduce(0, (x,y) -> x+y);
                .reduce(0,Integer::sum);
    }
}
