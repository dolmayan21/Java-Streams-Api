package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams_terminal;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public  static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(counting());
    }

    public  static long count2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println("Number of students : "+ count());
        System.out.println("Number of students GPA 3.9 : "+ count2());
    }

}
