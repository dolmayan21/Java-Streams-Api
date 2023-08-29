package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams_terminal;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxyByExaple {

    public static Optional<Student> minBy_example(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_example(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {

        System.out.println("Min GPA : " + minBy_example());
        System.out.println("Max GPA : " + maxBy_example());

    }
}
