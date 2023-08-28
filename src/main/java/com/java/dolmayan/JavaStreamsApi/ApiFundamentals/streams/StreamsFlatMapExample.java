package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
                .sorted()
                .collect(toList());

        return studentActivities;
    }

    public static Long getStudentActivitiesCount(){
        long noOfStudentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();


        return noOfStudentActivities;
    }

    public static  Map<String, Integer> listofStudents(){
        Map<String, Integer> mapStudent = new HashMap<>();

          StudentDataBase.getAllStudents()
                .stream()
                //.map(Student::getName)
                .forEach(students ->{
                     mapStudent.put(students.getName(),students.getGradeLevel());

                });


        return mapStudent;

    }
    public static void main(String[] args) {

        System.out.println("printStudentActivities : "+ printStudentActivities());
        System.out.println("Number of activities : "+ getStudentActivitiesCount());

        System.out.println("******************\nList of names : "+ listofStudents());
    }
}
