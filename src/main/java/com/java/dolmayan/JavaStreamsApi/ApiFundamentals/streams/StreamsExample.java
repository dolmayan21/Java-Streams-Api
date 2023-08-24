package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        /**
         *  method peek() some sort of debugging
         */

        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentgpaPredicate = student -> student.getGpa()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream() //.parallelStream()
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(studentPredicate)
                .peek((student -> {
                    System.out.println("After 1st filter : "+student);
                }))
                .filter(studentgpaPredicate)
                .peek((student -> {
                    System.out.println("After 2nd filter : "+student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);
    }

}
