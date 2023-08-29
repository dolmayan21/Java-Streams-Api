package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
         return integerList.stream()
                 //1
                 //3
                 //5
                 //7
                .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                //1
                //3
                //5
                //7
                .reduce((a,b) -> a*b);
    }
    public static Optional<Student> getHighestGPAStudent(){

        return StudentDataBase.getAllStudents().stream()
                //Students one by one
                .reduce((s1,s2) ->{
                       if(s1.getGpa()>s2.getGpa()){
                           return s1;
                       } else{
                           return s2;
                       }

                });
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7);
        List<Integer> numbers2 = new ArrayList<>();

        System.out.println(performMultiplication(numbers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(numbers);
        Optional<Integer> result1 = performMultiplicationWithoutIdentity(numbers2);


        System.out.println("Optional is present : " + result.isPresent());
        System.out.println("Optional : " + result.get());

        System.out.println("\nOptional 2 is present : " + result1.isPresent());

        Optional<Student> studentOptional = getHighestGPAStudent();


        if(getHighestGPAStudent().isPresent()){
            getHighestGPAStudent().stream().forEach(System.out::println);
            System.out.println(studentOptional.get());
        }

    }
}
