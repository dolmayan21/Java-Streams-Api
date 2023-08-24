package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.Exercises;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;
public class Exercise1 {

    public static List<String> printUniqueStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;

    }

    public static long getStudentActivitiesCount() {

        long totalActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                //.flatMap(List::stream)
                .distinct()
                .count();

        return totalActivities;

    }
    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());

        return studentActivities;

    }
    public static void main(String[] args) {

        System.out.println(StudentDataBase.getAllStudents());
        System.out.println("**********************\n\n");

        System.out.println(printStudentActivities());

        System.out.println(getStudentActivitiesCount());

    }
}
