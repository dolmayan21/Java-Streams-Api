package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> fillterStudents(){
      return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female")) //Stream<Student>
                .filter(student -> student.getGpa()>= 3.9)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {

        fillterStudents().forEach(System.out::println);

    }
}
