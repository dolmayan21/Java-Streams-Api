package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){

       return integerList.stream()
                .reduce(0,(x,y)-> x>y ? x:y);
    }

    public static Optional<Integer> findMaxvalueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y)->x>y ? x:y);
    }

    public static List<Integer>  integerList = Arrays.asList(6,7,8,9,10);

    public static List<Integer>  integerList1 = new ArrayList<>();

    public static Optional<Integer> findMinValue(List<Integer> integerList){

        return integerList.stream()
                .reduce((x,y)-> x>y ? y:x);
    }
    public static void main(String[] args) {

        System.out.println("\nThis is the max value : " +findMaxValue(integerList));
        System.out.println("\nThis is the min value : " +findMinValue(integerList));

        Optional<Integer> maxValueOptional = findMaxvalueOptional(integerList);
        if(maxValueOptional.isPresent()){
            System.out.println("MaxValue using optional : " + maxValueOptional.get());
        }else{
            System.out.println("No max value found.");
        }

        Optional<Integer> minValueOptioonal = findMinValue(integerList);
        if(minValueOptioonal.isPresent()){
            System.out.println("\nThis is the min value : " + findMinValue(integerList).get());
        }else{
            System.out.println("There's no min value");
        }

    }
}
