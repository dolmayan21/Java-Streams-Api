package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams_terminal;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase.getAllStudents;
import static java.util.stream.Collectors.*;

public class StreamsMappingExample {


    public static void main(String[] args) {

       List<String> namesList =  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));

        StudentDataBase.getAllStudents()  // Same thing
                .stream()
                .map(Student::getName)   // mapping
                .collect( toList());

        System.out.println("NamesList : "+ namesList);

        Set<String> namesSet =  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));

        System.out.println("namesSet : "+ namesSet);
    }
}
