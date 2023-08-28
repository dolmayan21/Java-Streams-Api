package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
         return integerList.stream()
                 //1
                 //3
                 //5
                 //7
                .reduce(1, (a,b) -> a*b);

    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7);


    }
}
