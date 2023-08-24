package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class StreamsFlatMapExample {

    public static List<List<String>> printStudentActivities2(){
       List<List<String>> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .collect(toList());

       return studentActivities;
    }

    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .collect(toList());

        return studentActivities;
    }
    public static void main(String[] args) {

        System.out.println("printStudentActivities : "+ printStudentActivities());
    }
}
