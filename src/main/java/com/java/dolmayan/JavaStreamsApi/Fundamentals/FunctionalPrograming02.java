package com.java.dolmayan.JavaStreamsApi.Fundamentals;

import java.sql.SQLOutput;
import java.util.List;

public class FunctionalPrograming02 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        int sum = addListFunctional(numbers);

        System.out.println(sum);

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
