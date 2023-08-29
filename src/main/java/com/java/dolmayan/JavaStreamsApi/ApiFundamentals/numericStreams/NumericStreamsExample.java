package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.numericStreams;

import java.util.Arrays;
import java.util.List;

public class NumericStreamsExample {

    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (x,y) -> x+y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of N Numbers :" + sumOfNumbers(integerList) );
    }
}
